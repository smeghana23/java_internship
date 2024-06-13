
public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savingsAccount = 
				new BankAccount(1254897345L, 100000.00f, "sowmya");
       // invoke the methods
		savingsAccount.showBalance();
		savingsAccount.depoist(10000.00f);
		savingsAccount.showBalance();
		savingsAccount.withdraw(5000.00f);
		savingsAccount.showBalance();
		
		BankAccount rdAccount = 
				new BankAccount(2458966L, 50000.00f, "sai");
		rdAccount.showBalance();
		rdAccount.depoist(10000.00f);
		rdAccount.showBalance();
		rdAccount.withdraw(10000.00f);
		rdAccount.showBalance();

	}

}
