package java_example_180524;

public class Ch6_20_ExerciseExample {

	public static void main(String[] args) {
		//새 예금 계좌를 만든다.
		Ch6_20_Exercise acct = new Ch6_20_Exercise();
		
		//계좌의 예금주를 "홍길동" 으로 한다.
		acct.setOwnerName("홍길동");
		
		//계좌번호는 101로 한다.
		acct.setAccountNumber(101);
		
		//계좌의 초기 입금액은 10000원이다.
		acct.setValance(10000);
		
		//계좌에 3000원을 입금한다.
		acct.deposit(3000);
		
		//계좌에서 5000원을 출금한다.
		acct.withdraw(17000);
		
		// 계좌의 내역을 출력한다.
		acct.result();

	}

}
