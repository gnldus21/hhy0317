package java_example_180524;

public class Ch6_15_B {
	//같은 패키지에 있는 A클래스 에서 선언한 생성자로 접근
	Ch6_15_A a1 = new Ch6_15_A(true);
	Ch6_15_A a2 = new Ch6_15_A(1);
	//Ch6_15_A a3 = new Ch6_15_A("문자열");  이생성자는 a에서 private으로 선언했기에 보이지않아 오류가뜸.
}
