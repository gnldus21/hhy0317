package java_example_180528;

public class Ch7_02_StudentExample {

	public static void main(String[] args) {
		// Student 클래스에 대한 객체 생성.
		
		Ch7_02_Student stu = new Ch7_02_Student("황휘연","950317-11511517",24);
		//부모 클래스 필드
		System.out.println(stu.name);
		System.out.println(stu.ssn);
		//자식 클래스 필드
		System.out.println(stu.StudentNo);

	}

}
