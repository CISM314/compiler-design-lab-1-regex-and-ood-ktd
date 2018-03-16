
package bankaccount;

/**
 *
 * @author NWUUser
 */
 public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount ktd = new BankAccount("20120", "Abdul Rahman Sherzad");

		ktd.deposit(500);
		ktd.deposit(1500);

		System.out.println("Balance is: " + ktd.getBalance()); // 2000

		ktd.withdraw(400);

		System.out.println("Balance is: " + ktd.getBalance()); // 1600
	}
 }