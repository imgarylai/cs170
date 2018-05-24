public class Arithmetic1 
{
   public static void main (String[] args) 
   {
      int operand1, operand2;
      char theOperator;

      // Check if there are 3 command-line arguments in the
      // String array args[] by using length variable of array.
      if (args.length != 3) 
      {
         System.err.println("Usage: java Arithmetic int1 int2 op");
         System.err.println("**** Program requires 3 arguments");
         return;
      }

      // Convert the 3 Strings args[0], args[1], args[2] to int and char.

      // Use the Integer.parseInt(aStr) to convert a String to an int.
      operand1 = Integer.parseInt(args[0]);


      /* ===========================================
         TODO: 
             write statement to read the operand2
         =========================================== */
      ....

      // Get the operator, assumed to be the first character of
      // the 3rd string. Use method charAt() of String.
      theOperator = args[2].charAt(0);

      System.out.print(args[0] + args[2] + args[1] + "=");


      /* ==========================================================
         TODO: 

            use the if-else statement to perform the appropriate 
            operation according to theOperator variable. 

         The type of operations supported are: -, +, *, and /.
         ========================================================== */

      if ( theOperator == '-' ) 
      {
         System.out.println(operand1 - operand2); 
      }
      else if ( theOperator == '+' )
      {
         ....
      }
      ....

      else
      {
         ....
      }
   }
}

