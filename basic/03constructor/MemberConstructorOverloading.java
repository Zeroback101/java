package basic.03constructor;

public class MemberConstructorOverloading {
  String name;
  int age;
  int grade;

  MemberConstructorOverloading(String name) {
    this(name, 20, 0);
    System.out.println("이름: " + name);
  }
  MemberConstructorOverloading(String name, int age) {
    this(name, age, 0);
    System.out.println("이름: " + name + "나이: "+ age);
  }
  MemberConstructorOverloading(String name, int age, int grade) {
    this(name, age, grade);
    System.out.println("이름: " + name + "나이: "+ age + "성적: " + grade);
  }
}
