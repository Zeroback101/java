package basic.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  public static void main(Strings[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("입력할 주문의 개수를 입력하세요: ");
    int n = scanner.nextInt();
    scanner.nextLine();

    ProductOrder[] orders = new ProductOrder[n];
    for(int i = 0; i<orders.length; i++) {
      System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
      System.out.print("상품명: ");
      String productName = scanner.nextLine();
      System.out.print("가격: ");
      int price = scanner.nextLine();
      System.out.print("수량: ");
      int quantity = scanner.nextLine();
      scanner.nextLine();

      orders[i] = createOrder(productName, price, quantity);
    }
  }
}
