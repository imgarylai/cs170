/**
 * Class Perfect finds all perfect numbers <= 10000
 * 
 */
public class Perfect
{
    /**
     * This method finds the sum of all the divisors of a given number n
     * that are <= (n-1)
     *
     * @param  n   the input number n
     * @return     the sum of all divisors of n that are <= (n-1)
     */
    public static int sumFactors(int n)
    {
        int sum = 0;

	// Find all divisors of the input number n that are <= (n-1)
	// In other words:
	//    For each number: 1, 2, 3, 4, 5, ...., n-1
	//        test if the number is a divisor of n
	// Use the "running sum" algorithm to compute the 
	// sum of all its divisors



        return sum;
    }

    /**
     * This method check if a number n is a "perfect number"
     *
     * A number n is "perfect" if the sum of all divisors of n 
     * that are <= (n-1) is equal to the number itself
     *
     * In other words:   sumFactors(n) is equal to n
     *
     * Example: the number 6 is a perfect number
     *          Divisor of 6 are: 1, 2, 3,   The sum = 1 + 2 + 3 = 6
     *          The sum of its divisors = the number itself (6)
     *
     * @param n the input number
     * @return  true is n is perfect, false otherwise
     */
    public static boolean isPerfect(int n)
    {
        boolean x = false;

	// Make x equal to true if the number n is perfect
	// Otherwise, make x equal to false



        return x;
    }

    public static void main(String[] args)
    {
       int n;

       for ( n = 2; n <= 10000; n++ )
	  if ( isPerfect(n) )
	     System.out.println("Perfect number: " + n);
    }
}
