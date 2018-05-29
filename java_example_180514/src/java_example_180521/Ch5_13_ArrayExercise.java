package java_example_180521;

import java.util.Scanner;

public class Ch5_13_ArrayExercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] words = { 
				             {"chair","의자"},
				             {"desk","책상"},
				             {"water","물"},
				             {"monitor","모니터"},
				             {"mouse","마우스"}};
		String ok = "답";
		int num = 0;
		double mo = 0;
		int qt = 0;
		for(int i=0; i<words.length; i++)
		{
			System.out.print("문제" + (i+1) + "."+words[i][1] + "는 머냐 : ");
			ok = scan.next();
			if(ok.equals(words[i][0]))
			{
				num++;
				System.out.println("정답입니다.");
			}else{
				qt++;
				System.out.println("틀렸습니다.");
				System.out.println("정답은" + words[i][0] + "였습니다.");
			}
		}
		mo = (double)num/words.length*100;
		System.out.println(num + " 회 맞췄습니다.");
		System.out.println(qt + " 회 틀렸습니다.");
		System.out.println("정답 률 은  " + mo + "%입니다.");
		

	}

}
