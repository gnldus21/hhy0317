package java_example_180529;

public class Truck extends Car{
	/*3.Truck 클래스(Car클래스의 자식 클래스)
	a.적재량을 담을수 있는 필드
	b.적재량을  return해주는 메소드*/
	//필드선언
	
	public int fullup;
	
	//적재량을 return해주는 메소드
	
	public int upup(int fullup) 
	{
		this.fullup=fullup;
		return fullup;
	}
}
