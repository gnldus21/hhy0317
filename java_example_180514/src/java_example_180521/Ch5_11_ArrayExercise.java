package java_example_180521;

import java.util.Scanner;

public class Ch5_11_ArrayExercise {

	public static void main(String[] args) {
		/*
		 *  거스름돈 문제
		 *  어떤 금액을 입력하게되면 각 동전이 몇개 씩 필요한지 출력하는 문제
		 *  가능한 적은 수의 동전으로 거슬러줄수있도록
		 *  예를들어
		 *  2680원이면
		 *  5백원 5개 백원 1개 오십원1개 10원 3개
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을입력하세요.");
		int don = scan.nextInt(); //입력받은 금액
		int[] jandon = new int[4]; //동전의 갯수
		int[] money = {500,100,50,10}; //동전단위
		
		for(int i=0; i<jandon.length;i++) 
		{
			jandon[i] = don / money[i];
			don = don % money[i];
			System.out.println(money[i] + "원 : " + jandon[i] + "개");
		}
		
		
	}
}
