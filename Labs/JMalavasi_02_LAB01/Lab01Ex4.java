import java.awt.*; // importing colors
   /*
    * Lab01Ex4 - Starter file for Lab01 Exercise 4
    * @author Jeff Malavasi
    * @version 1.0.0
    */
    
public class Lab01Ex4 
{
   public static void main(String[] args) 
   {
      Canvas canvas = new Canvas("Lab01Ex4 - MALAVASI", 500, 500);
      
      //Create body
      Rectangle rec1 = new Rectangle(30,40,350,100,Color.BLUE,true);
      canvas.draw(rec1); 
      
      //Create trailer
      Rectangle rec2 = new Rectangle(30,140,150,15,Color.RED,true);
      canvas.draw(rec2); 
      Rectangle rec3 = new Rectangle(250,140,150,15,Color.RED,true);
      canvas.draw(rec3); 
      
      //Create Wheels
      Circle wheel1 = new Circle(30,155,30,Color.BLACK,true);
      canvas.draw(wheel1); 
      Circle wheel2 = new Circle(100,155,30,Color.BLACK,true);
      canvas.draw(wheel2); 
      Circle wheel3 = new Circle(250,155,30,Color.BLACK,true);
      canvas.draw(wheel3); 
      Circle wheel4 = new Circle(320,155,30,Color.BLACK,true);
      canvas.draw(wheel4); 
      Circle wheel5 = new Circle(480,155,30,Color.BLACK,true);
      canvas.draw(wheel5); 
      
      //Create cab
      Rectangle rec4 = new Rectangle(400,40,80,115,Color.RED,true);
      canvas.draw(rec4); 
      Rectangle rec5 = new Rectangle(480,100,60,55,Color.RED,true);
      canvas.draw(rec5);
      
      //Create Window
      Rectangle rec6 = new Rectangle(412,50,50,30,Color.BLUE,true);
      canvas.draw(rec6); 
      
      //Create Label
      DrawableString label1 = new DrawableString("Ajax Supplies",150,100,Color.GRAY);
      canvas.draw(label1); 
   }
}