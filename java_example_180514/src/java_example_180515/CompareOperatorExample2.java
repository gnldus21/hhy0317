package java_example_180515;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // 출력결과 = true
		//v2가 더블변수타입으로 자동 형변환.
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		// false : 0.1f는 근사치 실제값은 0.10000002332423... 
		System.out.println((float)v4 == v5); //true : 변수타입을 같게함.
		System.out.println((int)(v4*10) == (int)(v5*10)); //true : 변수
		// 타입을 같게함.

	}

}
