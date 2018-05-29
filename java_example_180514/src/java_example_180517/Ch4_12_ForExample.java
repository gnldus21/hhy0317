package java_example_180517;

import java.util.Scanner;

public class Ch4_12_ForExample {

	public static void main(String[] args) {
		//출력 형태
        //1+2+3+4+5+6+7+8+9+10=55
		Scanner scan = new Scanner(System.in);
		System.out.println("더하고싶은 숫자를 입력하세요.");
		/*int i = 1;*/
		int a = scan.nextInt(); // 값의 입력
		int sum = 0;  // 합칠 변수

		for(int i=1; i<=a; i++) // for문 int i=1 -> a가 i보다 크거나 같다. ( i 증감변수)
		{
				System.out.print(i); // 아이 보여줘
				if(i<a)  // 하지만 아이가 에이보다 작을경우
			{
		
				System.out.print(" + ");  //마지막 +표시하지않는다.
			}
				sum = sum + i; // 합친값은 합계 + 아이(증감)
		}
	    System.out.println(" = " + sum); // 전체적인 표시.

    }
}
