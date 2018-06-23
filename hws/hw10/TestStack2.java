
public class TestStack2
{
   public static void main( String[] args )
   {

      Stack  s = new Stack(100);

      s.push( "3" );
      s.push( "-" );
      s.pop();
      System.out.println( s );
      System.out.println("s.size() = " + s.size() );
      s.push( "+" );
      s.push( "2" );
      s.push( "+" );
      s.pop();
      System.out.println( s );
      System.out.println("s.size() = " + s.size() );
      s.push( "-" );
      s.push( "1" );
      System.out.println( s );
      System.out.println("s.size() = " + s.size() );

      for ( int i = 0; i < 5; i++ )
         System.out.println( s.pop() );

      System.out.println( "\n======== correct output is: ===========");
      System.out.println( " 3");
      System.out.println("s.size() = 1");
      System.out.println( " 3 + 2");
      System.out.println("s.size() = 3");
      System.out.println( " 3 + 2 - 1");
      System.out.println("s.size() = 5");
      System.out.println( "1\n-\n2\n+\n3\n");
   }

}
