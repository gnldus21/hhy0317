package java_example_180529;

public class Ch7_09_HankookTire extends Ch7_09_Tire {
	//필드
	//생성자
	public Ch7_09_HankookTire(String location, int maxRotation) 
	{
		super(location,maxRotation);
	}
	@Override
	public boolean roll() 
	{
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) 
		{
			System.out.println(location + "HankookTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else 
		{
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
	
}
