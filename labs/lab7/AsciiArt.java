public class AsciiArt {
    public static void main(String[] args) {
        printTriangle(7, 'A');
        printColumn(4, 5, 9,'X');
    }
   
   
    //   repeatChar(c,n): Prints the character c, n times.
    public static void repeatChar(char c, int n) {
        for(int j=0; j<n; j++) {
            System.out.print(c);   
        }
    }
   
    //   indentCharLine(i, c, n):
    //  
    //       First, it prints i spaces (i.e., indents i positions)
    //       Then, it prints the character c, n times.
    //       Finally, it prints NEWLINE (to start a new line)
    public static void indentCharLine(int i, char c, int n) {
        repeatChar(' ',i);
        repeatChar(c,n);
        repeatChar('\n',1);
    }
   
   
    //   TODO: write this method
    //   printColumn(i, w, h, c):
    //    
    //       Prints out a column - indented by i positions- 
	//   of width w and heigh h.
    // 
    //       The character used to print is passed as a parameter to
    //       the method by the variable c.
    //    
    //   NOTE: This method uses the "indentCharLine" method inside.
   
    public static void printColumn(int i, int w, int h, char c) {

    }
   
    //   TODO: write this method
    // 
    //   printTriangle(h, c):
    // 
    //       Prints out a triangle with heigh equals to h using char c
    // 
    //   Example:
    // 
    //   printTriangle(3, 'A'):
    // 
    //          A
    //         AAA
    //        AAAAA
    // 
    //   NOTE: This method uses the "indentCharLine" method inside.
    public static void printTriangle(int h, char c) {

    }
}
