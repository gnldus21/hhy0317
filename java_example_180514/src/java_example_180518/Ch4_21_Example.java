package java_example_180518;

import java.util.Scanner;

public class Ch4_21_Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자가 지정되었습니다.");
		System.out.println("정답을 입력하세요.");
		
		int num = (int)(Math.random()*100)+1;
		
		int in=0; // 스캔선언전 변수
		
		for(int i=1; in!=num; i++)  // i=횟수 , 입력변수는 num과 같지않다. ( 틀린경우 ) i 1씩 증가.
		{
			in = scan.nextInt();  // 입력스캔선언
			
			if(in==num)  //입력 과 num이 같을경우 (정답)
			
			{
				System.out.println("정답입니다." + i + "회 시도했습니다."); // 출력 정답 , 몇회 시도했습니다.
			}
			
			else if(i==10&& in!=num) 
			
			{
				System.out.println("야 넌 이것도 못하냐;");
			}
			
			else if(i==11&& in!=num) 
			
			{
				System.out.println("진짜 개멍청하네");
			}
			
			else if(i==12&& in!=num) 
			
			{
				System.out.println("포기해라");
			}
			
			else if(i==13&& in!=num) 
			
			{
				System.out.println("에베베베베에베베베~~ㅂ에벵엡엥약오리즈~에에베엡ㅂ");
			}

			else if(i==14&& in!=num) 
			
			{
				System.out.println("ㅗㅗㅗㅗㅗㅗ멍청이");
			}

			else if(i==15&& in!=num) 
			
			{
				System.out.println("빡대가리샛구");
			}

			else if(i==16&& in!=num) 
			
			{
				System.out.println("체소초졸 ㅇㅈ? 응 인정~");
			}
			
			else if(in>num) // 입력이 num보다 클경우
			
			{
				System.out.println("더 적게입력하세요."); // 출력
			}
			
			else if(in<num)  // 나머지 ( 입력이 num보다 작을경우.
			
			{
				System.out.println("더크게입력하세요."); // 출력
			}
		}

	}

}
