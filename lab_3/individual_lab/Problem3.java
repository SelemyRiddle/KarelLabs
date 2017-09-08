package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
        turnLeft();
        move();
        checkRoom();
    }
    public void checkRoom(){
        turnLeft();
        move();
        if (frontIsClear()==false){
            if (checkWalls() == true){
                putBeeper();
                faceSouth();
                leaveRoom();
            }
        }
        else{
            if (checkWalls() == true){
               checkRoom();
            }
        }
    }
    public boolean checkWalls(){
        turnLeft();
        if (frontIsClear()==false){
                turnLeft();
                turnLeft();
                if (frontIsClear()==false){
                    return true;
                }
                else{
                    notARoom();
                    return false;
                }
        }
            else{
                notARoom();
                return false;
            }
    }
    public void notARoom(){
        faceSouth();
        leaveRoom();
    }
    public void leaveRoom(){
        if (inside()){
            move();
        }
        else{
            faceSouth();
            turnLeft();
        }
    }
    public boolean inside(){
        turnLeft();
        if (frontIsClear()){
            turnLeft();
            turnLeft();
            if (frontIsClear()){
                return false;
            }
            else{
                faceSouth();
                return true;
                
            }
        }
        else{
            faceSouth();
            return true;
            
        }
    }
    public void faceSouth(){
        if (facingEast()){
            turnLeft();
            turnLeft();
            turnLeft();
        }
        if (facingWest()){
            turnLeft();
        }
        if (facingNorth()){
            turnLeft();
            turnLeft();
        }
    }
}


