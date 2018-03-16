
package bankaccount;

/**
 *
 * @author NWUUser
 */
public class SavingsAccountDemo {

	public static void main(String[] args) {
		SavingsAccount ktd = new SavingsAccount("20120",
				"Kamo Tsepo Desire", 10);
		ktd.deposit(500);
		System.out.println("Balance Before Interest: " + ktd.getBalance());

		ktd.addInterest();
		System.out.println("Balance After Interest: " + ktd.getBalance());
	}
 }