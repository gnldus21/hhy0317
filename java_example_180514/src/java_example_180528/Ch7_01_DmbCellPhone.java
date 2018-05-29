package java_example_180528;
//CellPhone의 자식 클래스인 DmbcellPhone
//상속방법 : 자식클래스 명 extends 부모클래스명
public class Ch7_01_DmbCellPhone extends Ch7_01_CellPhone{
	//필드선언
	int channel;
	
	//생성자 선언
	Ch7_01_DmbCellPhone(String model, String color, int channel)
	{
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메소드 선언
	void turnOnDmb() 
	{
		System.out.println("채널" +channel+ "번 DMB 방송을 수신합니다.");
	}
	void changeChannelDmb(int channel) 
	{
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() 
	{
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
