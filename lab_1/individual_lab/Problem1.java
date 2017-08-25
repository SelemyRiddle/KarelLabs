package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        findBeeper();
        getBeeper();
        reposition();
        dropBeepers();
        returnHome();
    }
    public void returnHome(){
        turnRight();
        m2Right();
        m2Right();
    }
    public void reposition(){
        turnLeft();
        turnLeft();
        m2Left();
        m2Left();
        turnLeft();
    }
    public void findBeeper(){
        move();
        turnLeft();
        m2Right();
        move();
    }
    public void getBeeper(){
        pickBeeper();
        turnRight();
        mPick();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void dropBeepers(){
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void m2Left(){
        move();
        move();
        turnLeft();
    }
    public void m2Right(){
        move();
        move();
        turnRight();
    }
    public void mPick(){
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
}