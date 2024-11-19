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
    printOrders(productOrders);
    int amout = getTotalAmout(productOrders)
    System.out.println("총 결제 금액: " + amout);
  }
  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder productOrder = new ProductOrder();
    productOrder.productName = productName;
    productOrder.price = price;
    productOrder.quantity = quantity;
    return productOrder;
  }

  static void printOrders(ProductOrder[] orders) {
    for(ProductOrder order: orders) {
      System.out.println("상품명: " + order.productName + "가격: " + order.price + "수량: " + order.quantity);
    }
  }

  static int getTotalAmout(ProductOrder[] orders) {
    int total = 0;
    for(ProductOrder order: orders) {
      total += order.price * order.quantity;
    }
    return total;
  }
}
  

