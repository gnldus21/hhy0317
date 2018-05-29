package java_example_180515;

import java.util.Scanner;

//Scanner 사용방식
public class Ch3_ScannerExample {

	public static void main(String[] args) {
		/*
		 * next():문자열입력
		 * nextInt():정수입력
		 * nextDouble():실수 입력
		 * close():스캐너 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		// 현재 프로그램에서 scan이라는 이름으로 Scanner 기능을 쓰겠다.라는의미.
        /*System.out.print("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요.");
		String name = scan.next();
		String home = scan.next();
		int age = scan.nextInt();
		double cpwnd = scan.nextDouble();
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신이 사는도시는 " + home + "입니다.");
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		System.out.println("당신의 체중은 " + cpwnd + "kg 입니다.");
		
		scan.close();*/
		
		System.out.println("초를 입력하세요: ");
		int cho = scan.nextInt();
		int bon = cho%3600/60;
		int ch1 = cho%60;
		//System.out.println(cho + "초는" + cho/3600 + "시간" + cho%3600/60 + "분" + cho%3600%60 + "초입니다." );
		System.out.println(cho + "초는" + cho/3600 + "시간" + bon + "분" + ch1 + "초입니다." );
		scan.close();
	}

}
