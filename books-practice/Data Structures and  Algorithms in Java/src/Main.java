// package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {
  public final Counter data = new Counter();

  public static void main(String[] args) {
    Counter objet = new Counter(12);
    Counter object1 = objet;
    Counter object2 = object1;
    Test info = new Test();

    // Counter nullObject;
    // System.out.println(objet.getCount());
    // System.out.println(object1.getCount());
    // System.out.println(object2.getCount());

    // ? Retornamos una clase con multiples posibles salidas
    // System.out.println("aqui " + info.multipleReturnValues().getCount());

    // ? aceptando referencias ya hechas
    // System.out.println("aqui2 " + info.acceptingReferences(object2));

    // ? Static method without instances
    // Counter.SeeInfo();
    // ? How works final instances
    // System.out.println();
    // System.out.println(LocalDateTime.now());
    // System.out.println(Instant.now());
    LocalDateTime now = LocalDateTime.now();
    Instant nowi = Instant.now();
    

    System.out.println(now);
    System.out.println(nowi);
    System.out.println(now.toInstant(ZoneOffset.UTC));
    System.out.println(LocalDate.now(ZoneOffset.UTC));

  }

}
