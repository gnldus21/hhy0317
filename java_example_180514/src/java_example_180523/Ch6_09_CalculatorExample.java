package java_example_180523;

import java.util.Scanner;

public class Ch6_09_CalculatorExample {

	public static void main(String[] args) {
		Ch6_09_Calculator cal = new Ch6_09_Calculator();
		Scanner scan = new Scanner(System.in);
		//정사각형의 넓이.
		/*double  width = scan.nextInt();
		double  result = cal.areaRectangle(widht);*/
		
		cal.height=20;
		cal.width=10;
		double result1 = cal.areaRectangle(cal.width);
		double result2 = cal.areaRectangle(cal.width, cal.height);
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);
		
	}

}
