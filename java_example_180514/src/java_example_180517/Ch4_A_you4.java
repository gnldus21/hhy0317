package java_example_180517;

import java.util.Scanner;

//정수를 입력하고 마지막에 0을 입력하세요.
//10 30 -20 40 0
//수의 개수는 4개이며 평균은 15.0입니다.
public class Ch4_A_you4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세용~");
		int score = 1;  //한 과목의 점수.
		double sum = 0;  // 총합
		int rotn = -1; // 과목 개수 (개수를 0으로하면 과목이 늘어남.)
		//while((score = scan.nextInt())! = 0){
		while(score!=0) // 한과목의 점수 가 0이 되면 멈춘다.
		{
			score = scan.nextInt(); // 점수를 기재하시오.
			sum = sum + score; // 현총합 = 전총합 + 한과목의점수
			rotn++; // 과목이 늘어난다. 반복된다.
		}
		System.out.print("입력개수는" + rotn + "개고, 평균은" + sum/rotn + "입니다.");
		//표기 는 블라블라 + 과먹의개수 + 블라블라 + 총합나누기과목개수 + 블라블라
		

	}

}
