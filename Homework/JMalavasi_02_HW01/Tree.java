/*
* Tree - HW01, This class draws a tree
* @author Jeff Malavasi
* @version 2621
*
*/

import java.awt.*;

public class Tree
{
   public Tree()
   {
      // create canvas
      Canvas canvas = new Canvas("Tree",500,500);
      
      // define shapes
      Rectangle base = new Rectangle(200, 320, 100, 100, Color.BLACK, true);
      Rectangle trunk = new Rectangle(225, 270, 50, 50, Color.MAGENTA, true);
      Triangle lowerTree = new Triangle(150, 195, 200, 75, Color.GREEN, true);
      Triangle middleTree = new Triangle(175, 120, 150, 75, Color.GREEN, true);
      Triangle topTree = new Triangle(200, 45, 100, 75, Color.GREEN, true);
      Circle treeTopper = new Circle(230, 10, 20, Color.RED, true);
      
      // add shapes to canvas
      canvas.draw(base);
      canvas.draw(trunk);
      canvas.draw(lowerTree);
      canvas.draw(middleTree);
      canvas.draw(topTree);
      canvas.draw(treeTopper);
      
      // print object specifications
      System.out.println("base: " + base);
      System.out.println("trunk: " + trunk);
      System.out.println("lowerTree: " + lowerTree);
      System.out.println("middleTree: " + middleTree);
      System.out.println("topTree: " + topTree);
      System.out.println("treeTopper: " + treeTopper);
   }
   
   public static void main(String[] args)
   {
      Tree tree = new Tree();
   }
}