
package bankaccount;

/**
 *
 * @author desir
 */
public class CheckingAccountDemo {
   public static void main(String[] args) {
   	CheckingAccount ktd = new CheckingAccount("20120",
   			"Kamo Tsepo Desire");

   	ktd.deposit(500);
   	ktd.withdraw(200);
   	ktd.deposit(700);
   	
   	ktd.deductFees();
   	System.out.println("transactions <= 3: " + ktd.getBalance());

   	
   	ktd.deposit(200);
   	
   	ktd.deductFees();
   	System.out.println("transactions > 3: " + ktd.getBalance());
   }
}
