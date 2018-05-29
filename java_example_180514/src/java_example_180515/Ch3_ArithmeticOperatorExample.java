package java_example_180515;

public class Ch3_ArithmeticOperatorExample {

	public static void main(String[] args) {
		 int v1 = 5; 
		 int v2 = 2;
		 
		 int result1 = v1 + v2;
		 System.out.println("result1=" + result1);
		 // 5  +  2 = 7 당연한거아냐?
		 int result2 = v1 - v2;
		 System.out.println("result2=" + result2);
		 // 5 - 2 = 3 당연스;
		 int result3 = v1 * v2;
		 System.out.println("result3=" + result3);
		 // 5 곱하기 2 는 당연히 10이지;
		 int result4 = v1 / v2;
		 System.out.println("result4=" + result4);
		 // 5 나누기 2는 2.5 이지만 int는 소숫점을 표현하지않아.
		 int result5 = v1 % v2;
		 System.out.println("result5=" + result5);
		 // 5 나누기 2의 나머지는  1 그래서 1인거야.
		 double result6 = (double) v1 / v2;
		 System.out.println("result6=" + result6);
         // result4의 소숫점 자리까지 표시한게 2.5단 말쓰미~
	}

}
