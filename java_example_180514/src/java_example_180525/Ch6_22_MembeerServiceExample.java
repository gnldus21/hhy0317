package java_example_180525;

import java.util.Scanner;

public class Ch6_22_MembeerServiceExample {

	public static void main(String[] args) {
		Ch6_22_MembeerService member = new Ch6_22_MembeerService();
		Scanner scan = new Scanner(System.in);
		/*boolean result = member.Login("hhy0317", "0070");
		if(result) 
		{
			System.out.println("로그인 되었습니다.");
			member.logout("hhy0317");
			
		}
		else {
			System.out.println("id 또는 passwore가 올바르지 않습니다.");
		}*/
		
	    while(true) {
	    	System.out.println("-----------------------------");
	    	System.out.println("-----------------------------");
	    	System.out.println("-----------------------------");
	    	System.out.println("-----------------------------");
	    	int choice = scan.nextInt();
	    	switch(choice)
	    	{
	    	case 1:
	    		System.out.println("id입력 : ");
	    		String id = scan.next();
	    		
	    		System.out.println("pw");
	    		
	    		
	    	}
	    }
		
		
		

	}

}
