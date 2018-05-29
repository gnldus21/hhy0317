package text_model;

import java.util.Scanner;

public class text_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요.");
		double a = scan.nextDouble();
		System.out.println("원의 면적은" + a*a*3.14 + " 입니다.");
		
		
		scan.close();
	}

}
