public class Testbook {
    public static void main(String[] args) {
        // Create an array of authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Create a Book instance with multiple authors
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);

        // Print the Book instance
        System.out.println(javaDummy);  // Calls toString()
    }
}
