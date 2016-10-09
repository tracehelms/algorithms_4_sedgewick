/* Greatest Common Denominator
 * Page 4
 */
public class EuclidGreatestCommonDenominator {

  public static void main(String args[]) {
    System.out.println(gcd(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }

  public static int gcd(int p, int q) {
    if (q == 0) {
      return p;
    }
    int remainder = p % q;
    return gcd(q, remainder);
  }
}
