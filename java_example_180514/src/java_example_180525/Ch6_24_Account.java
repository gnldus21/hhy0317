package java_example_180525;

public class Ch6_24_Account {
	//상수
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	//필드선언
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) 
	{
		//balance의 범위가  0보다크거나같고 1000000보다 작아야거나 같아야한다.
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
		{
			this.balance = balance;
		}
		else 
		{
			return;
		}
		
	}
	
}
