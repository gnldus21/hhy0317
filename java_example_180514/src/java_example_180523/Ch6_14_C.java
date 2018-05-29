package java_example_180523;

//import java_example_180524.Ch6_14_A 접근 제한을 걸어놓아서 볼수가없다.
import java_example_180524.Ch6_14_B; //임폴트 문을 이용해서 해당 패키지의이름을 써주면 접근가능.
import java_example_180524.*; //패키지 모두 접근
import java_util.Scanner;
import java_util.*;

public class Ch6_14_C {
	//다른 패키지에 있는 A클래스(default로선언)와 B클래스(public으로 선언)로 접근.
	Ch6_14_A a;
	Ch6_14_B b;
}
