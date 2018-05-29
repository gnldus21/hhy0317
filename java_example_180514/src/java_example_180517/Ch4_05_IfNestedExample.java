package java_example_180517;
import java.util.Scanner;

import javax.security.sasl.SaslClient;
public class Ch4_05_IfNestedExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 *  점수를 입력 받고
		 *  90점 이상인 점수에 대해 95점 이상이면 A+
		 *  90이상 95미만이면 A
		 *  85~89 B+
		 *  80~84 B
		 *  75~79 C+
		 *  70~74 C
		 *  65~69 D+
		 *  60~64 D
		 *  60 점 미만 F
		 *  if 문이 끝나면 학점을 출력하는 print문 사용.
		 *  주의할 점은 학점 값을 처리하는 string 타입 변수를 하나 사용.
		 */
          System.out.println("점수를 입력하세요오드용액.");
          int score = scan.nextInt();
          String grade;
          if(score>=90) 
          {
        	  if(score>=95) {
        		  grade = "A+";
        	  }else {
        		  grade = "A";
        	  }
          }else if(score>=80) 
          {
        	  if(score>=85) {
        		  grade = "B+";
        	  }else {
        		  grade = "B";
        	  }
          }else if(score>=70) 
          {
        	  if(score>=75) {
        		  grade = "C+";
        	  }else {
        		  grade = "C";
        	  }
          }else if(score>=60) {
        	  if(score>=65) {
        		  grade = "D+";
        	  }else {
        		  grade = "D";
        	  }
          }else {
        	  grade = "넌 망했어임마";
        	  
        	  }
          System.out.println("당신의 학점은 " + grade + " 입니다.");
          scan.close();
	}

}
