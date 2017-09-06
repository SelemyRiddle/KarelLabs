package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4 extends Problem3
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem4(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
        make3();
        pick3();
    }
    public void pick3(){
        
    }
    public void make3(){
        move();
        move();
        altColumn();
        move();
        altColumn();
        move();
        makeColumn();
    }
    public void pickColumn(){
        turnLeft();
        move();
        pickBeeper();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        pickBeeper();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickAlt(){
        move();
        pickBeeper();
        turnLeft();
        move();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
