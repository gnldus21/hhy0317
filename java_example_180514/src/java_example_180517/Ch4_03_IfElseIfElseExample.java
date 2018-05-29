package java_example_180517;
import java.util.Scanner;

public class Ch4_03_IfElseIfElseExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 점수를 스캔으로 입력받아서.
		 * 90이상이면 점수가 90~100점입니다. 등급은 A입니다.
		 * 80이상 90미만이면 점수가 80~89입니다. 등급은 B입니다.
		 * 70이상 80미만이면 점수가 70~79입니다. 등급은 C입니다.
		 * 60이상70미만이면 점수가 60~69입니다. 등급은 D입니다.
		 * 60점 미만이면 점수가 60 미만입니다. 재수강 고고FFFFFFFF
		 */ 
		System.out.println("점수를 입력하세요.");
		
		int score = scan.nextInt();
		if(score>=90){
			System.out.println("점수가 90~100점입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89점입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score>=70) {
			System.out.println("점수가 70~79점입니다.");
			System.out.println("등급은 C입니다.");
		}else if(score>=60) {
			System.out.println("점수가 60~69점입니다.");
			System.out.println("등급은 D입니다.");
		}else {
			System.out.println("점수가 60점 미만 입니다.");
			System.out.println("넌 끝났어.");
		}
		scan.close();
		

	}

}
