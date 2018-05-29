package java_example_180518;

import java.util.Scanner;

public class Ch4_22_Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int num = 0;
		int money = 0;
		int wait = 0;
		
	    while(true) 
	    {
	    	System.out.println("----------------------------------"); //전체적인 틀을 만들고
			System.out.println("  1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>"); 
			num = scan.nextInt(); // num을 입력값으로 선언
			if(num==1) //1은(예금)
			{
				System.out.print("예금액>"); //예금액 입력하라고 출력
				money = scan.nextInt(); // 입력
				wait = wait + money; //현잔고는 전잔고플러스 머니
				System.out.println("현재잔액은" + wait + "입니다.");		//출력	
			}
			
			else if(num==2) //위if문만족하지않는것을else에입력 2는 (출금)
			{
				System.out.print("출금액>"); //출금액 입력하라고 출력
				money = scan.nextInt(); // 입력
				
				if(wait>=money) { //if를 쓰는이유는 잔액이 부족할시 잔고부족을뜨게하기위함.
				wait = wait - money; //반대로하면댐
				System.out.println("현재잔액은" + wait + "입니다.");
				}
				
				else //위 else if안에 if를 만족할시 뜨는 출력
				{
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재잔액은" + wait + "입니다.");
				}
				
			}
			else if(num==3) //잔고확인 
			{
				System.out.println("당신의 잔고는" + wait + "입니다."); //개꿀
			}
			else //if(num==4) 굳이쓸필요가업음~  //종료
			{
				System.out.println("ㅅㄱㅂ"); //종료출령
				break; //종료.
			}
			
	
			
	    }
	}
}

