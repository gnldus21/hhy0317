package java_example_180528;
//Airplane 의 자식 클래스
public class Ch7_04_SuperSonicAirplane extends Ch7_04_Airplane{
	//1의 값을 갖는 NOMAL 상수 정의
	public static final int NOMAL = 1;
	//2의 값을 갖는 SUPERSONIC 상수 정의
	public static final int SUPERSONIC = 2;
	
	public int flymod = NOMAL;
	
	//fly 메소드 재정의.
	@Override
	public void fly() 
	{
		if(flymod == SUPERSONIC) 
		{
			System.out.println("초음속 비행합니다.");
		}
		else
		{
			//부모 클래스의 메소드를 호출할라면(재정의가 안된)
			super.fly();
			
		}
		
	}
	

}
