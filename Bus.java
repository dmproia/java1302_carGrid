/**
 * Write a description of class Taxi here.
 * 
 * @author (David Proia) 
 * @version (Assignment 3)
 */
import javax.swing.*;
import java.awt.*;

public class Bus implements Moveable
{
    private int row;
    private int col;
    private int unit;
    private String direction;
    
    public Bus(int r, int c, int u, String d)
    {
        row = r;
        col = c;
        unit = u;
        direction = d;
        
    }
    public void turnLeft()
    {
        if(direction.equals("north"))
        {
            direction = "west";
        }
        else if(direction.equals("west"))
        {
            direction = "south";
        }
        else if (direction.equals("south"))
        {
            direction = "east";
        }
        else if (direction.equals("east"))
        {
            direction = "north";
        }
    }
    public void turnRight()
    {
        if(direction.equals("north"))
        {
            direction = "east";
        }
        else if(direction.equals("west"))
        {
            direction = "north";
        }
        else if (direction.equals("south"))
        {
            direction = "west";
        }
        else if (direction.equals("east"))
        {
            direction = "south";
        }
    }
    public void move()
        {
        if(direction.equals("north"))
        {
            
            if(col - unit <= 0  )
            {
                col = (MAXCOL + col - unit ); 
            }
            else
            {
                col = col - unit;
            }
        }
        else if(direction.equals("east"))
        {
            
            if(row + unit > MAXROW )
            {
                row = (row + unit - MAXROW); 
            }
            else
            {
                row = row + unit;
            }
        }
        else if(direction.equals("west"))
        {
            
            if(row - unit <= 0  )
            {
                row = (MAXCOL + row - unit ); 
            }
            else
            {
                row = row - unit;
            }
        }
        else if (direction.equals("south"))
        {
            
            if(col + unit > MAXCOL)
            {
                col = (col + unit - MAXCOL ); 
            }
            else
            {
                col = col + unit;
            }
        }
        
    }
    public String toString()
    {
        return "The bus stats \n"  + "Row: " + row + " Col: " + col;
    }
        
}