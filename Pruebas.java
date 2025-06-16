import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;

class Pruebas {
  public static void main(String[] args) {
    LocalDateTime fecha1 = LocalDateTime.now();
    LocalDateTime fecha2 = fecha1.plusSeconds(172800);

    if (fecha1.isAfter(fecha1)) {
      System.out.println("No saved");
    }else{
      System.out.println("Saved");
    }

  }
}