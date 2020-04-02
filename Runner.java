
/**
 * Write a description of class TaxiRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Moveable> vehicles = new ArrayList<Moveable>();
        vehicles.add(new Taxi(8,8,7,"east"));
        vehicles.add(new Bus(7,7,6,"west"));
        for(Moveable m : vehicles)
        {
            System.out.println("Before: " + m);
        }
        for(Moveable m : vehicles)
        {
            m.move();
        }
        for(Moveable m : vehicles)
        {
            System.out.println("After: " + m);
        }
    }
}