public class Sample
{
   public static void main(String[] args) 
   {
      int i;

      /* -----------------------------------------
         Make sure user provides 1 argument
         ----------------------------------------- */
      if ( args.length != 1 )
      {
         System.err.println("Error: Program needs 1 integer as input");
	 System.exit(1);
      }

      /* -----------------------------------------
         Convert first argument to integer
         ----------------------------------------- */
      int n = Integer.parseInt( args[0] );

      /* -----------------------------------------------
         Use indentCharLine() to print a nxn square

         Print n rows of character 'X' of width n
         ----------------------------------------------- */
      for ( i = 0; i < n; i++ )
      {
         indentCharLine(1, 'X', n);
      }
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
