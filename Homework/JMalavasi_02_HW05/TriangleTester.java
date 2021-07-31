/**
 * TriangleTester - Class to test Triangle class 
 *
 * @author Malavasi
 * @version 20210306
*/
public class TriangleTester
{
   public static void main(String[] args)
   {
      // Instantiate a triangle
      Triangle triangle = new Triangle(0.0,0.0,4.0,0.0,3.0,3.0);
      
      //output Calculations
      System.out.println("Triangle with coordinates: A (0.0,0.0) B (4.0,0.0), C (3.0,3.0)");
      System.out.printf("area: %1.2f\n", triangle.getArea());
      System.out.printf("perimeter: %1.2f\n", triangle.getPerimeter());
      System.out.printf("length side a: %1.2f\n", triangle.getLengthA());
      System.out.printf("length side b: %1.2f\n", triangle.getLengthB());
      System.out.printf("length side c: %1.2f\n", triangle.getLengthC());
      System.out.printf("height h: %1.2f\n", triangle.getHeight());
      System.out.printf("Angle A: %1.2f\n", triangle.getAngleA());
      System.out.printf("Angle B: %1.2f\n", triangle.getAngleB());
      System.out.printf("Angle C: %1.2f\n", triangle.getAngleC());
   }
}