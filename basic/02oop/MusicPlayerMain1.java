package basic.02oop;

public class MusicPlayerMain1 {
  public static void main(String[] args) {
    int volume = 0;
    boolean isOn = false;

    // turn on
    isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");

    // 볼륨 증가
    volume++;
    System.out.println("volume: " + volume);
    // 볼륨 증가
    volume++;
    System.out.println("volume: " + volume);
    // 볼륨 감소
    volume--;
    System.out.println("volume: " + volume);
    // 음악 플레이어 상태
    System.out.println("음악 플레이어 상태 확인");
    if(isOn) {
      System.out.println("음악 플레이어 ON, volume: " + volume);
    } else System.out.println("음악 플레이어 OFF");
    
    // 음악 플레이어 끄기
    System.out.println("음악 플레이어를 종료합니다.");

  }
}
