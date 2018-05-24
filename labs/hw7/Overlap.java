public class Overlap
{
    // Cut and paste your  TESTED  overlap()  method here


    // Write the  maxOverlap() method  here

   public static void main(String[] args)
   {
      String x1, x2;

      x1 = "abcabcabc"; x2 = "bcabcxx";
      System.out.println( x1 + "  " + x2 + " = " + maxOverlap(x1, x2) );
      x1 = "Frodo"; x2 = "odometer";
      System.out.println( x1 + "  " + x2 + " = " + maxOverlap(x1, x2) );
      x1 = "Frodo"; x2 = "Odometer";
      System.out.println( x1 + "  " + x2 + " = " + maxOverlap(x1, x2) );
      x1 = "Frodo"; x2 = "od";
      System.out.println( x1 + "  " + x2 + " = " + maxOverlap(x1, x2) );
      x1 = "Frodo"; x2 = "do";
      System.out.println( x1 + "  " + x2 + " = " + maxOverlap(x1, x2) );
   }
}

