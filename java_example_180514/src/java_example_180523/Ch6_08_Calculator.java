package java_example_180523;
//p 227
public class Ch6_08_Calculator {
	int plus(int x, int y) 
	{
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) 
	{
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() 
	{
		double result = avg(7,10);
		println("실행결과 : "+result);
	}
	
	void println(String messge) 
	{
		System.out.println(messge);
	}

}
