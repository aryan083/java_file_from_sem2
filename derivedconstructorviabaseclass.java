class derivedconstructor{
    derivedconstructor(){
        System.out.println("base class constructor called");
        
    }
    }
    class derived extends derivedconstructor{
        derived(){
            System.out.println("Derived class constructor called.. ");
        }   
    }  

class derivedconstructorviabaseclass
{
public static void main(String[] args) {
    derived d= new derived();
    derivedconstructor d1= new derivedconstructor();
}
}


// class derivedconstructor{
//     //derivedconstructor(){
//       //  System.out.println("base class constructor called");}
//     }
//     class derived extends derivedconstructor{
//         derived(){
//             System.out.println("Derived class constructor called.. ");
//         }   
//     }  

// class derivedconstructorviabaseclass
// {
// public static void main(String[] args) {
//     derived d= new derived();
// }
// }
// class derivedconstructor{
//     derivedconstructor(){
//         System.out.println("base class constructor called");}
//     }
//     class derived extends derivedconstructor{
//         derived(){
//             System.out.println("Derived class constructor called.. ");
//         }   
//     }  

// class derivedconstructorviabaseclass
// {
// public static void main(String[] args) {
//     derivedconstructor d3= new derivedconstructor();

// }
// }



