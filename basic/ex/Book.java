package basic.ex;

public class Book {
  String title;
  String author;
  int page;

  Book() {
    
  }
  Book(title, author) {
    this(title, author);
  }
  Book(title, author, page) {
    this(title, author, page);
  }
  static void displayInfo() {
    System.out.println("제목: " + title + "저자: " + author + "페이지 수: " + page);
  }
}
