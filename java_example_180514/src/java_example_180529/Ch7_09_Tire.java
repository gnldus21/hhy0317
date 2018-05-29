package java_example_180529;

public class Ch7_09_Tire {
	//필드
	public int maxRotation;     //최대회전수(타이어수명)
	public int accumulatedRotation;//누적 회전수
	public String location;      	//타이어위치
	
	//생성자
	public Ch7_09_Tire(String location, int maxRotation) 
	{
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation; //누적회전수1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else 
		{
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
}
