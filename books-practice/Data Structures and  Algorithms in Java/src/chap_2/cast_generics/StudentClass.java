package chap_2.cast_generics;

/**
 * StudentClass
 */
public class StudentClass implements PersonInterface {
  String name;
  String id;
  int age;

  public StudentClass(String i, String n, int a) {
    id = i;
    name = n;
    age = a;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(PersonInterface other) {
    if (!(other instanceof StudentClass))
      return false;
    StudentClass s = (StudentClass) other;
    return id.equals(s.id);
  }

}