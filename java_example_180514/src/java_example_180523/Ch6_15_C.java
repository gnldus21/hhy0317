package java_example_180523;

import java_example_180524.Ch6_15_A;

public class Ch6_15_C {
	Ch6_15_A a1 = new Ch6_15_A(true); //퍼블릭선언으로 다른패키지에서도 접근이됨.
	//Ch6_15_A a2 = new Ch6_15_A(1);  디폴트 선언 (다른패키지에서 접근이안댐.)
	//Ch6_15_A a3 = new Ch6_15_A("문자열");  프라이브선언으로 접근이안댐.
}
