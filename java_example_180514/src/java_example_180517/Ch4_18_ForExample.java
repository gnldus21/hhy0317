package java_example_180517;

import java.util.Scanner;

public class Ch4_18_ForExample {

	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수까지의 정수중에 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("야 증말어렵따~");
		
		int sum = 0; // 총합변수선언
		int end = scan.nextInt(); // 마지막값 (입력값)
        
		
		for(int i=1; i<=end; i++)  // i=1부터 시작 해서 i <= 마지막값 , i 1씩증가.)
		{
			if(!(i%3==0) || !(i%2==0))  // 부정(3의배수와 2의배수)
		{
				sum = sum + i; // 현총합은 전총합 + i
		}
			
		}
			
		System.out.print("총합은" + sum + "입니다.");
		//블라블라

	}

}


