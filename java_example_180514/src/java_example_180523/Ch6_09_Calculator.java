package java_example_180523;
//메소드 overloading p.232
public class Ch6_09_Calculator {
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름 : areaRectangle
	double width;
	double height;
	
	double areaRectangle(double width) 
	{
		double area = width*width;
		return area;
	}
	
	/*int areaRectangle(int x) //정사각형은 양변의 길이가 같으므로 x하나만사용.
	{
		int result = x*x; //넓이 는 밑변x높이.
		return result; 
		
	}*/
	
	//직사각형의 넓이를 구하는 메소드
	//메소드 이름 : areaRectangle
	double areaRectangle(double width, double height) 
	{
		double area = width*height;
		return area;
	}
	
	
	/*int areaRectangle(int x, int y)  //직사각형은 서로 길이가 다르기에 x 와 y사용
	{
		int result = x*y; //넓이는 밑변x높이.
		return result;
	}*/
}


//main 클래스의 실행내용
/*
*객체 생성해서
*정사각형 넓이 구하는 메소드 호출하고 결과 출력
*직사각형 넓이 구하는 메소드 호출하고 결과 출력
*/