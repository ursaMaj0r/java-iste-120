import java.awt.*; // importing colors

public class Lab01Ex3 
{

/**
 * Lab01Ex3 - MALAVASI
 * @author Jeff Malavasi
 * @version 1.0.0
 */

   public static void main(String[] args) 
   {
      Canvas canvas = new Canvas("Lab01Ex3 - MALAVASI", 500, 500);
      
      Circle myCircle = new Circle(20,60,30, Color.BLUE);
      //myCircle.setXInt(myCircle.getXInt() + 150);
      myCircle.setYInt(myCircle.getYInt() + 200);
      System.out.println("My Circle: " + myCircle);
      canvas.draw(myCircle); 
   }
}