import java.util.Scanner;

public class AccountManager {
	public static void main(String[] args) {

		// array to store three BankAccount objects
		BankAccount bankAccounts[] = new BankAccount[3];

		Scanner scan = new Scanner(System.in);

		/*
		 * For loop to create 3 BankAccount objects. The BankAccount class takes
		 * 3 parameters: name, initial balance, account number.
		 */

		for (int i = 0; i < 3; i++) {
			System.out.println("What type of account is bank account" + (i + 1) + "?");
			String name = scan.nextLine();
			System.out.println("Do you happen to know your account number for bank account" + (i + 1) + "?");
			int accntNumber = scan.nextInt();
			System.out.println("What is your current balance in the account" + (i + 1) + "?");
			double balance = scan.nextDouble();
			bankAccounts[i] = new BankAccount(name, accntNumber, balance);
			scan.nextLine();
		}

		// Find out what the savings in all three banks are combined

		double total = 0;
		for (int i = 0; i < 3; i++) {
			total += bankAccounts[i].checkBalance();
		}
		System.out.println("You have " + total + " dollars in all three accounts.");
	}
}
