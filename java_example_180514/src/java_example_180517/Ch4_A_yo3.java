package java_example_180517;

public class Ch4_A_yo3 {

	public static void main(String[] args) {
		// 1~100까지 와일문
		int i = 1;
		int sum = 0;
		while(i<=100) 
		{
			/*System.out.print(i);*/
			sum = sum + i;
				/*if(i<100) 
			{
					System.out.print(" + ");
			}*/
			i++;
		}
		System.out.println(i);
		System.out.print(" = " + sum);

	}

}
