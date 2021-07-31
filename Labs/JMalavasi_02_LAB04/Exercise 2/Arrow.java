/**
 * Arrow - Class to model an arrow
 * @author  J. Malavasi
 * @version 20210218
 */
 
public class Arrow 
{
   // attributes of an Arrow
   private Canvas canvas;
   private Triangle head;
   private Rectangle shaft;
   
   /**
    * Arrow constructor.
    * @param canvas the canvas to draw the arrow on
    */
   public Arrow(Canvas canvas) 
   {
     this.canvas = canvas;
     
     // Get size of canvas
     int canvasHeight = canvas.getHeightInt();
     int canvasWidth = canvas.getWidthInt();
     
     shaft = new Rectangle((canvasWidth/2),(canvasHeight-150),10,100);
     head = new Triangle(((canvasWidth/2)-20),(canvasHeight-200),50,50, true);
   }
   
   /**
    * draw - Draws an arrow
    */
   public void draw()
   {
      canvas.draw(head);
      canvas.draw(shaft);
   }
   
   /**
    * erase - erase an arrow
    */
   public void erase()
   {
      canvas.erase(head);
      canvas.erase(shaft);
   }
   
   /**
    * moveUp - moves the arrow up 50 px
    */
   public void moveUp()
   {
      // gets current height of head and shaft
      int currentShaftHeight = shaft.getYInt();
      int currentHeadHeight = head.getYInt();
      
      // sets new height
      shaft.setYInt((currentShaftHeight-50));
      head.setYInt((currentHeadHeight-50));
   }
}