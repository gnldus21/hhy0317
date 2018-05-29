package java_example_180529;

import java_example_180528.Ch7_03_Calculator;

public class Ch7_06_SporetCar extends Ch7_06_Car{

	//메소드 재정의
	@Override
	public void myname() 
	{
		System.out.println(name + "너의이름");
	}
	
	//final 메소드 재정의
	@Override
	public final void age(int age)
	{
		System.out.println(age + "너의나이");
	}

	

}
