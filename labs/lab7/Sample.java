public class Sample
{
   public static void main(String[] args) 
   {
      printSquare(4, 'O', 2);
      System.out.println();
      printSquare(4, 'X', 3);
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
   
   /* ===============================================================
      How to use indentCharLine() to draw a square:

      printSquare(i, c, n):

          Prints out a square - indented by i spaces -
          of height and width equal to n, using character c
      =============================================================== */
   public static void printSquare(int i, char c, int n)
   {
      int row, col;

      /* -----------------------------------------
         Print n rows of character c of width n
         ----------------------------------------- */
      for ( row = 0; row < n; row++ )
      {
         indentCharLine(i, c, n);
      }
   }
}
