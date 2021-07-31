/**
 * Triangle - Class to make calculations 
 * about a triangle 
 *
 * @author Malavasi
 * @version 20210306
*/
public class Triangle
{
    // Declare Attributes
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
 
    /**
    * Constructs a triangle with given coordinates
    * @param x1 the x1 coordinate
    * @param y1 the y1 coordinate
    * @param x2 the x2 coordinate
    * @param y2 the y2 coordinate
    * @param x3 the x3 coordinate
    * @param y3 the Y3 coordinate
    */
   public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) 
   {   
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
      this.x3 = x3;
      this.y3 = y3;
      
      // validate y1 and y2 are the same
      if ( y1 != y2)
      {
         System.out.println("Error: y1 and y2 don't match");
         System.exit(0);
      }   
   }
   
   /**
    * Gets the length of side a.
    * @return lengthA the length of side a
    */
   public double getLengthA() 
   {   
      double db = x2 - x3;
      double a = Math.sqrt((db*db) + (getHeight()*getHeight()));
      return a;
   }
   
   /**
    * Gets the length of side b.
    * @return lengthA the length of side b
    */
   public double getLengthB() 
   {   
      double ad = x3 - x1;
      double b = Math.sqrt((ad*ad) + (getHeight()*getHeight()));
      return b;
   }
   
   /**
    * Gets the length of side c.
    * @return lengthA the length of side c
    */
   public double getLengthC() 
   {   
      double lengthC  = x2 - x1;
      return lengthC;
   }
   
   /**
    * Gets the angle of side a.
    * @return angleC the angle of side a
    */
   public double getAngleA() 
   {   
      double angleA  = Math.toDegrees(Math.atan(getHeight()/(x3-x1)));
      return angleA;
   }
   
   /**
    * Gets the angle of side b.
    * @return angleC the angle of side b
    */
   public double getAngleB() 
   {   
      double angleB  = Math.toDegrees(Math.atan(getHeight()/(x2-x3)));
      return angleB;
   }
   
   /**
    * Gets the angle of side c.
    * @return angleC the angle of side c
    */
   public double getAngleC() 
   {   
      double angleC  = 180.00-getAngleA()-getAngleB();
      return angleC;
   }
   
   /**
    * Gets the height of the triangle.
    * @return height the height of the triangle
    */
   public double getHeight() 
   {   
      double height  = y3 - y2;
      return height;
   }
   
   /**
    * Gets the permiter of the triangle.
    * @return perimeter the perimeter of the triangle
    */
   public double getPerimeter() 
   {   
      double perimeter  = getLengthA() + getLengthB() + getLengthC();
      return perimeter;
   }
   
   /**
    * Gets the area of the triangle.
    * @return area the perimeter of the triangle
    */
   public double getArea() 
   {   
      double area  = getLengthC()/2 * getHeight();
      return area;
   }
}