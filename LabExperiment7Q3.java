public class LabExperiment7Q3 {
    static int currentBal=5000;
    private static Throwable ex;
    public static void main(String[] args) {
        try{
            int ammunt=Integer.parseInt("4500");
            withdraw(ammunt);
        }catch(Exception e){
            System.out.println("No money for you");
            System.out.println(ex.getMessage());

        }       
    }
    public static void withdraw(int ammunt) throws Exception{
        int new_balance=currentBal-ammunt;
        if(new_balance<1000){
            System.out.println("insufficent ammount of Money.");
        }
    }
}
