package basic.02oop;

public class MusicPlayerMain2 {
  public static void main(String[] args) {
    MusicPlayerData data = new MusicPlayerData();

    // turn on
    data.isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");

    // 볼륨 증가
    data.volume++;
    System.out.println("volume: " + data.volume);
    // 볼륨 증가
    data.volume++;
    System.out.println("volume: " + data.volume);
    // 볼륨 감소
    data.volume--;
    System.out.println("volume: " + data.volume);
    // 음악 플레이어 상태
    System.out.println("음악 플레이어 상태 확인");
    if(data.isOn) {
      System.out.println("음악 플레이어 ON, volume: " + data.volume);
    } else System.out.println("음악 플레이어 OFF");
    
    // 음악 플레이어 끄기
    System.out.println("음악 플레이어를 종료합니다.");

  }
}
