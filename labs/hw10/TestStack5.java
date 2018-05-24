
public class TestStack5
{
   public static void main( String[] args )
   {
      if ( args.length == 0 )
      {
          System.out.println("You need to provide a few words");
          System.out.println("Example1: java TestStack5 ab x ab (ans = true)");
          System.out.println("Example2: java TestStack5 a x ab  (ans = false)");
          System.exit(0);
      }


      System.out.println( PalinSentence.isPalinSentence( args ) ) ;
   }

}
