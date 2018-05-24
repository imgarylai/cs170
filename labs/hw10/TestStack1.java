
public class TestStack1
{
   public static void main( String[] args )
   {

      Stack  s = new Stack(100);

      s.push( "3" );
      s.push( "-" );
      s.push( "2" );
      s.push( "+" );
      s.push( "1" );

      System.out.println( "The stack contains: ");
      System.out.println( s );
      System.out.println("s.size() = " + s.size() );

      System.out.println( "\n======== correct output is: ===========");
      System.out.println( "The stack contains: ");
      System.out.println( "1\n+\n2\n-\n3\n");
      System.out.println( "s.size() = 5");
   }

}
