package basic.03constructor;

public class MemberInit {
  String name;
  int age;
  int grade;

  void initMember(String name, int age, int grade) {
    this.name = name; // this.[var] -> 자기자신의 인스턴스
    this.age = age;
    this.grade = grade;
  }
}
