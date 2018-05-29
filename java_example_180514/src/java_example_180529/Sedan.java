package java_example_180529;

public class Sedan extends Car{
	/*2.Sedan 클래스(car클래스의 자식클래스)
	a.좌석수를 담을수 있는 필드
	b.좌석수를 return 해주는메소드*/
	//필드 선언
	public int capa;
	
	//좌석수를 return해주는 메소드
	
	public int seat(int capa) 
	{
		this.capa=capa;
		return capa;
	}
}
