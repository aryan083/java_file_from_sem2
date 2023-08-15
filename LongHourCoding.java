import java.util.Scanner;
//all methods are final 
interface Vechicle_Factory{
    public void Raw_Process();
    public void Body_Constuction();
    public void Part_Placing();
    public void Finshing_Work();
    public void paint_job();
}
interface Test_fectory{
    public void MaximumSpeed();
    public void Milage();
    public void timeTakenTo0To100And100To0();
}
class Vehicle implements Vechicle_Factory {
// This class Has the all of the manufacturing Processes as methods.
 
    public final void Raw_Process(){
        System.out.print("Row Process:- This part of manufracting is to crate a base model to work upon." );
        System.out.println("");
    }

    public final void Body_Constuction(){
     System.out.println("Body Constuction :- This is the part of manufracturing process that craates inner body for Vechicle. ");
     System.out.println("");   
    }

    public final void Part_Placing(){
        System.out.println("Part Placing :- This part of manufracturing process is the part where the Working parts such as engine and carborator are assambled in body ");
        System.out.println("");
    }

    public final void Finshing_Work(){
        System.out.println("Finshing Work:- This the part where everything comes togather and final model is creted. ");
        System.out.println("");
    }
    public final void paint_job(){
        System.out.println("Paint Job :- Over here paint job on vehicle is done.");
    System.out.println("");
    }

}


class Two_Wheeler extends Vehicle{
    //this is the class for two Wheeler type which is extends Vehicle class 
    //1 method is there wihch is to Take Input of the chocie for Model of this class 
    public final void Choice_Of_Model(int str){
        if(str==1){
            T_W_Premium TwP1= new T_W_Premium();
            TwP1.MaximumSpeed();
            TwP1.Milage();
            TwP1.timeTakenTo0To100And100To0();
        }
        else if (str==0){
            T_W_Basic twB1= new T_W_Basic();
            twB1.MaximumSpeed();
            twB1.Milage();
            twB1.timeTakenTo0To100And100To0();
        }
        }
}
class T_W_Basic implements Test_fectory{
    public void MaximumSpeed(){
        System.out.println("The Maximum Speed by Basic Model :- 80KmPh");
        
    }
    public void Milage(){
    System.out.println("The mailage of Basic Model :- 45");        
    }
    public void timeTakenTo0To100And100To0(){
        System.out.println("Time it takes to go from 0 to 100 :- 19 seconds.");
        System.out.println("Time it takes to go from 100 to 0 :- 9 seconds.");
    }
}
class T_W_Premium implements Test_fectory{
    public void MaximumSpeed(){
        System.out.println("The Maximum Speed by Premuim Model :- 110KmPh");
        
    }
    public void Milage(){
    System.out.println("The mailage of Premium Model :- 65");        
    }
    public void timeTakenTo0To100And100To0(){
        System.out.println("Time it takes to go from 0 to 100 :- 12 seconds.");
        System.out.println("Time it takes to go from 100 to 0 :- 4 seconds.");
    }
}


class Three_Wheeler extends Vehicle{
 
    //this is the class for three Wheeler type which is extends Vehicle class 
    //1 method is there wihch is to Take Input of the chocie for Model of this class
    public final void Choice_Of_Model(int str){

    if(str==1){
        Three_Wheeler_Premium ThP1= new Three_Wheeler_Premium();
        ThP1.MaximumSpeed();
        ThP1.Milage();
        ThP1.timeTakenTo0To100And100To0();
    }
    else if (str==0){
        Three_Wheeler_Basic thB1= new Three_Wheeler_Basic();
        thB1.Milage();
        thB1.timeTakenTo0To100And100To0();
    }
    }
}
class Three_Wheeler_Basic implements Test_fectory{
    public void MaximumSpeed(){
        System.out.println("The Maximum Speed by Basic Model :- 100KmPh");
        
    }
    public void Milage(){
    System.out.println("The mailage of Basic Model :- 65");        
    }
    public void timeTakenTo0To100And100To0(){
        System.out.println("Time it takes to go from 0 to 100 :- 9 seconds.");
        System.out.println("Time it takes to go from 100 to 0 :- 4 seconds.");
    }
}
class Three_Wheeler_Premium implements Test_fectory{
    public void MaximumSpeed(){
        System.out.println("The Maximum Speed by premuim Model :- 120KmPh");
        
    }
    public void Milage(){
    System.out.println("The mailage of premuim Model :- 65");        
    }
    public void timeTakenTo0To100And100To0(){
        System.out.println("Time it takes to go from 0 to 100 :- 12 seconds.");
        System.out.println("Time it takes to go from 100 to 0 :- 4 seconds.");
    }
}

