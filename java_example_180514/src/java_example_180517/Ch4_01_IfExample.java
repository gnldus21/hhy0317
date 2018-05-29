package java_example_180517;
// 조건문 if 
public class Ch4_01_IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		/*if(score>=90)
			System.out.print("if 문 실행");*/
		//조건식 score 가 90 이상일 경우 실행.
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			}
		
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
		    System.out.println("등급은 B 입니다.");
		}
	}

}
