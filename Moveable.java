
/**
 * Write a description of class afda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Moveable
{
	public static final int MAXROW = 15;
	public static final int MAXCOL = 15;
	
    void move();
    void turnRight();
    void turnLeft();
}
