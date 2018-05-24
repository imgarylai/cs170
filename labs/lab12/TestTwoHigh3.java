
/* ---------------------------------------------
   Test 3: check the beats methods
   --------------------------------------------- */


public class TestTwoHigh3
{
   public static void main( String[] args )
   {
      TwoHighCard a = new TwoHighCard( 4, 2 );
      TwoHighCard b = new TwoHighCard( 3, 2 );
      TwoHighCard c = new TwoHighCard( 4, 1 );

      System.out.println( "The cards:" );
      System.out.println( a + " rank = " + a.rank() );
      System.out.println( b + " rank = " + b.rank() );
      System.out.println( c + " rank = " + c.rank() );

      System.out.println( "\nTesting beats():" );
      System.out.println( a + " beats " + b + ": " + a.beats(b) );
      System.out.println( a + " beats " + c + ": " + a.beats(c) );
      System.out.println( b + " beats " + a + ": " + b.beats(a) );
      System.out.println( b + " beats " + c + ": " + b.beats(c) );
      System.out.println( c + " beats " + a + ": " + c.beats(a) );
      System.out.println( c + " beats " + b + ": " + c.beats(b) );
   }
}
