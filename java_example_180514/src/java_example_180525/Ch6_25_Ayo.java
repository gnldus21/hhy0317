package java_example_180525;

import java.util.Scanner;

public class Ch6_25_Ayo {
	public int choice;
	Scanner scan = new Scanner(System.in);
	
	public void ch1() 
	{
		boolean run = true;
		String in0 = null;
		String in1 = null;
		int in2 = 0; 
		int don = 0;
		int out = 0;
		while(run)
		{
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택 >");
		int choice = scan.nextInt();
		if(choice == 1) 
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
		
			System.out.println("결과 : 계좌가 생성되었습니다.");
			
			don=don+in2;
		}
		else if(choice == 3) 
		{
			System.out.println("-----------");
			System.out.println("    예금     ");
			System.out.println("-----------");
			System.out.print("계좌번호 :");
			in0 = scan.next();
			System.out.print("예금액>");
			don = scan.nextInt();
			System.out.println("결과 : 예금액 ["+don+"] 이 정상 예금되었습니다.");
			
			don= don+in2;
			
		}
		else if(choice == 4) 
		{
			
			System.out.println("-----------");
			System.out.println("    출금     ");
			System.out.println("-----------");
			System.out.print("게좌번호 :");
			in0 = scan.next();
			System.out.print("출금액>");
			out = scan.nextInt();
			
			if(don>=out) {
			System.out.println("결과 :  ["+out+"]원이 출금됩니다.");
			don= don-out;
			System.out.println("현재 잔고 ["+don+"]원 입니다.");
			}
			else if(don<out) 
			{
				System.out.println("잔고가 부족합니다.");
			}
		}
		else if(choice == 2) 
		{
			System.out.println("-----------");
			System.out.println("   계좌목록     ");
			System.out.println("-----------");
			System.out.println(in0 +" "+ in1+" "+ don);
			
		}
		else if(choice == 5)
		{
			System.out.println("종료합니다.");
			run = false;
		}
		
	
		}
	}
	
}