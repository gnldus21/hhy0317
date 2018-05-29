package java_example_180517;

import java.util.Scanner;

public class Ch4_DoWhile_A_yo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		String text = null;
		do 
		{
			System.out.print(">");
			text = scan.nextLine();
			System.out.println("*>"+text+"<*");
		}
		
		while(! text.equals("q") );
		
		System.out.println( );
		System.out.println("ㅅㄱㅂ");
		scan.close();
	

	}

}
