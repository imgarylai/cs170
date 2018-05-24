/* ----------------------------------------------------------------
   Complete the method "toUpperCase()"
   ---------------------------------------------------------------- */
public class UpperCase
{
    public static String toUpperCase( String s )
    {
       String output;
       char c;
       int i;

       output = "";

       for ( i = 0; i < s.length(); i++ )
       {
	  c = s.charAt(i);

          if ( 'a' <= c && c <= 'z' )
	     output += (char) (c - 'a' + 'A'); // Change c to uppercase and add
	  else
	     output += c;
       }
       
       return (output);
    }



   /* ------------------------------------------------------
      Method main is our main entry point.
      ------------------------------------------------------ */
   public static void main(String args[])
   {
      String in, out;

      in = "Hello4";
      out = toUpperCase(in);
      System.out.println("Input: " + in + "\tUppercased Output: " + out);

      in = "7*h$npo";
      out = toUpperCase(in);
      System.out.println("Input: " + in + "\tUppercased Output: " + out);
   }
}
