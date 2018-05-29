package java_example_180517;
import java.util.Scanner;
public class Ch4_A_yo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 학년, 점수를 입력하시오.");
		int a = scan.nextInt();
		int score = scan.nextInt();
		String grade = null;
		
		switch(a){
		case 1: if(score>=60)
		{
			grade = "합격";
		}else 
		{
			grade = "불합격";
			
		}break;
		case 2: if(score>=60)
		{
			grade = "합격";
		}else 
		{
			grade = "불합격";
			
		}break;
		case 3: if(score>=60)
		{
			grade = "합격";
		}else 
		{
			grade = "불합격";
			
		}break;
		
		case 4: if(score>=70)
		{
			grade = "합격";
		}else 
		{
			grade = "불합격";
			
		}break;
		}
		System.out.println(grade);
		scan.close();
	}

}
//점수 학년을 입력받아 60점 이상이면 합격 미만이면 불합격.