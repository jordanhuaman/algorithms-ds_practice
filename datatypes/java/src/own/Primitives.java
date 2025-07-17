// package datatypes.java.src.own;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Primitives {
  public static void main(String[] args) {
    System.out.println((double) 5 / 3);
    System.out.println((float) 5 / 3);
    System.out.println(BigDecimal.valueOf((float)5/3));
  }

  public static Integer working(int x, int y) {

    /**
     * <p>
     * Divie 2 int return entire part AND rest part
     * </p>
     */
    var entire = x / y;
    var rest = x % y;

    /**
     * <p>
     * We can cast the result to obtain the real division
     * </p>
     */
    var real = (double) x / y;
    var real2 = (float) x / y;

    /**
     * <p>BigDecimal and BigInteger both are used to work with ilimited memory over than 32 and 64 bits</p>
     */

    var withBig = BigDecimal.valueOf(real);
    var withBig2 = BigDecimal.valueOf(real2);
    return x / y;
  }
}
