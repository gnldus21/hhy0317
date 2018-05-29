package java_example_180521;

import java.util.Scanner;

public class Ch5_09_ArrayExercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 문제
		 * 양수5개를 입력받아서 배열에 저장하고,
		 * 입력 받은 수 중 가장 큰수를 출력하는 프로그램을 작성하시오.
		 */
		
		
		System.out.println("값을 입력하세요.");
		System.out.print("입력>");
		int[] scores = new int[5];
		int max = scores[0];
		int min = scores[0];
		int sum = scores[0];
		for(int i=0; i<scores.length;i++) 
		{
			
			scores[i] = scan.nextInt(); 
			min=scores[0];
			sum = sum + scores[i];
			
			if(max < scores[i]) 
			{
				max = scores[i];
			}
			if(min > scores[i]) 
			{
				min = scores[i];
			}
		}
		System.out.print("||입력값의 합계는 ");
		System.out.println("[" + sum + "] 입니다.");
		System.out.print("||입력값의 평균값은 ");
		System.out.println("[" + sum/scores.length + "] 입니다.");
		System.out.print("||입력값의 최대값은 ");
		System.out.println("[" + max + "] 입니다.");
		System.out.print("||입력값의 최소값은");
		System.out.println("[" + min + "] 입니다.");
		
		
		
		/*int max = Integer.MIN_VALUE;
		System.out.println("값을 입력하세요.");
		System.out.print("입력>");
		
		int[] scores = new int[5];
		for(int i=0; i<scores.length;i++) 
		{
			scores[i] = scan.nextInt(); 
			if(scores[i] > max) {
				max = scores[i];
			}
			
		}
		System.out.println("입력값의 최대값은");
		System.out.println("[" + max + "] 입니다.");*/

	}

}
