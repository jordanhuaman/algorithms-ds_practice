package src;

public class Test {
  private final Counter defectValue = new Counter();

  public Counter multipleReturnValues() {
    return this.defectValue;
  }

  public int acceptingReferences(Counter data) {
    return data.getCount();
  }
}
