package chap_1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Excersixes {

  // ? R-1-1
  public String inputAllBaseTypes(String data) {

    return "result";
  }

  // ? R-1.3
  public void isMultiply(long m, long n) {
    if (m % n == 0) {
      System.out.println(m + " is a multiple of " + n);
    } else {
      System.out.println(m + " is not a multiple of " + n);
    }
  }

  // ? R-1.4
  // Your method cannot use the multiplication, modulus, or division operators
  public void isEven(int m) {
    if (m == 0) {
      System.out.println("is even");
    } else if (m == 1) {
      System.out.println("is odd");
    } else {
      isEven(m - 2);
    }
  }

  // ? R-1.5
  public int sumatoriaLess(int l) {
    if (l == 0) {
      return 0;
    }
    return l + sumatoriaLess(l - 1);
  }

  // ? R-1.5
  public void sumatoriaLess2(int l) {
    int total = 0;
    for (int i = 0; i <= l; i++) {
      total = total + i;
    }
    System.out.println("result is : " + total);
  }

  // ? R-1.6
  public void addOdd(int l) {
    int total = 0;

    for (int i = 0; i <= l; i++) {
      if (i % 2 != 0) {
        total = total + i;
      }
    }
    System.out.println("result is : " + total);
  }
  /**
   * R-1.7 Write a short Java method that takes an integer n and returns the sum of the
   * squares of all positive integers less than or equal to n.
   */
  public void addSquares(int l){
    int total = 0;

    for (int i = 0; i <= l; i++) {
      total = total + (i * i);
    }
    System.out.println("result is : " + total);
  }

  /**
   * R-1.8 Write a short Java method that counts the number of vowels in a given character
   * string.
   */
  public void countVowels(String string){
    
  }
  public static void main(String[] args) {
    Excersixes excersixes = new Excersixes();
    excersixes.isMultiply(3, 2);
    excersixes.isEven(11);
    excersixes.sumatoriaLess2(10);
    excersixes.addOdd(5);
    excersixes.addSquares(3);
  }
}
