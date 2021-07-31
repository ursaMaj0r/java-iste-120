public class Controller 
{
   // declare attributes
   private Canvas canvas;
   private Arrow arrow;
   
   public static void main(String[] args) throws Exception
   {
      new Controller();
   }
  
   /**
    * Controller constructor.
    */
   public Controller() throws Exception 
   {
      canvas = new Canvas("Arrow",500,700);
      arrow = new Arrow(this.canvas);
      arrow.draw();
      Thread.currentThread().sleep(100);
      
      // move arrow up 10 times
      for (int i = 0; i < 10; i++)
      {
         arrow.erase();
         arrow.moveUp();
         arrow.draw();
         Thread.currentThread().sleep(100);
      }
   }
}

/*
QUESTIONS FROM LAB ASSIGNMENT
7a: 
The purpose of the grouping of operations is to move the arrow up. The first line is used to 
remove the arrow from the canvas and then the moveUp method changes the positional attributes
of the shape before finally redrawing with the draw method.

7b:
The "Thread.currentThread().sleep(100);" line is used to pause. If the line was removed, then the arrow would move
up much quicker (as fast as the computer can run the code).

*/