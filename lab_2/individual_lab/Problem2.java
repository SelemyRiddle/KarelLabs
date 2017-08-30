package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        setTop();
    }
    
    public void setTop() {
        topPos();
        row1();
        row2();
        row3();
    }
    public void row2(){
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void row3(){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        putBeeper();
        move();
    }
    public void row1(){
        turnLeft();
        turnLeft();
        turnLeft();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void topPos(){
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
    }
}
