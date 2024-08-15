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

  public void showInfoTypes() {
    for (String info : infoTypes) {
      System.out.println(info);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Write any value");
    String data = scan.next();
    scan.close();
    Excersixes example = new Excersixes();
    example.inputAllBaseTypes(data);
    example.showInfoTypes();
  }
}
