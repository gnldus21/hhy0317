package java_example_180515;
// 증강 연산자 예제
// ++ , --
// 변수 앞에 ++이 붙으면 1을 증가시키고 계산사용
// 변수 뒤에 ++이 붙으면 변수값 사용후 1을 증가시킴.

public class Ch3_IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("---------------------------");
		x++; //  ++ 이 붙었을때 1씩 더해진다. 무적권~!
		// ++이 뒤에붙으면 이시점에서  x = 11이 됨.
		++x; // 이 상황에서 드디어 x가 12가 되는거쉐~ㅁ~
		System.out.println("x=" + x);
		System.out.println("---------------------------");
		y--; // -- 가 붙으면 1씩 빠진다 무적권~!!
		// --이 뒤에 붙은 이시점에 y는 9가 되었다.
		--y; // 뚜까맞고온  y 는 결국 또 쳐맞고 8이됨.
		System.out.println("y=" + y);
		System.out.println("---------------------------");
		z = x++; // x가 가진 값을 z에 대입후 x값을 1증가시킴.
		//이시점에서 z에 12를 대입하고 x는 13이된다. 
		//z는 증감연산전  x의 값을 받은후  x는 증감연산자로 인해 13으로 출력됨.
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("---------------------------");
		z = ++x; // x가 13을 가지고 내려와  z에 증감연산자로 인해 14가 되고 x가 14의값을 다시받는다.
		//이 시점 "전"에 이미 대입이끝났음.
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("---------------------------");
		z = ++x + y++; // 이건 14가된 x가 15로 진화하고 x는 15+y의값(현재 8인상태)
		//15 + 8 는 23이됨. z는 23 x는 15로 내려오게되고. y는  이부분에서 1 + 된 9 가된다.
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		

	}

}
