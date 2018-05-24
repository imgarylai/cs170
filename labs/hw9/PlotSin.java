import java.awt.*;
import java.awt.image.*;

public class PlotSin
{

   static public void main(String[] args) throws Exception
   {
      final int YELLOW = 0xFFFF00;
      final int RED    = 0xFF0000;
      final int BLACK  = 0x000000;

      /* ------------------------------------------------
         Preparing to draw picture...
         ------------------------------------------------ */
      MyCanvas pic = new MyCanvas();        // Make a canvas (2 dim array)
      Frame f = new Frame( "My image" );    // Create a window

      f.add("Center", pic);                 // Put the canvas in the window
      f.setSize(400,300);                   // Set size of the window
      f.setVisible(true);                   // Make window visible 

      int[][] a = new int[400][300];        // This array hold the picture
      int row, col;


      /* ********************************************************
         Put your Java statements to draw the sin plot here

         The Java statement must change the color code in
         the 2-dim array a[][] so that the method
         pic.draw(a) can draw the correct picture
         ******************************************************** */








      /* ----------------------------------------------------------
         This method will draw the picture in the 2-dim array a[][] 
         ---------------------------------------------------------- */
      pic.draw(a);     // Don't touch !
   }
}

