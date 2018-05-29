package java_example_180515;
//문자열 비교 연산
public class Ch3_StringEqualsExample {

	public static void main(String[] args) {
		String strvar1 = "황휘연";
		String strvar2 = "황휘연";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자.
		String strvar3 = new String("황휘연");
		System.out.println( strvar1 == strvar2);
		//문자영비교가된다. 진실
		System.out.println( strvar1 == strvar3);
		//둘의 영역이 다름 (동명이인) 내용은 같지만 서로다름.
		System.out.println();
		System.out.println( strvar1.equals(strvar2));
		//.equals 연산자는 원본문자열과 매개값을 비교하여 순수하게 내용만 비교. 
		System.out.println( strvar1.equals(strvar3));
	}

}
