package java_example_180518;

public class Ch4_19_Example {

	public static void main(String[] args) {
		/*
		 * 문제 : 1+(-2)+3+(-4)+.... 형태로더했을때 얼마까지 더해야 
		 * 총합이 100이상이 되는지 구해보시오.
		 */
		int sum = 0; // 합의 변수    ////////while문
		int num = 1; // 숫자용변수
		int count = 1; //카운트용 변수
		int s = 1; //부호용 변수
		
		/*while(true) 
		{
			sum = sum + num;
			if(sum>=100)
				break;
			count++; //순차적 숫자 증가를 위한 증감연산자.
			s = -s; //부호를 변경(s를-1로 선언해도 무방
			num = s * count;
		}
		System.out.print("숫자 :" + num);
		System.out.print("합계 :" + sum);
*/
		// for 문
		for(count=1;sum<100;count++,s=-s) 
		{
			num=count*s;
			sum=sum+num;
		}
      }
}
		
		
		/*int sum = 0;
		for(int i=1; i<=100; i++) 
		{
			sum = sum  i;
			if(i%2==0)	
			{
				System.out.print(i-1 + " + ");
				System.out.print("("+-i+")"+" + ");
			}
		}
		System.out.println(i + -i + sum);*/
		
		/*int sum = 0;
		for(int i=1; i<=100; i++) 
		{
			if(i%2==0)
			
			{
				System.out.print(i-1 + " + ");
				System.out.print("(" +-i+ ")" + " + " );
				sum = sum + i;
			}
		}
		System.out.println(sum);*/
		

