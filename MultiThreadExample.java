import java.util.Random;

public class MultiThreadExample {
    private static volatile boolean stopThreads = false;

    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        SquareThread squareThread = new SquareThread();
        CubeThread cubeThread = new CubeThread();

        generator.start();
        squareThread.start();
        cubeThread.start();

        try {
            Thread.sleep(5000);  // Run the threads for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopThreads = true;  // Set the flag to stop the threads
    }

    private static class RandomNumberGenerator extends Thread {
        public void run() {
            Random random = new Random();
            while (!stopThreads) {
                int number = random.nextInt(100);
                System.out.println("Generated number: " + number);

                if (number % 2 == 0) {
                    SquareThread.addNumber(number);
                } else {
                    CubeThread.addNumber(number);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SquareThread extends Thread {
        private static volatile int number;

        public static synchronized void addNumber(int number) {
            SquareThread.number = number;
        }

        public void run() {
            while (!stopThreads) {
                if (number != 0) {
                    int square = number * number;
                    System.out.println("Square: " + square);
                    number = 0;
                }
            }
        }
    }

    private static class CubeThread extends Thread {
        private static volatile int number;

        public static synchronized void addNumber(int number) {
            CubeThread.number = number;
        }

        public void run() {
            while (!stopThreads) {
                if (number != 0) {
                    int cube = number * number * number;
                    System.out.println("Cube: " + cube);
                    number = 0;
                }
            }
        }
    }
}
