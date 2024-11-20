package basic.04package;

import basic.04package.a.User; // import: 다른 패키지에 있는 경우
import basic.04package.a.* // 해당 패키지의 모든 파일을 임포트
  
public class PackageMain2 {
  public static void main(String[] args) {
    Data data = new Data();
    User user = new User(); 
  }
}
