package basic.03constructor;

public class MemberConstructor {
  String name;
  int age;
  int grade;

  MemberConstructor(String name, int age, int grade) {
    System.out.println("이름: " + name + "나이: "+ age + "성적: " + grade);
    this.name = name; // this.[var] -> 자기자신의 인스턴스
    this.age = age;
    this.grade = grade;
  }
}
