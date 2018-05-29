package java_example_180523;
// CarExample 클래스
public class Ch6_02_CarExample {

	public static void main(String[] args) {
		// car 클래스 객체 선언
		Ch6_02_Car s1 = new Ch6_02_Car();
		// car 클래스에서 선언한 필드값을 출력해보세요.
		System.out.println("Car 클래스의 필드값");
		System.out.println(" ");
		System.out.print(s1.company+"\n"+s1.model+"\n"+s1.color+"\n"+s1.maxSpeed+"\n"+s1.Speed);
		
		//필드값 변경
		/*int number = 10;
		number = 30;*/
		s1.Speed = 60;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(s1.Speed);
	}

}
