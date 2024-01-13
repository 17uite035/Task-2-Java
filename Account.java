public class Account {
	private double balance;
	
	public Account()
	{
		this.balance= 0;
	}
	public Account(double balance)
	{
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		balance+= amount;
	}
	public void withdraw(double amount)
	{
		if(amount<= balance) {
		balance -= amount;}
		else {
			System.out.println("insufficent balance");
		}
	}
	public void displayBalance()
	{
		System.out.println("Balance:"+this.balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account();
		account1.deposit(500);
		account1.withdraw(200);
		account1.displayBalance();
		
		Account account2 = new Account(1000);
		account2.deposit(500);
		account2.withdraw(200);
		account2.displayBalance();
	}

}
