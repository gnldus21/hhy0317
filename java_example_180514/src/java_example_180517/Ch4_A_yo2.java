package java_example_180517;

import java.util.Scanner;

public class Ch4_A_yo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("야 증말어렵따~");
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		int sum = 0;
		
		for(int i=start; i<=end; i++) 
		{
			sum = sum + i;
			System.out.print(i);
			if(i<end) 
			{
				System.out.print(" + ");
			}
			
		}
		System.out.print(" = " + sum);
	}

}
