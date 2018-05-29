package java_example_180525;

import java.util.Scanner;

public class Ch6_23_AYOExample {

	public static void main(String[] args) {
		Ch6_23_AYO ayo = new Ch6_23_AYO();
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("---------------------");
			System.out.println("수행할 내용을 선택하세요.");
			System.out.println("1. 두점 사이의 거리 구하기");
			System.out.println("2. 절대값 구하기");
			System.out.println("3. 종료");
			System.out.print("선택 >");
			int choice = scan.nextInt();
			if(choice == 1) 
			{
				ayo.distance();
			}
			else if(choice == 2)
			{
				ayo.absolute();
			}
			else if(choice == 3) 
			{
				break;
			}
			
		}
		
		System.out.print("ㅅㄱㅂ");

	}

}
