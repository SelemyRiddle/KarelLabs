package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        move();
        checkRoom();
        move();
        checkRoom();
        move();
        checkRoom();
        move();
        checkRoom();
        move();
        checkRoom();
        move();
        checkRoom();
        move();
        checkRoom();
        move();
        checkRoom();
    }
    public void move2(){
        move();
        move();
    }
    public void checkRoom(){
        turnLeft();
        move();
        if (frontIsClear()==false){
            turnLeft();
            if (frontIsClear()==false){
                turnLeft();
                turnLeft();
                if (frontIsClear()==false){
                    putBeeper();
                    turnLeft();
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                }
                else{
                    notARoom();
                }
        }
            else{
                notARoom();
            }
            
        }
        else{
            notARoom();
        }
    }
    
    public void notARoom(){
        if (facingNorth()==true){
            turnLeft();
            turnLeft();
            move();
            turnLeft();
        }
        else{
            if (facingEast()==true){
            turnLeft();
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                }
            else{
                if (facingWest()==true){
                    turnLeft();
                    move();
                    turnLeft();
                }
            }
        }
}

}
