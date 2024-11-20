package basic.ex;

public class ShoppintCart {
  private Item[] items = new Item[10];
  private int totalCount = 0;

  public void addItem(Item item) {
    if(totalCount >= items.length) {
      System.out.println("장바구니가 가득 찼습니다.");
      return;
    } 
    items[totalcount] = item;
    totalcount++;
  }
  public void displayItems() {
    System.out.println("장바구니 상품 출력");
    int totalPrice = 0;
    for(int i=0; i<totalcount; i++) {
      Item item = items[i];
      totalPrice += item.getTotalPrice();
      System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice());
    }
    System.out.println("전체 가격 합: " + totalPrice);
  }
}
