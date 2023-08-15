import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RankListWindow extends JFrame {
    
    public RankListWindow(int[] studentMarks) {
        setTitle("Rank List");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea rankListTextArea = new JTextArea();
        rankListTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(rankListTextArea);
        add(scrollPane, BorderLayout.CENTER);

        StringBuilder rankListBuilder = new StringBuilder();
        rankListBuilder.append("Rank List:- \n\n");

        Integer[] ranks = new Integer[studentMarks.length];
        for (int i = 0; i < studentMarks.length; i++) {
            ranks[i] = i;
        }

        Arrays.sort(ranks, (a, b) -> Integer.compare(studentMarks[b], studentMarks[a]));
        
        for (int i = 0; i < studentMarks.length; i++) {
            int rank = i + 1;
            int studentIndex = ranks[i];
            int marks = studentMarks[studentIndex];
            rankListBuilder.append("Rank ").append(rank).append(": Student ").append(studentIndex).append(" (Marks: ").append(marks).append(")\n");
        }

        rankListTextArea.setText(rankListBuilder.toString());

        pack();
        setLocationRelativeTo(null);
    }
}

class ExamDashboard extends JFrame {
    public static void main(String[] args)  {
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.setVisible(true);
    }
    
    private JLabel[] studentLabels;
    private int[] studentAnswerCounts;
    private int[] studentCorrectCounts;
    private int[] studentMarks;
    private JButton[] studentButtons;
    private JButton showRankListButton;
    final List<Integer> answeredQuestions = new ArrayList<>();

