package src.chap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Excersixes {
  ArrayList<String> infoTypes = new ArrayList<String>();

  // ? R-1-1
  public String inputAllBaseTypes(String data) {
    if (data.equalsIgnoreCase("true") || data.equalsIgnoreCase("false")) {
      return "boolean type";
    } else {
      infoTypes.add("not boolean type");
      try {
        Integer.parseInt(data);
        return "int type";
      } catch (Exception e) {
        infoTypes.add("not int type");
        return "";
      }
    }
  }

  // ? R-1.3
  public void isMultiply(int num1, int num2, int multiply) {
    int iterator = num2;
    int it = 1;
    while (iterator <= num1) {
      if (iterator == num1) {
        System.out.println("si es multiplo");
        break;
      } else {
        System.out.println(iterator + " != " + num1 );
        it = it + 1;
        iterator = it * iterator;
      }
    }
  }
  public void isEven(int posibleEven){}

  public void showInfoTypes() {
    for (String info : infoTypes) {
      System.out.println(info);
    }
  }

  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Write any value");
    // String data = scan.next();
    // scan.close();
    // Excersixes example = new Excersixes();
    // example.inputAllBaseTypes(data);
    // example.showInfoTypes();

    // ? R-1.3
    Excersixes obj1 = new Excersixes();
    obj1.isMultiply(12, 2, 2);
  }
}
