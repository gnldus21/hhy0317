package text_model;

import java.util.Scanner;

public class test {

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
	
	static String ano = null;
	static String name = null;
	static int first = 0;
	static int in = 0;
	static int out = 0;
	
	
	//계좌생성
	private static void createAccount() 
	{
		int i = 0;
		while(true) 
		{
		if(tt[i]==null) 
		{
		System.out.println("-----------------");
		System.out.println("-----계좌생성------");
		System.out.println("-----------------");
		System.out.print("계좌번호 입력>");
		ano = scan.next();
		System.out.print("계좌주 입력>");
		name = scan.next();
		System.out.print("초기입금액 입력>");
		first = scan.nextInt();
		tt[i]= new Ch6_tt(ano, name, first);
		System.out.println("계좌가 성공적으로 생성되었습니다.");
		break;
		}
		i++;
		}
		
		
		
	}
	
	//계좌목록
	private static void accountList()  
	{
		System.out.println("-----------------");
		System.out.println("-----계좌목록------");
		System.out.println("-----------------");
		for(int i=0; tt[i]!=null; i++) 
		{
			System.out.println(tt[i].getAno() + " " + tt[i].getOwner() + " " + tt[i].getBalance());
		}
		
		
	}
	
	//예금하기
	private static void deposit() 
	{
		System.out.println("-----------------");
		System.out.println("-------예금-------");
		System.out.println("-----------------");
		System.out.print("계좌번호 입력>");
		ano = scan.next();
		System.out.print("예금액 입력>");
		in = scan.nextInt();
		
		if(findAccount(ano)!=null) 
		{
			findAccount(ano).setBalance(findAccount(ano).getBalance()+in);
			System.out.println("결과 : 예금이 성공하엿습니다." + "예금액"+in );
		}
		else 
		{
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
		
		
		
	}
	
	//출금하기
	private static void withdraw() 
	{
		System.out.println("-----------------");
		System.out.println("-----출금액------");
		System.out.println("-----------------");
		System.out.println("계좌번호 입력>");
		ano = scan.next();
		System.out.println("출금액 입력>");
		out = scan.nextInt();
		if(findAccount(ano)!=null) 
		{
			findAccount(ano).setBalance(findAccount(ano).getBalance()- out);
			System.out.println("결과 : 출금이 성공하엿습니다." + "출금액"+ out );
		}
		else 
		{
			System.out.println("잔액이 모자랍니다.");
		}
		 
		if(findAccount(ano)==null) 
		{
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
	}
		
		//Account 배열에서 ano와 동일한  Account 객체 찾기
		private static Ch6_tt findAccount(String ano) 
		{
			for(int i=0; tt[i]!=null; i++)
			{
				if(ano.equals(tt[i].getAno())) 
				{
					return tt[i];
				}
				
			}
			
			return null;
		
		}
		
	
	
}



