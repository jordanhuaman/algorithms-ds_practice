public class Enum {
  public static void main(String[] args) {
    String fale = "male";
    GENDER gender = switch (fale.toLowerCase()) {
      case "male" -> GENDER.MALE;
      case "female" -> GENDER.FEMALE;
      default -> GENDER.OTHER;
    };
  }
}
