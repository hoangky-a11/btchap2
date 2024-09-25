public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Author[name=%s,email=%s,gender=%c]", name, email, gender);
    }

    // Main method to test the Author class
    public static void main(String[] args) {
        // Create an instance of Author
        Author author = new Author("Hoang Ky", "mailcuaky@hmail.com", 'M');

        // Print author details
        System.out.println(author);
    }
}