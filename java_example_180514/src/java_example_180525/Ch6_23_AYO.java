package java_example_180525;

import java.util.Scanner;

public class Ch6_23_AYO {
	Scanner scan = new Scanner(System.in);
	public int choice;
	
	
	public void distance() 
	{
		double ing = 0.0;
		System.out.print("첫번째 X좌표 :");
		int in = scan.nextInt();
		System.out.print("첫번째 Y좌표 :");
		int in2 = scan.nextInt();
		System.out.print("두번째 X좌표 :");
		int in3 = scan.nextInt();
		System.out.print("두번째 Y좌표 :");
		int in4 = scan.nextInt();
		
		ing = (in-in3)*(in-in3) + (in2-in4)*(in2-in4);
		System.out.println("두 점 사이의 거리는 :" + Math.sqrt(ing));
	}
	public void absolute() 
	{
		System.out.println("정수를 입력하세요.");
		int i = scan.nextInt();
		if(i<0) 
		{
			i=-i;
		}
		System.out.println("입력하신 정수의 절대값은 " +i+ "입니다.");
	}
}


