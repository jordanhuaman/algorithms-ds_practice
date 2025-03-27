package chap_2.excersices;

public class Maryland extends State {
  public void printMe() {
    System.out.println("Read it.");
  }

  public static void main(String[] args) {
    Region east = new State();
    State md = new Maryland();
    Object obj = new Place();
    @SuppressWarnings("unused")
    Place usa = new Region();
    md.printMe();
    east.printMe();
    ((Place) obj).printMe();
    ((Region) obj).printMe();
    usa = md;
  }
}

class State extends Region {
  State() {
  }

  public void printMe() {
    System.out.println("Ship it.");
  }
}

class Region extends Place {
  Region() {
  }

  public void printMe() {
    System.out.println("Box it.");
  }
}

class Place extends Object {
  Place() {
  }

  public void printMe() {
    System.out.println("Buy it.");
  }
}
