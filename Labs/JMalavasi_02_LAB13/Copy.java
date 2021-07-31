/**
 * Copies the contents of a file into another file 
 *
 * @author Malavasi
 * @version 202100502
*/

import java.io.*; // for all the IO classes

public class Copy
{
   public static void main(String[] args) throws Exception
   {
      try
      {
         // declare files
         File fNameIn = new File(args[0]);
         File fNameOut = new File(args[1]);
         FileReader fIn = null;
         FileWriter fOut = null;
      
         // open input file
         try
         {
            fIn = new FileReader(new File(fNameIn.getName()));
         }
         catch (FileNotFoundException fnf)
         {
            System.out.println("Input File not found: " + fnf);
            System.exit(1);
         }
      
         // create output file if parameter is set to replace, otherwise append
         if (fNameOut.exists())
         {
            if (args[2].equals("a"))
            {
               fOut = new FileWriter(new File(fNameOut.getName()),true);
            }
            else if (args[2].equals("r"))
            {
               fOut = new FileWriter(new File(fNameOut.getName()));
            }
         }
         else
         {
            fOut = new FileWriter(new File(fNameOut.getName()));
         }
      
         // while there is a new line, print current line and advance the scanner
         int currentLetter = fIn.read();     
         while (currentLetter != -1)
         {
            fOut.write((char) currentLetter);
            currentLetter = fIn.read();
         }
      
      // Close data streams
         fIn.close();
         fOut.close();
      }
      catch (IOException ioe)
      {
         System.out.println("IO: " + ioe);
         System.exit(1);
      }
   }  
}