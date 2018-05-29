package java_example_180515;
// 논리 부정 연산자
public class Ch3_DenyLogicOperatorExample {

	public static void main(String[] args) {
	    boolean play = true;
	    System.out.println(play);
	    
	    //자바에서 ! 의 의미는 ..! : NOT 을 의미함. (NOT은 boolean타입에서만 씀)
	    play = !play; //play의 반대값을 play에 대입.
	    System.out.println(play);
	    
      // 연산자 + - * / % 
	    // + 덧셈연산 - 뺄셈연산 * 곱셈연산 / 좌측 피연산자를 우측 피연산자로 나눗셈 연산
	    // % 좌측 피연산자를 우측 피연산자로 나눈 나머지를 구하는 연산
	    // ㄴ 10 % 3 =  몫이 3 이고 나머지 1 ( %값은 나머지값 1을 가지고옴.)
	}

}
