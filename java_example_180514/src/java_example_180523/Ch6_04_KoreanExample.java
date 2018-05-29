package java_example_180523;
//
public class Ch6_04_KoreanExample {

	public static void main(String[] args) {
		//본인 이름  , 주민번호앞자리로 k1. k2객체를 각각 생성해서 필드값을 출력.
		Ch6_04_Korean kor1 = new Ch6_04_Korean("황휘연","950317");
		Ch6_04_Korean kor2 = new Ch6_04_Korean("황휘연","950317");
		
		System.out.println("------------");
		System.out.println(kor1.name+"             ||");
		System.out.println(kor1.ssn+"    ||");
		System.out.println("------------");
		System.out.println("------------");
		System.out.println(kor2.name+"             ||");
		System.out.println(kor2.ssn+"    ||");
		System.out.println("------------");

	}

}
