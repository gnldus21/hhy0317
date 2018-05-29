package java_example_180518;

import java.util.Scanner;

public class Ch5_08_ArrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		System.out.print("입력>");
		/*
		 * 3열짜리 1차원 배열은 선언하고
		 * 스캐너를 이용하여 값을 하나하나 입력하고
		 * 입력된 값의 총 합 및 평균값을 구하시오.
		 */
		int[] scores = new int[3];
		int sum=0;
		for(int i=0; i<scores.length;i++) 
		{
			scores[i] = scan.nextInt();
			sum = sum + scores[i];
			
		}
		System.out.println("합은 : " + sum + "입니다.");
		System.out.println("평균은 : " + sum/scores.length + "입니다.");
	}

}
