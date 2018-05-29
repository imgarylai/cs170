
/* ----------------------------------------------------------------
   Java program that convert Farenheit to Celcius and vice versa
   ---------------------------------------------------------------- */
public class FtoC {
    public static double FtoC(double x) {
        // input: x = temp in degree in F
        // Compute: r = temp in degree C

        double r;

        // Write these statements:

        // 1. compute: x - 32 and store result in variable r

        // 2. then multiply r by 5 and store in r

        // 3. then divide r by 9 and store in r

        // 4. then return r
    }

    public static double CtoF(double x) {
        // input: x = temp in degree in C
        // Compute: r = temp in degree F

        double r;

        // Write these statements:

        // 1. compute: 9*x and store result in variable r

        // 3. then divide r by 5 and store in r

        // 2. then add 32 to r and store in r

        // 4. then return r
    }

    public static boolean testFtoC(double A, double G) {
        System.out.print("Calling FtoC(" + A + ") ... ");

        double result = FtoC(A);

        if (Math.abs(result - G) < 0.000001) {
            System.out.println("FtoC = " + result + ", good.");
            return true; // true means "test successful"
        } else {
            System.out.println("FtoC = " + result + " not " + G + ", ERROR!");
            return false; // false means "test failed"
        }
    }

    public static boolean testCtoF(double A, double G) {
        System.out.print("Calling CtoF(" + A + ") ... ");

        double result = CtoF(A);

        if (Math.abs(result - G) < 0.000001) {
            System.out.println("CtoF = " + result + ", good.");
            return true; // true means "test successful"
        } else {
            System.out.println("CtoF = " + result + " not " + G + ", ERROR!");
            return false; // false means "test failed"
        }
    }

    /*
     * Method main is our main entry point.
     */
    public static void main(String args[]) {
        testFtoC(32.0, 0.0);
        testFtoC(98.0, 36.666666666666);
        testFtoC(50.0, 10.0);
        System.out.println();

        testCtoF(0.0, 32.0);
        testCtoF(10.0, 50);
        testCtoF(36.6666666666, 98.0);
        System.out.println();
    }
}