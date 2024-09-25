public class Book {
    private String name;
    private int qty;
    private double price;
    private Author[] authors;

    // Constructor for a book with only name, quantity, and price
    public Book(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.authors = new Author[0]; // Initialize authors to an empty array
    }

    // Constructor for a book with multiple authors
    public Book(String name, Author[] authors, double qty, double price) {
        this.name = name;
        this.authors = authors;
        this.qty = (int) qty;
        this.price = price;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder authorString = new StringBuilder("authors={");
        for (int i = 0; i < authors.length; i++) {
            authorString.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorString.append(", ");
            }
        }
        authorString.append("}");

        return "Book[name=" + name + "," + authorString + ",price=" + price + ",qty=" + qty + "]";
    }
}
