package java_example_180528;
//Ch7_02_People 자식 클래스 
public class Ch7_02_Student extends Ch7_02_People {

	public int StudentNo;
	
	public Ch7_02_Student(String name, String ssn,int StudentNo) 
	{
		//this.name=name; 부모클래스에 name 과 ssn이 있으니 super(name, ssn)으로 쓴다.
		super(name, ssn); //부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
		this.StudentNo=StudentNo;
		
	}

}
