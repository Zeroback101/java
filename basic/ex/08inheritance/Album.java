package basic.ex.08inheritance;

public class Album extends Item{

  private String artist;

  public Album(String name, int price, String artist) {
    super(name, price);
    this.artist = artist;
  }
}