class Four_Wheeler extends Vehicle{

    //this is the class for Four Wheeler type which is extends Vehicle class 
    //1 method is there wihch is to Take Input of the chocie for Model of this class
    public final void Choice_Of_Model(int str){
        if(str==1){
            F_W_Premium FWP1= new F_W_Premium();
            FWP1.MaximumSpeed();
            FWP1.Milage();
            FWP1.timeTakenTo0To100And100To0();
            
        }
        else if (str==1){
            F_W_Basic FWB1= new F_W_Basic();
            FWB1.MaximumSpeed();
            FWB1.Milage();
            FWB1.timeTakenTo0To100And100To0();
        }
        }
}
class F_W_Basic implements Test_fectory{
    public void MaximumSpeed(){
        System.out.println("The Maximum Speed by Basic Model :- 130KmPh");
        
    }
    public void Milage(){
    System.out.println("The mailage of Basic Model :- 75");        
    }
    public void timeTakenTo0To100And100To0(){
        System.out.println("Time it takes to go from 0 to 100 :- 9 seconds.");
        System.out.println("Time it takes to go from 100 to 0 :- 4 seconds.");
    }
}
class F_W_Premium implements Test_fectory{
    public void MaximumSpeed(){
        System.out.println("The Maximum Speed by premuim Model :- 80KmPh");
        
    }
    public void Milage(){
    System.out.println("The mailage of premuim Model :- 165");        
    }
    public void timeTakenTo0To100And100To0(){
        System.out.println("Time it takes to go from 0 to 100 :- 6 seconds.");
        System.out.println("Time it takes to go from 100 to 0 :- 4 seconds.");
    }
}

public class LongHourCoding {
//main method Class 
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int Model_Choice;
    System.out.println("Enter the Type of Vechile You want to Know about ");
    System.out.println("2 for 2 Wheelr 3 for 3 Wheeler and 4 for 4 Wheeler");
    int Choice=sc.nextInt();
    if(Choice==2){
        Two_Wheeler TW1= new Two_Wheeler();
        TW1.Raw_Process();
        TW1.Body_Constuction();
        TW1.Part_Placing();
        TW1.Finshing_Work();
        TW1.paint_job();
        System.out.println("Enter the Model type 1 for premuim and 0 for basic");
        Model_Choice=sc.nextInt();
        TW1.Choice_Of_Model(Model_Choice);
    }
    else if(Choice==3){
        System.out.println("Enter the Model type 1 for premuim and 0 for basic");
        Model_Choice=sc.nextInt();
       Three_Wheeler THW1= new Three_Wheeler();
       THW1.Raw_Process();
       THW1.Body_Constuction();
       THW1.Part_Placing();
       THW1.Finshing_Work();
       THW1.paint_job();
       System.out.println("Enter the Model type 1 for premuim and 0 for basic");
       Model_Choice=sc.nextInt();
       THW1.Choice_Of_Model(Model_Choice);
      
    }    
    else if(Choice==4){
        Four_Wheeler FW1= new Four_Wheeler();
        FW1.Raw_Process();
        FW1.Body_Constuction();
        FW1.Part_Placing();
        FW1.Finshing_Work();
        FW1.paint_job();
        System.out.println("Enter the Model type 1 for premuim and 0 for basic");
        Model_Choice=sc.nextInt();
       FW1.Choice_Of_Model(Model_Choice);
    }
    else if(Choice ==0){
        System.out.println("Thank you for Giving us Your Time");
    }else {
        System.out.println("Enter a valid Response");
    }
    System.out.println("Thank You for Visitng.");
     sc.close();
}    
}
