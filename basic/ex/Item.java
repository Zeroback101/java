package basic.ex;

public class Item {
  private String product;
  private int price;
  private int count;

  public Item(String product, int price, int count) {
    this.product = product;
    this.price = price;
    this.count = count;
  }

  public String getName() {
    return product;
  }
  public String getTotalPrice() {
    return price*count;
  }
}
