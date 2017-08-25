package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        rightmove2();
        leftmove4();
        rightmove();
        turnRight();
        move();
        turnRight();
    }
   public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}
public void rightmove(){
     turnRight();
        move();
        move();
    }
public void rightmove2(){
    turnRight();
        move();
        move();
        turnRight();
        move();
        move();
    }
    public void leftmove4(){
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
    }
}