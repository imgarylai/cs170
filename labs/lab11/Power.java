public class Power {
  public static int power(int a, int n) {

  }

  public static void testPower(int a, int n, int G) {
    System.out.print("Calling power(" + a + "," + n + ") ... ");

    int result = power(a, n);

    if (result == G) {
      System.out.println(a + "^" + n + " = " + result + ", good.");
    } else {
      System.out.println(a + "^" + n + " = " + result + ", not " + G + ", ERROR!");
    }
  }

  public static void main(String args[]) {
    testPower(2, 0, 1);
    testPower(5, 0, 1);
    testPower(4, 1, 4);
    testPower(4, 2, 16);
    testPower(2, 3, 8);
    testPower(7, 5, 16807);
    testPower(7, 9, 40353607);

    System.out.println();
  }

}
