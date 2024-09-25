public class TestAuthor {
    public static void main(String[] args) {
    // Test the constructor
    Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
    System.out.println(ahTeck);  // Test toString()

    // Test setter and getters
    ahTeck.setEmail("paulTan@nowhere.com");
    System.out.println("name is: " + ahTeck.getName());     // Test getter
    System.out.println("email is: " + ahTeck.getEmail());   // Test getter
    System.out.println("gender is: " + ahTeck.getGender()); // Test getter
}
}