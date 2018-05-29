package java_example_180525;

public class Ch6_24_AccountExample {

	public static void main(String[] args) {
		Ch6_24_Account acc = new Ch6_24_Account();
		
		acc.setBalance(10000);
		System.out.println("현재잔고 : " + acc.getBalance());
		
		acc.setBalance(-100);
		System.out.println("현재잔고 : " + acc.getBalance());
		
		acc.setBalance(2000000);
		System.out.println("현재잔고 : " + acc.getBalance());
		
		acc.setBalance(30000);
		System.out.println("현재잔고 : " + acc.getBalance());
		
	}

}
