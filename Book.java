
/**
 * this is a book
 */
public class Book extends Product {
    private String ISBN;
    
    public Book() {
        super();
        ISBN = "0000000000";
    }
    /**
     * @param id
     * @param title
     * @param price
     * @param quantity
     * @param isbn
     */
    public Book(long id, String title, double price, int quantity, String isbn) {
        super(id, title, price, quantity);
        ISBN = isbn;
    }
/**
 * 
 * @return ISBN
 */
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String isbn) {
        ISBN = isbn;
    }

    /**
     * @return a string that expalints the book
     */
    public String toString() {
        return String.format("%-10s\t%s\t%-10s", "Book", super.toString(), ISBN);
    }
}