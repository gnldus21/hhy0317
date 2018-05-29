package java_example_180529;

public class Ch7_07_A {
	/*
	 * A클래스
	 * 접근제한자  protected인 필드 , 생성자, 메소드선언.
	 * 
	 * B클래스
	 * 메소드를 선언해서
	 * A클래스 객체 만들고 A클래스 필드 , 메소드에 접근가능한지 확인
	 * 
	 * C클래스 다른 패키지 에 선언하고
	 * A클래스는 포함시키고 
	 * A클래스 객체 만들고 A클래스의 필드, 메소드에 접근가능한지 확인
	 * 
	 * D클래스는 C클래스와 동일한 패키지에 선언
	 * A클래스 포함 A클래스 상속
	 * 생선자 선언 부모클래스의 필드와 메소드에 접근가능한지 확인.
	 * 
	 */
	//필드선언
	protected int speed;
	
	protected String name;
	
	//생성자 선언
	protected Ch7_07_A()
	{
		
	}
	
	//메소드선언
	protected void Sonic(int speed) 
	{
		System.out.println(speed);
	}
		
	protected void nname(String name) 
	{
		System.out.println(name);
	}
	
	
}
