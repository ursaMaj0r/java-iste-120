import java.awt.*;

/**
 * Course: ISTE-120
 * Exam: Practical 1, Question 1 
 * Description: Castle - Class to draw an castle
 * @author  J. Malavasi
 * @version 20210220
 */
public class Castle
{
   /**
    * Castle constructor.
    */
   public Castle()
   {  
      // create canvas
      Canvas canvas = new Canvas("Castle",300,300);
      
      // define wall
      Rectangle wall = new Rectangle(45, 100, 200, 100, Color.RED, true);
      
      // define towers
      Rectangle tower1 = new Rectangle(25, 60, 20, 140, Color.GRAY, true);
      Rectangle tower2 = new Rectangle(225, 60, 20, 140, Color.GRAY, true);
      
      // define tower topper
      Triangle tower1Top = new Triangle(22, 38, 25, 25, Color.RED, true);
      Triangle tower2Top = new Triangle(222, 38, 25, 25, Color.RED, true);
      
      // define door
      Circle door = new Circle(100, 140, 30, Color.BLUE, true);
      
      // draw shapes on canvas
      canvas.draw(wall);
      canvas.draw(tower1);
      canvas.draw(tower2);
      canvas.draw(tower1Top);
      canvas.draw(tower2Top);
      canvas.draw(door);
   }
   
   public static void main(String[] args)
   {
      // instantiate castle
      Castle castle = new Castle();
   } 
}