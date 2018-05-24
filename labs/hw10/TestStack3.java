
public class TestStack3
{
   public static void main( String[] args )
   {

      double a, b, c;
      Stack  s = new Stack(100);


      if ( args.length == 0 )
      {
	  System.out.println("You need to provide a reverse polish expression");
	  System.out.println("Example 1: java TestStack3 4 5 +  (answer = 9)");
	  System.out.println("Example 2: java TestStack3 4 5 x 3 + (ans = 23)");
          System.exit(0);
      }

      for ( int i = 0; i < args.length; i++ )
      {
         System.out.println( "Next item = " + args[i] );

         if ( args[i].equals( "+" ) )
         {
            b = Double.parseDouble( s.pop() );
            a = Double.parseDouble( s.pop() );
	    c = a + b;
            s.push( Double.toString(c) );
         }
         else if ( args[i].equals( "-" ) )
         {
            b = Double.parseDouble( s.pop() );
            a = Double.parseDouble( s.pop() );
	    c = a - b;
            s.push( Double.toString(c) );
         }
         else if ( args[i].equals( "x" ) )
         {
            b = Double.parseDouble( s.pop() );
            a = Double.parseDouble( s.pop() );
	    c = a * b;
            s.push( Double.toString(c) );
         }
         else if ( args[i].equals( "/" ) )
         {
            b = Double.parseDouble( s.pop() );
            a = Double.parseDouble( s.pop() );
	    c = a / b;
            s.push( Double.toString(c) );
         }
         else 
         {
            s.push( args[i] );
         }

         System.out.println("Stack = " + s);
         System.out.println("----------------------------------------------");
      }

      System.out.println( s.pop() );
   }

}