    public ExamDashboard(int numStudents) {
        setTitle("Exam Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel backgroundLabel = new JLabel();
        ImageIcon classroomIcon = new ImageIcon("D:/JAVA/OOP_ProjectPLUSPLUS/classroom.png");//copy paste the whole path for image
        backgroundLabel.setIcon(classroomIcon);
        backgroundLabel.setBounds(0, 0, classroomIcon.getIconWidth(), classroomIcon.getIconHeight());
        showRankListButton = new JButton("Show Rank List");
        showRankListButton.setBounds(10, 10, 120, 30);
        showRankListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showRankList();
            }
        });
        add(showRankListButton);
        JButton endExamButton = new JButton("End Exam");
        endExamButton.setBounds(10, 50, 120, 30);
        endExamButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                endExam();
            }
        });
        add(endExamButton);

        studentLabels = new JLabel[numStudents];
        studentAnswerCounts = new int[numStudents];
        studentCorrectCounts = new int[numStudents];
        studentMarks = new int[numStudents];
        studentButtons = new JButton[numStudents];

        int rows = 3;
        int cols = 4;
        int startX = (classroomIcon.getIconWidth() - cols * 120) / 2;
        int startY = (classroomIcon.getIconHeight() - rows * 80) / 2;

        for (int i = 0; i < numStudents; i++) {
            int rowIndex = i / cols;
            int colIndex = i % cols;
            int benchX = startX + colIndex * 120;
            int benchY = startY + rowIndex * 80;

            studentLabels[i] = new JLabel("Student " + i + ": " + studentAnswerCounts[i] + " answers");
            studentLabels[i].setBounds(benchX, benchY - 30, 120, 20);
            add(studentLabels[i]);

            studentButtons[i] = new JButton("Student " + i);
            studentButtons[i].setBounds(benchX, benchY, 120, 30);
            int studentIndex = i;
            studentButtons[i].setVisible(true);
            studentButtons[i].addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                    showAnswerCountDialog(studentIndex);
                }
            });
            add(studentButtons[i]);
            add(backgroundLabel);
        
        }
        
        setSize(classroomIcon.getIconWidth(), classroomIcon.getIconHeight());
        setLocationRelativeTo(null);

        // Simulate student threads
        for (int i = 0; i < numStudents; i++) {
            int studentIndex = i;
            new Thread(new Runnable() {
                
                public void run() {
                    simulateStudent(studentIndex);
                }
            }).start();
        }
   
        
    }
    
    private void endExam() {
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to end the exam?", "Confirm Exam End", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    private void simulateStudent(int studentIndex) {
        int[] answerCount = { 0 };
        int[] correctCount = { 0 };
        while (answerCount[0] < 20) { 
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            answerCount[0]++;
            if (Math.random() > 0.4 && Math.random()<0.9) { 
                correctCount[0]++;
            }
            SwingUtilities.invokeLater(new Runnable() {
                
                public void run() {
                    updateAnswerCount(studentIndex, answerCount[0]);
                    updateCorrectCount(studentIndex, correctCount[0]);
                    int marks = correctCount[0] * 10;
                    updateMarks(studentIndex, marks);
                }
            });
            
           
        }
        
    
        if (studentIndex == studentMarks.length - 1) {
           
            
            SwingUtilities.invokeLater(new Runnable() {
                
                public void run() {
                    showRankList();
                }
            });
        }
    }

    public void updateAnswerCount(int studentIndex, int answerCount) {
        studentAnswerCounts[studentIndex] = answerCount;
        studentLabels[studentIndex].setText("Student " + studentIndex + ": " + answerCount + " answers");
    }

    public void updateCorrectCount(int studentIndex, int correctCount) {
        studentCorrectCounts[studentIndex] = correctCount;
    }

    public void updateMarks(int studentIndex, int marks) {
        studentMarks[studentIndex] = marks;
    }

    private void showAnswerCountDialog(int studentIndex) {
        int marks = studentMarks[studentIndex];
        int correctCount = studentCorrectCounts[studentIndex];
        int answerCount = studentAnswerCounts[studentIndex];
    
        // Get the question for the current answer count
        String question = getQuestion(answerCount);
    
        // Create the message to display
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Student ").append(studentIndex).append(":\n\n");
        messageBuilder.append("Answer Count: ").append(answerCount).append("\n");
        messageBuilder.append("Correct Answers: ").append(correctCount).append("\n");
        messageBuilder.append("Marks Obtained: ").append(marks).append("\n\n");
        messageBuilder.append("Question:\n").append(question);
    
        // Show the answer count and question in a dialog
        JOptionPane.showMessageDialog(this, messageBuilder.toString(), "Answer Count and Question", JOptionPane.INFORMATION_MESSAGE);
    }
    private String getQuestion(int answerCount) {
        String[] questions = {
            "1. What is the use of javac command?",
            "2. What is the prototype of the default constructor?",
            "3. What will be the output of the following program? ",
            "4. What will be the output of the program?",
            "5. Consider the code snippet",
            "6. JDK Stands for_______",
            "7. What makes the Java platform independent?",
            "8. Can we keep a different name for the java class name and java file name?",
            "9. Which class in Java is used to take input from the user?",
            "10. What is the need to mention \"static\" before main method?",
            "11. Which of the following is/are true statements?",
            "12. Following concept can be used for encapsulation in java programs",
            "13. Which keyword is used to declare an interface in java?",
            "14. A java interface can contain ————",
            "15. Can we declare an interface as final?",
            "16. Which of the following is true about inheritance in Java?",
            "17. What will be the output of the below program?",
            "18. What is the output of the below program?",
            "19. What is the output of the below program?",
            "20. What is the output of the below program?",
        };
    
        String[][] choices = {
            { "A. Executing the Program", "B. Compiling the Program", "C. for Calling Object", "D. Printing output on the screen" },
            { "A. Test(void)", "B. Test( )", "C. public Test( )", "D. public Test(void)" },
            { "A. true false", "B. false true", "C. false false", "D. true true" },
            { "A. true", "B. false", "C. exception thrown", "D. compilation fails" },
            { "A. Compilation fails.", "B. \"odd\" will always be output.", "C. \"odd\" will be output for odd values of x, and \"even\" for even values.", "D. \"even\" will always be output." },
            { "A. Java Development Kit", "B. Java Developed Kit", "C. Jaava Development Kit", "D. Java Development Kite" },
            { "A. OOP", "B. Class Compilation", "C. All of these", "D. Byte Code" },
            { "A. True", "B. False" },
            { "A. System", "B. Scanner", "C. import", "D. Println" },
            { "A. To make main method as class method specific to all instances", "B. for accessing Main Method", "C. None of the Above", "D. To call main method without creating an object of class" },
            { "A. a,b,c", "B. only a", "C. a,b", "D. a,d" },
            { "A. Wrapping data fields with methods", "B. Hiding data and internal methods using access modifiers in a class", "C. Using Interfaces", "D. All of the Above" },
            { "A. interface", "B. Using Interface", "C. import interface", "D. interface.*" },
            { "A. public static Final Variables only", "B. public Abstract methods", "C. Abstract methods(unimplemented) and implemented methods both", "D. public static Final Variables and abstract methods both" },
            { "A. True", "B. False" },
            { "A. 1,2", "B. 2,3", "C. 1,2,4", "D. 1,3,4" },
            { "A. 5", "B. Compilation error", "C. Runtime Error", "D. none of the above" },
            { "A. Constructor called Method called", "B. Runtime Error", "C. Compilation error", "D. none of the above" },
            { "A. 15", "B. Compilation error", "C. Runtime Error", "D. 12345" },
            { "A. Compilation error", "B. 12 Super Class", "C. 21 Super Class", "D. Runtime Error" }
        };
    
        // Ensure the answer count is within a valid range
        if (answerCount >= 0 && answerCount < questions.length) {
            String question = questions[answerCount];
            String[] choiceList = choices[answerCount];
            StringBuilder formattedQuestion = new StringBuilder();
    
            formattedQuestion.append(question).append("\n");
            for (String choice : choiceList) {
                
                formattedQuestion.append(choice).append("\n");
            }
    
            return formattedQuestion.toString();
        } else {
            return "Exam has Ended Click on Show RankLiSt to See the Rank List";
        }
    }
    
    
    public void showRankList() {
        RankListWindow rankListWindow = new RankListWindow(studentMarks);
        rankListWindow.setVisible(true);
    }
}

class WelcomeScreen extends JFrame {
    private JButton startButton;

    public WelcomeScreen() {
        setTitle("Welcome to Exam Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel titleLabel = new JLabel("Welcome to Exam Dashboard!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);

        startButton = new JButton("Start Exam");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showLoginWindow();
            }
        });
        add(startButton);

        setSize(400, 150);
        setLocationRelativeTo(null);
    }

    private void showLoginWindow() {
        LoginWindow loginWindow = new LoginWindow(this);
        loginWindow.setVisible(true);
    }

    public void startDashboard() {
        ExamDashboard dashboard = new ExamDashboard(12); 
        dashboard.setVisible(true);
        dispose(); 
    }

   
}

class LoginWindow extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginWindow(WelcomeScreen welcomeScreen) {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Teacher Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        loginButton = new JButton("Login");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 20, 10);
        add(titleLabel, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.insets = new Insets(0, 10, 10, 5);
        add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(usernameField, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.insets = new Insets(0, 10, 10, 5);
        add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(passwordField, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (validateLogin(username, password)) {
                    welcomeScreen.startDashboard();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginWindow.this, "Invalid username or password.",
                            "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private boolean validateLogin(String username, String password) {
        
        String correctUsername = "123";
        String correctPassword = "123";

        return username.equals(correctUsername) && password.equals(correctPassword);
    }
}
