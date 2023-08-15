class NewThread implements Runnable {
String  name;
Thread t;

NewThread(String name){
   
    t=new Thread(t, name);
    System.out.println("NEW Thread :- "+t);
    t.start();
}
public void run(){
    try{
        for (int i=0;i>5;i++){
            System.out.println("name "+" : " +i );
            Thread.sleep(5000);

        }
    }
    catch(InterruptedException e){
        System.out.println(name+"interrupted");
        

    }
    System.out.println(name +"interrupted");

}

}
public class joindemo {
public static void main(String[] args) {
    NewThread obj1=new NewThread("one");
    NewThread obj2=new NewThread("TWO");
    NewThread obj3=new NewThread("Three");
    System.out.println("Thread 1 is alive "+obj1.t.isAlive()); 
    System.out.println("Thread 2 is alive"+obj2.t.isAlive());
    System.out.println("Thread 3 is alive"+obj3.t.isAlive());
    System.out.println("Main Thread exiting.");
    try{
        System.out.println("Waitnig For threads to finish.");
        obj1.t.join();
        obj2.t.join();
        obj3.t.join();
    }
    catch(InterruptedException e){
        System.out.println("Main thread Interupted.");

    }

}    
}
