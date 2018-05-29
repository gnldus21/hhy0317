package java_example_180515;

public class Ch3_SignOperatorExample {
       
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		//result1 는  x = -100이니. +100과 합치면 -100이됨.
		// --2 는 -와 -가 합쳐지므로 +100이됨. (100)
		
		short s = 100;
		//short result3 = -S; //컴파일 에러
		int result3 = -s;
		System.out.println("result3=" + result3);
		// s에 +100을 result3 의-100에 더하면 -100이됨.
		
		
	}
}
