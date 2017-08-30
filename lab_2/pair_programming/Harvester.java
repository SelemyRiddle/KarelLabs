package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        pickall();
        turnLeft();
        turnLeft();
        putRow();
        repositionPut();
        putPos();
        putRow();
        repositionPut();
        putPos();
        putRow();
        repositionPut();
        turnOff();
    }
    //your methods go below
    /**
     * Precondition: Robot facing East 1 block from row of beepers
     * Postcondition: Robot facing East, two streets above original position
     */
    public void pickRow(){
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        }
    public void repositionPick(){
        turnLeft();
        move();
        turnLeft();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    public void startPos(){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickall(){
        pickRow();
        repositionPick();
        startPos();
        pickRow();
        repositionPick();
        startPos();
        pickRow();
        repositionPick();
    }
    public void putRow(){
        move();
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
    public void repositionPut(){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    public void putPos(){
        turnLeft();
        move();
        turnLeft();
    }
}

