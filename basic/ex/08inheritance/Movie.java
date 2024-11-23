package basic.ex.08inheritance;

public class Movie extends Item{

  private String director;
  private String actor;

  public Book(String name, int price, String director, String actor) {
    super(name, price);
    this.director = director;
    this.actor = actor;
  }
}
