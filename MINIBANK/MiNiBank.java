public class MiNiBank {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new Account("Alice", 1000);
        accounts[1] = new Account("Bob");
        accounts[2] = new Account("Charlie", 2500);

        accounts[0].deposit(500);
        accounts[0].withdraw(200);

        accounts[1].deposit(1500);
        accounts[1].withdraw(2000);

        accounts[2].deposit(300);
        accounts[2].withdraw(500);

        for (Account account : accounts) {
            System.out.println(
                account.getOwnerName() + " | " +
                account.getAccountNumber() + " | Balance: " +
                account.getBalance()
            );
        }
    }
}

class Customer {
    private String name;
    private String email;
    private String mobile;
    private final String customerId;
    private static long customerCounter = 100;

    public Customer(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.customerId = generateCustomerId();
    }

    private static String generateCustomerId() {
        customerCounter++;
        return "CUST" + customerCounter;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCustomerId() {
        return customerId;
    }
}

class Account {
    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;
    private static long accountCounter = 0;

    public Account(String ownerName, long openingBalance) {
        this.ownerName = ownerName;
        this.balance = openingBalance;
        this.active = true;
        this.accountNumber = generateAccountNumber();
    }

    public Account(String ownerName) {
        this(ownerName, 0);
    }

    private static String generateAccountNumber() {
        accountCounter++;
        return "AC" + String.format("%04d", accountCounter);
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(long amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}
