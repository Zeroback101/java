package basic.04package;

import basic.04package.a;

public class PackageMain3 {
  public static void main(String[] args) {
    User userA = new User();
    basic.04package.b.User userB = new basic.04package.b.User(); // 같은이름은 한번만 임포트 가능
  }
}
