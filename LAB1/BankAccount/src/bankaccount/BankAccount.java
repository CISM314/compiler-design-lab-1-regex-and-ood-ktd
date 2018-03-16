package bankaccount;

public class BankAccount {
	// BankAccount attributes
	private final String accountNumber;
	private final String accountName;
	private double balance;

	
	public BankAccount(String accNumber, String accName) {
		accountNumber = accNumber;
		accountName = accName;
		balance = 0;
	}

	
	public String getAccountName() {
		return accountName;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		} else {
			return false;
		}
	}

	
	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}
}
