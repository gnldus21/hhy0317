package java_example_180529;

public class Car {
	/*1.car클래스
	a.색 속도를 담을수 있는 필드
	b.속도 증가 처리용 메소드
	c.속도 감소 처리용 메소드
	*/
	//필드 생성
	public String color;
	public int speed;
	
	//속도증가 메소드
	protected void Sspeed(int speed) 
	{
		this.speed=speed;
	}
	//속도감소 메소드
	protected void Dspeed(int speed) 
	{
		this.speed=speed;
	}
	
	protected void Ccolor(String color) 
	{
		this.color=color;
	}
}
