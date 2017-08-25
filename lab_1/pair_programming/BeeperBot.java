package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Selemy Riddle
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        driftLeft();
        turnLeft();
        m2pick();
        m3pick();
        driftLeft();
        pickBeeper();
        driftLeft();
        pickBeeper();
        move2();
        dropBeeper();
    }
   public void turnRight(){
       turnLeft();
       turnLeft();
       turnLeft();
    }
   public void move3(){
        move();
        move();
        move();
    }
   public void move2(){
       move();
       move();
    }
   public void dropBeeper(){
       putBeeper();
       putBeeper();
       putBeeper();
       putBeeper();
    }
   public void driftLeft(){
       turnLeft();
       move3();
    }
   public void m2pick(){
       move2();
       pickBeeper();
   }
   public void m3pick(){
       move3();
       pickBeeper();
    }
}

