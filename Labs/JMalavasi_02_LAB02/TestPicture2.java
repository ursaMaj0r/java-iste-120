
/*
* TestPicture - Lab 2
* @author Jeff Malavasi
* @version 2205
*/
import java.util.*;

public class TestPicture2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      // create picture instance
      Picture2 picture = new Picture2();

      // draw house
      picture.draw();

      // Prompt for redraw
      System.out.println("Press Enter to continue:");
      in.nextLine();
      picture.setNewColors();

      // Prompt for redraw
      System.out.println("Press Enter to continue:");
      in.nextLine();
      picture.setOrigColors();
   }
}