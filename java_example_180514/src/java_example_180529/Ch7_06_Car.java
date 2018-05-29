package java_example_180529;

public class Ch7_06_Car {
	//필드 메소드 final 메소드
	//필드 선언
	public String name;
	public int age;
	//메소드선언
	void myname() 
	{
		System.out.println(name + "내이름");
	}
	//final 메소드 선언
	public final void age(int age)
	{
		System.out.println(age + "내나이");
	}
		
	//SporetCar 클래스 선언
}
