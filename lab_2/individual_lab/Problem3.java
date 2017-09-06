package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
        makeH();
        makeE();
        makeL();
        makeL();
        makeO();
    }
    public void makeO(){
        move();
        move();
        makeColumn();
        altColumn();
        move();
        makeColumn();
    }
    public void makeL(){
        move();
        move();
        makeColumn();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void makeE(){
        move();
        move();
        makeColumn();
        altColumn();
        //
        altColumn();
        
    }
    public void altColumn(){
        move();
        putBeeper();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void makeH(){
        move();
        move();
        makeColumn();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        makeColumn();
    }
    public void makeColumn(){
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
    }
}