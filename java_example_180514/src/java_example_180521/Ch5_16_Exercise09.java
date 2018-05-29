package java_example_180521;

import java.util.Scanner;

public class Ch5_16_Exercise09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int num = 0; //학생수 입력.
		int[] scores = new int[num];
		int max = 0; //최고점수 변수
		int sum = 0; //평균을 구하기위한 합계
		double avg = 0; //평균 변수
		
		while(run) 
		{
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("<선택> :");
			int No = scan.nextInt(); // 처음 와일문안에 양식을 만든다. (no는 넘버)
			
			if(No == 1)  // 넘바 완
			{
				System.out.print("<학생수> :"); // 입력을 위한 양식
				num = scan.nextInt(); //입력할수있게 ( 학생수) 
				scores = new int[num];  // 점수를 학생수만큼의 배열로 선언.
			}
			
			else if(No == 2) //남바 투
			{
				for(int i=0; i<num; i++)  //포문 i가 학생수까지.
				{
					System.out.print("<"+(i+1) + "번째학생점수> :"); // 입력양식 
					scores[i] = scan.nextInt(); // 점수를 입력
				}
				
			}
			else if(No == 3) //남바써레~
			{
				for(int i=0; i<scores.length; i++) //i(학생번호)<학생수만큼 반복
				{
					System.out.println("<"+(i+1) + "번째 학생의 점수> :" + scores[i]); // 학생번호 + 점수
				}
				
				
			}
			else if(No == 4) 
			{
				for(int i=0; i<scores.length; i++) //학생수까지
				{
					if(max < scores[i])  // 최고값 보다 점수가 클경우
					{
						max = scores[i]; // 최고값에 점수를 넣어 max가 최고값이 되게한다.
					}
					sum = sum + scores[i]; //합계를 먼저 구해서 총합을 만들어놓는다.
					
				}
				avg = (double)sum/num; // 평균을 구하기 위해 합계 나누기 학생수 강제로 더블타입으로 변환.
				System.out.println("<최고 점수> : " + max); // 최고점수 표시
				System.out.println("<평균 점수> : " + avg); // 평균점수 표시.
				
			}
			else //나머지 넘버
			{
				run = false; // 런(while문은 참일때만반복됨.)을 거짓으로 만들어 종료시킨다.
			}
		}
		
		System.out.println("ㅈㅈ~"); // 종료멘트

	}

}
