package java_example_180515;
//대입 연산자
/*
 * += , -= , *=, /=, %=
 * A+=B => A=A+B 
 * num1 = num1 + num2
 */
public class Ch3_AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result=" + result); //result = 10
		// 0+10 = 10
		result -= 5;
		System.out.println("result=" + result); //result = 5
		// 10-5 = 5
		result *= 3;
		System.out.println("result=" + result); //result = 15
		// 5*3 = 15
		result /= 5;
		System.out.println("result=" + result); //result = 3
		// 15 / 5 = 3
		result %= 3;
		System.out.println("result=" + result); //result = 0
		// 3 % 3 = 0

	}

}
