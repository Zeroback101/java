package basic.ex.08inheritance;

public class Book extends Item{

  private String author;
  private int isbn;

  public Book(String name, int price, String author, int isbn) {
    super(name, price);
    this.author = author;
    this.isbn = isbn;
  }
}