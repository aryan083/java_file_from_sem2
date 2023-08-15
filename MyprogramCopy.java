class Student{
    String name;
    int rollno;

Student (String s_name,int s_roll){
    System.out.println("Constructer crated");
    this.name=s_name;
    this.rollno=s_roll;
}
Student(Student s){
    System.out.println("Copy constucter created");
    this.name=s.name;
    this.rollno=s.rollno;
}
public void display(){
    System.out.println("Name: "+ name);
    System.out.println("Roll no: "+rollno);
}}
public class MyprogramCopy{
    public static void main(String[] args) {
        //float area;
        Student s1= new Student("Aryan", 11);
        s1.display();
        Student s2= new Student(s1);//copy ni maher bani
        s2.display();
    }
}
