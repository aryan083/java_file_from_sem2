interface VechicleInterface{

int a =10;
public void turnLeft();
public void turnRight();
public void Accelerate();
public void slowDown();
}
class carclass implements VechicleInterface{
public void turnLeft(){System.out.println("LEFT");}

public void turnRight()
{System.out.println("RIGHT");
}
public void Accelerate(){System.out.println("SPEED");}
public void slowDown(){System.out.println("BRAKE");}

}
class DemoInterface{
public static void main (String[] args){
carclass c= new carclass();
c.turnLeft();
}
}