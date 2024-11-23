package basic.ex.08inheritance;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("java", 10000, "kim", "sdfsd");
        Album album = new Album("album", 15000, "soe");
        Movie movie = new Movie("movie", 1232, "kim", "seo");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("sum = " + sum);
    }
}
