import java.time.LocalDate;
import java.time.YearMonth;

public class Time{
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalDate date2 = LocalDate.parse("2007-12-03");
    LocalDate initiaYear = LocalDate.parse("2007-01-03");
    LocalDate beforeYear = initiaYear.minusMonths(1);
    System.out.println(beforeYear);

    System.out.println(date2.getMonth().toString());
    System.out.println(date2.minusMonths(2));

    YearMonth month = YearMonth.from(date);
    LocalDate monthDay1 = month.atDay(1);
    LocalDate monthLastDay = month.atEndOfMonth();

    System.out.println(date);
    System.out.println(date2);
    System.out.println(date.isBefore(date2));
    System.out.println(month);

    System.out.println(monthDay1.isBefore(date));
    System.out.println(monthLastDay);
  }
}