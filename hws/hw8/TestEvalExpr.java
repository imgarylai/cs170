

public class TestEvalExpr
{
   /* ============================================================
      main: test EvalExpr.eval() method with various expressions
      ============================================================ */
   public static void main( String[] args )
   {
      String s;
      int r;

      char[] a = {'1', '1', '+', '2'};
      r = EvalExpr.eval( a );
      System.out.println("11+2=" + r + "\n");

      char[] b = {'2', '-', '3', '+', '1', '2', '4'};
      r = EvalExpr.eval( b );
      System.out.println("2-3+124=" + r + "\n");

      char[] c = {'3', '+', '1', '1', '-', '3', '+', '1', '2'};
      r = EvalExpr.eval( c );
      System.out.println("3+11-3+12" + "=" + r + "\n");

      char[] d = {'3', '/', '1', '1', '-', '3', '+', '1', '2'};
      r = EvalExpr.eval( d );
      System.out.println("3/11-3+12" + "=" + r + "\n");

      char[] e = {'3', '+', '1', '1', '-', '3', '/', '1', '2'};
      r = EvalExpr.eval( e );
      System.out.println("3+11-3/12" + "=" + r + "\n");

   }
}

