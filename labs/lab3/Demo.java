public class Demo {
  /*
   *  Define the method f(x) = x^2
   */
  public static double f(double x) {
    double y;

    // square of x
    y = x * x; 
    // Return the value y (which is equal to x^2)
    return (y); 
  }

  public static void main(String[] args) {
    double x = 3.0;
    double y;

    y = f(2.0);
    System.out.println(y); // will print 4.0
    y = f(x);
    System.out.println(y); // will print 9.0
  }
}