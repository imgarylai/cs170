/**
 * Class Palindrome - check is a word is a palindrome
 * 
 */
public class Palindrome
{
    public static void main(String[] args)
    {
       String x;

       x = "abba";
       System.out.println("String '"+x+"' is a palindrome: "+
		hw11.isPalindrome(x));

       x = "deified";
       System.out.println("String '"+x+"' is a palindrome: "+
		hw11.isPalindrome(x));

       x = "kayak";
       System.out.println("String '"+x+"' is a palindrome: "+
		hw11.isPalindrome(x));

       x = "aruba";
       System.out.println("String '"+x+"' is a palindrome: "+
		hw11.isPalindrome(x));

       x = "atlanta";
       System.out.println("String '"+x+"' is a palindrome: "+
		hw11.isPalindrome(x));
    }
}
