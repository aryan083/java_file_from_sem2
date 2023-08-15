class time{
    int hour,min,sec;
    public time(int hour,int min, int sec){
        this.sec=sec;
        this.min=min;
        this.hour=hour;

    }
    void add(time t){
        this.sec+= t.sec;
        if(this.sec>=60){
            this.min++;
            this.sec-=60;
        }
        this.min+=t.min;
        if(this.min>=60){
            this.hour++;
            this.min-=60;
        }
        this.hour+=t.hour;
    }
    
}
public class timedemo {
    public static void main(String[] args) {
        time t1=new time(11,59,55);
        time t2= new time(0,0,5);
        t1.add(t2);
        System.out.println(t1.hour+":"+t1.min+":"+ t1.sec);
    }
}
