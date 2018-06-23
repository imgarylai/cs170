
public class TestStack4
{
   public static void main( String[] args )
   {

      boolean r;

      String[] a = { "abc" };
      System.out.println( "\nTest 1:");
      r = PalinSentence.isPalinSentence( a );
      System.out.println( "output = " + r);
      System.out.println( "======== correct output is: ===========");
      System.out.println( "true");

      String[] b = { "abc", "abc" };
      System.out.println( "\nTest 2:");
      r = PalinSentence.isPalinSentence( b );
      System.out.println( "output = " + r);
      System.out.println( "======== correct output is: ===========");
      System.out.println( "true");

      String[] c = { "abc", "x", "abc" };
      System.out.println( "\nTest 3:");
      r = PalinSentence.isPalinSentence( c );
      System.out.println( "output = " + r);
      System.out.println( "======== correct output is: ===========");
      System.out.println( "true");

      String[] d = { "abc", "abc", "x" };
      System.out.println( "\nTest 4:");
      r = PalinSentence.isPalinSentence( d );
      System.out.println( "output = " + r);
      System.out.println( "======== correct output is: ===========");
      System.out.println( "false");

      String[] e = { "ab", "bc", "ac", "ac", "ac", "bc", "ab" };
      System.out.println( "\nTest 4:");
      r = PalinSentence.isPalinSentence( e );
      System.out.println( "output = " + r);
      System.out.println( "======== correct output is: ===========");
      System.out.println( "true");

      String[] f = { "ab", "bc", "c", "ac", "ac", "bc", "ab" };
      System.out.println( "\nTest 5:");
      r = PalinSentence.isPalinSentence( f );
      System.out.println( "output = " + r);
      System.out.println( "======== correct output is: ===========");
      System.out.println( "false");


   }

}
