package java_example_180523;
//생성자 Overloading 예제
public class Ch6_05_CarExample {

	public static void main(String[] args) {
		Ch6_05_Car myCar = new Ch6_05_Car();
		System.out.println("<기본 생성자.>");
		System.out.println(myCar.company + myCar.model + myCar.color + myCar.maxSpeed);
		System.out.println("----company 가 출력됨. model, color 필드값이 나오지않음  maxSpeed 가 0으로표시됨. ");
		System.out.println("<model 매개변수 생성자.>");
		Ch6_05_Car myCar1 = new Ch6_05_Car(" K5 ");
		System.out.println(myCar1.company + myCar1.model + myCar1.color + myCar1.maxSpeed);
		System.out.println("----company가 출력됨. color 필드값이 나오지않음  maxSpeed 가 0으로표시됨.");
		System.out.println("<model,color 매개변수 생성자.>");
		Ch6_05_Car myCar2 = new Ch6_05_Car(" 젠쿱 ", " 검정 ");
		System.out.println(myCar2.company + myCar2.model + myCar2.color + myCar2.maxSpeed);
		System.out.println("----company 가 출력됨. maxSpeed 필드값이 0으로 표시됨. ");
		System.out.println("<model,color,maxSpeed 매개변수 생성자.>");
		Ch6_05_Car myCar3 = new Ch6_05_Car(" 아반떼 ", " 스카이블루 ", 250);
		System.out.println(myCar3.company + myCar3.model + myCar3.color + myCar3.maxSpeed);
		System.out.println("----company, model, color, maxSpeed 필드값이 모두 나옴.");

	}

}
