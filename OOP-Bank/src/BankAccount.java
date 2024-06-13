
public class BankAccount {
	float balance;
	long acntNo;
	String acntHolderName;
//	constructor - to intialize object variables - intialization means first time assigning the values for variables
	public BankAccount(long acntNo, float balance, String acntHolderName) {
		this.acntNo = acntNo;
		this.balance = balance;
		this.acntHolderName = acntHolderName;
	}
	public void depoist(float amount) {
		balance = balance + amount;
	}
	public void withdraw(float amount) {
		balance = balance - amount;
	}
	public void showBalance() {
		System.out.println("Current Balance : " +balance);
	}

}
// the keyword "this" belong to current object