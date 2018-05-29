
/**
 * Write a description of class Euclid3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Euclid3{

    /**
     * An example of a GCD
     * 
     * @param  x  a sample parameter for a method
     * @param  y  a sample parameter for a method
     * @return    the GCD of x and y
     */
    public static int gcd(int x, int y)
    {
        // put your code here
        if(y==0) {
            return x; 
        } else {
            return x % y == 0 ? y : gcd(y, x % y);
        }
    }
    
    public static void main(String args[]) {
        System.out.println("Calling gcd(36, 28) ... GCD = " + gcd(36, 28));
        System.out.println("Calling gcd(28, 36) ... GCD = " + gcd(36, 28));
        System.out.println("Calling gcd(255, 190) ... GCD = " + gcd(255, 190));
        System.out.println("Calling gcd(0, 5) ... GCD = " + gcd(0, 5));
        System.out.println("Calling gcd(7, 0) ... GCD = " + gcd(7, 0));
        System.out.println("Calling gcd(2100000001, 2) ... GCD = " + gcd(7, 0));
        System.out.println("Calling gcd(3, 2100000000) ... GCD = " + gcd(7, 0));
    }
}
