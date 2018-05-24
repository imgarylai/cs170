public class Triangle2
{
   public static void main(String[] args) 
   {
      /* -----------------------------------------
         Make sure user provides 1 argument
         ----------------------------------------- */
      if ( args.length != 1 )
      {
         System.err.println("Error: Program needs 1 integer as input");
         System.exit(1);
      }

      /* -----------------------------------------
         Convert second argument to integer
         ----------------------------------------- */
      int n = Integer.parseInt( args[0] );


      /* *********************************************************
         +---------+
         |  TODO:  |
         +---------+

         Use a for-loop to print the following triangle:

              X     ^
             XX     |
            ...     |  n rows
           XXXX     |
          XXXXX     |
         XXXXXX     v
         <---->
         base = n

         ++++ Note: the body of the for-loop uses the method
	            indentCharLine()
         ********************************************************* */



   }
   
   
   /* ---------------------------------------------------------------
      repeatChar(c,n): Prints the character c, n times.
      --------------------------------------------------------------- */
   public static void repeatChar(char c, int n)
   {
      for(int j=0; j<n; j++)
         System.out.print(c);   
   }
   
   /* ----------------------------------------------------------------
      indentCharLine(i, c, n):

          First, it prints i spaces (i.e., indents i positions)
          Then, it prints the character c, n times.
          Finally, it prints NEWLINE (to start a new line)
      ---------------------------------------------------------------- */
   public static void indentCharLine(int i, char c, int n)
   {
      repeatChar(' ',i);
      repeatChar(c,n);
      repeatChar('\n',1);
   }
   
}
