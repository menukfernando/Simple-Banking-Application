# Simple Banking Application

This is a simple console-based banking application implemented in Java. It allows users to perform basic banking operations such as depositing money, withdrawing money, checking balance, and viewing transaction history.

## Features

- **Deposit**: Users can deposit a specified amount into their account.
- **Withdraw**: Users can withdraw a specified amount from their account.
- **Check Balance**: Users can check their current account balance.
- **View Transactions**: Users can view their previous transactions.

## How to Use

1. Clone the repository to your local machine.
2. Navigate to the directory where the project is cloned.
3. Compile the Java files using a Java compiler (e.g., `javac BankAccount.java`).
4. Run the compiled Java file (e.g., `java BankAccount`).

Once the program is running, follow the on-screen instructions to interact with the banking application. Use the menu options to perform various operations.

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount("Menuk Fernando", "BA1002");
        BA.menuList();
    }
}
```
## Contributions

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
