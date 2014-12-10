/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author Shaurya Prakash
 * @version 30/11/2014
 *
 */

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab10 {
	 
	 public static void main(String[] args) {
		 
          String filename = JOptionPane.showInputDialog("What robot map?");  	
          Display.openWorld("maps/" + filename + ".map");
          Display.setSize(10, 10);
          Display.setSpeed(10);

		 Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 clearMaze(athena);
	 }
	 
	 public static void clearMaze(Athlete arg) 
  {
    while (!arg.nextToABeeper())
  {
    if (!arg.leftIsClear() && arg.frontIsClear())
   {
    arg.move();
   }
    if (arg.leftIsClear())
   {
    arg.turnLeft();
    arg.move();
   }
    if (!arg.leftIsClear() && !arg.frontIsClear() && arg.rightIsClear())
   {
    arg.turnRight();
    arg.move();
   }
    if (!arg.leftIsClear() && !arg.frontIsClear() && !arg.rightIsClear())
   {
    arg.turnAround();
   }
  }
  }
  
}
