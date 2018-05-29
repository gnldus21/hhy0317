package java_example_180525;

import java.util.Scanner;

import text_model.Ch6_tt;

public class Ch6_ttExample {

	private static Ch6_tt[] tt = new Ch6_tt[100];
	private static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
	
			boolean run = true;
			
			while(run)
			{
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 >");
			
			int No = scan.nextInt();
			
			if(No == 1) 
			{
				createAccount();
				
			}
			else if(No == 2) 
			{
				accountList();
			}
			else if(No == 3) 
			{
				deposit();
			}
			else if(No == 4) 
			{
				withdraw();
			}
			else if(No == 5) 
			{
				run = false;
			}
			
		}
			System.out.println("종료합니다.");
}
	
	static String in0 = null; //계좌번호.
	static String in1 = null; //예금주
	static int in2 = 0;  //초기입금액
	static int don = 0; //입금액
	static int out = 0; //출금액
	//계좌생성
	private static void createAccount() 
	{
		int i = 0;
		while(true) 
		{
			if(tt[i]==null) 
			{
			System.out.println("-----------");
			System.out.println("   계좌생성     ");
			System.out.println("-----------");
			System.out.print("계좌번호  :");
			in0 = scan.next(); 
			System.out.print("계좌주  :");
			in1 = scan.next();
			System.out.print("초기입금액  :");
			in2 = scan.nextInt();
			tt[i] = new Ch6_tt(in0, in1, in2); //클래스로 넘어가서 초기화를 해줌.
			System.out.println("결과 : 계좌가 생성되었습니다.");
			break;
			}else
			{
			i++;
			}
		}
		
	}
	
	//계좌목록
	private static void accountList()  
	{
		
		System.out.println("-----------");
		System.out.println("   계좌목록     ");
		System.out.println("-----------");
		for(int i=0; tt[i]!=null; i++) { 
		System.out.println(tt[i].getAno()+" "+tt[i].getOwner()+" "+tt[i].getBalance());
		
		}
		
	}
	
	//예금하기
	private static void deposit() 
	{
		System.out.println("-----------");
		System.out.println("    예금     ");
		System.out.println("-----------");
		System.out.print("계좌번호 :");
		in0 = scan.next();
		System.out.print("예금액>");
		don = scan.nextInt();
		
		if(findAccount(in0)!=null)  //계좌번호(일치) 가 널이 아닐경우에만. 
		{
			findAccount(in0).setBalance(findAccount(in0).getBalance() + don);
			System.out.println("결과 : 예금액 ["+don+"] 이 정상 예금되었습니다.");
		}
		else 
		{
			System.out.println("계좌번호를 확인해주세요.");
		}
		
		
		
		
	}
	
	//출금하기
	private static void withdraw() 
	{
		System.out.println("-----------");
		System.out.println("    출금     ");
		System.out.println("-----------");
		System.out.print("게좌번호 :");
		in0 = scan.next();
		System.out.print("출금액>");
		out = scan.nextInt();
		if(findAccount(in0)!=null) 
		{
			if(findAccount(in0).getBalance()>=out) 
			{
				findAccount(in0).setBalance(findAccount(in0).getBalance() - out);
				System.out.println("결과 :  ["+out+"]원이 출금됩니다.");
				System.out.println("현재 잔고 ["+findAccount(in0).getBalance()+"]원 입니다.");
			}
			else
			{
				System.out.println("잔고가 부족합니다.");
			}
		}
		else 
		{
			System.out.println("계좌번호를 확인해주세요.");
		}
	}
		
		//Account 배열에서 ano와 동일한  Account 객체 찾기
		private static Ch6_tt findAccount(String ano) 
		{
			for(int i=0; tt[i]!=null; i++) 
			{
				if(tt[i].getAno().equals(ano)) 
				{
					return tt[i];
				}
				
			}
			
			return null;
			
		}
		
	
	
}



