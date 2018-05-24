
import java.util.Scanner;

public class TestEvalExpr2
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      String s;
      char[] a;
      int r;

      System.out.println("Please input a simple expression containing:");
      System.out.println("  1. integer numbers");
      System.out.println("  2. arithemtic operators + and -");
      System.out.println();

      while ( true )
      {
         System.out.print("Enter an expression (no spaces): ");
	 s = input.next();
	 a = s.toCharArray();

	 r = EvalExpr.eval( a );
         System.out.println(s + "=" + r + "\n");
      }
   }
}

