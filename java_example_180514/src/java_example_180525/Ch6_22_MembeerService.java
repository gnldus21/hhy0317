package java_example_180525;

import java.util.Scanner;

public class Ch6_22_MembeerService {
	Scanner scan = new Scanner(System.in);
	
	private String id = "hhy";
	private String pwd = "000";
	
	boolean login(String id, String pwd) 
	{
		this.id=id;
		this.pwd=pwd;
		
		if(id.equals("hhy")&&pwd.equals("000")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	void logout() 
	{
		System.out.println("로갓댔");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private String id = "hhy0317";
	private String pw = "0070";
	boolean result;
	
	public boolean Login(String id, String pw) 
	{
		
		
		if(this.id.equals(id)&&this.pw.equals(pw)) 
		{
			result = true;
		}
		else 
		{
			result = false;
		}
		
		return result;
	}

	public void logout(String id) 
	{
		result = false;
		System.out.println("로그아웃되었습니다.");
	}*/
	
}