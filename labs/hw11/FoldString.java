/**
 * Class FoldString - fold a word
 * 
 */
public class FoldString
{
    public static void main(String[] args)
    {
       String x;

       x = "abba";
       System.out.println("String '"+x+"' - Folded = " +
		hw11.foldString(x));

       x = "deified";
       System.out.println("String '"+x+"' - Folded = " +
		hw11.foldString(x));

       x = "kayak";
       System.out.println("String '"+x+"' - Folded = " +
		hw11.foldString(x));

       x = "aruba";
       System.out.println("String '"+x+"' - Folded = " +
		hw11.foldString(x));

       x = "atlanta";
       System.out.println("String '"+x+"' - Folded = " +
		hw11.foldString(x));
    }
}
