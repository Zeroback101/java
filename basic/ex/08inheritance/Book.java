package basic.ex.08inheritance;

public class Book extends Item{

  private String author;
  private int isbn;

  public Book(String name, int price, String author, int isbn) {
    super(name, price);
    this.author = author;
    this.isbn = isbn;
  }

  @Override
  public void print() {
    System.out.println("이름: " + name + "가격: " + price);
    System.out.println("저자: " + author + "isbn: " + isbn);
  }
}
