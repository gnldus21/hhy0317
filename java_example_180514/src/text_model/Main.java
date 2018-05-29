package text_model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.print("중량을 입력하세요.");
		int sugar = scan.nextInt(); // 설탕에 스캔
		if(!(3<=sugar)&&(sugar<=5000)) { // !(부정) 설탕이 3보다 크거나 같다 그리고(and)5000이 설탕보다 크거나 같다.
			System.exit(0); // 나가기.
		}
		int big = sugar / 5; // 5키로봉지 = 설탕 의 나누기 5
		int small = 0; // 작은 봉투는 0
		sugar %= 5; // 설탕 %= 5
		for (; big >= 0; big--) { // 5키로봉지 가 0보다 크거나 같다. ( 큰봉투 -- ( 증감 연산자 )
			if (sugar % 3 == 0) { // 설탕의 나머지 는 3 과 같다.
				small = sugar / 3; // 작은 봉투는 설탕과 같다.
				sugar %= 3; // 설탕 나머지가 같을수있는 3
				break; // 정지.
			}
			sugar += 5; // 설탕 += 5
		}
		int result = (sugar == 0 ) ? big + small : -1;
		System.out.println(result);
		scan.close();
		
		
		
		/*System.out.println("설탕의 중량(g)을 입력하세요.");
		double N = scan.nextDouble();
		double B = scan.nextDouble();
		System.out.println("3KG" + N/3000 + "봉지");
		System.out.println("5KG" + B/5000 + "봉지");*/
		

	}

}
