package quiz;

public class BankAccoun {
	
	double money = 0;

	void deposit(double cash) {
		this.money += cash;
	}

	void withdraw(double cash) {
		this.money -= cash;

	}
	
	void showBalance() {
		System.out.println("The balance of the account is " + money);
	}
	
}
