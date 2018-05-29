package java_example_180515;
//삼황 연산자
/*
 * 형식 : (조건식) ? 조건이 true 일때의 결과 : 조건이 false일때 결과
 */
public class Ch3_ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 85;
		//char grade = (score>90)? 'A' : 'B';
		// score 가 90보다 크면 grade 에 A를 저장 : 90보다 작다면 grade 에 B를 저장.
		char grade = (score>90)? 'A' : ((score>80)? 'B' : 'C');
		System.out.println("당신의 성적은" + grade + " 입니다.");

	}

}
