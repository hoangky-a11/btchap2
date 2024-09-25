public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck");
        System.out.println(c1);

        // Test Account class
        Account acc1 = new Account(101, c1, 500.0);
        System.out.println(acc1);

        acc1.deposit(150.0);
        System.out.println("Balance after deposit: " + acc1.getBalance());

        acc1.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + acc1.getBalance());

        acc1.withdraw(600.0); // Should show insufficient balance
    }
}

