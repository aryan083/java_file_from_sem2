class wise {
    double time =7.30;
    double time2 =9.30;
    public void Study(){
        System.out.println("study time "+time +" to "+ time2);
    }
}
class dumb extends wise {
    double time1 = 7.30;
    
    public void Study(){
        System.out.println("Sleep time "+ time1+" to "+" till morning" );
    } 
} 
public class overridedemo {
    public static void main(String[] args) {
        wise w1= new wise();
        w1.Study();
        dumb d1= new dumb();
        d1.Study();
    }
}
