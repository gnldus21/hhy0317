package java_example_180525;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Ch6_21_Student {
	
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private int score;
	
	
	
	public String getName() 
	{
		
		return name;
	}
	public void setName(String name) 
	{
		for(int i=0; i<3; i++) {
		System.out.println("이름은 입력하세요.");
		System.out.print("입력> ");
		name = scan.next();
		System.out.println(name + "님 반갑습니다.");
		this.name = name;
		}
	}
	
	public int getScore() 
	{
		return score;
	}
	public void setScore(int score) 
	{
		System.out.println(name + "학생의 점수를 입력하세요.");
		System.out.print("입력> ");
		score = scan.nextInt();
		this.score = score;
	}
	
	
	
}
