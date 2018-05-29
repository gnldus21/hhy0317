package java_example_180528;
//부모 클래스  CellPhone
public class Ch7_01_CellPhone {
	//필드선언
	String model;
	String color;
	
	//메소드선언
	void PowerOn() 
	{
		System.out.println("전원을켭니다.");
	}
	void PowerOff() 
	{
		System.out.println("전원을끕니다.");
	}
	void bell() 
	{
		System.out.println("벨이울립니다.");
	}
	void sendVoice(String message) 
	{
		System.out.println("자기 :"+ message);
	}
	void receiveVoice(String message) 
	{
		System.out.println("상대방 :"+ message);
	}
	void hangUp() 
	{
		System.out.println("전화를 끊습니다.");
	}
}
