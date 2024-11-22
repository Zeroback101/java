package basic.ex;

public class MathArrayUtils {
  private MathArrayUtils {
    // 인스턴스 생성을 막는다.
  }
  
  public static int sum(int[] values) {
    int sum_v = 0;
    for(int value : values) {
      sum_v += value;
    }
    return sum;
  }
  public static double average(int[] values) {
    return (double) sum(values) / values.length;
  }
  public static int min(int[] values) {
    int minValue = values[0];
    for(int i=1; i<values.length; i++) {
      if(minValue > i) minValue = i;
    }
    return minValue;
  }
  public static int min(int[] values) {
    int maxValue = values[0];
    for(int i=1; i<values.length; i++) {
      if(maxValue > i) maxValue = i;
    }
    return maxValue;
  }
}
