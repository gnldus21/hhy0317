package java_example_180517;
//중첩 for문을 이용한 구구단 출력.
public class Ch4_11_ForMultiplicationTableExample {

	public static void main(String[] args) {
		//구구단 출력하기
		for(int i=1; i<=9; i++) 
		{
			
			System.out.println("");
			for(int j=2; j<=9; j++) 
			{ 
			System.out.print(j + "x" + i + "=" + j*i);
			System.out.print
			("\t");
			/*if(i*j<10) {
				System.out.print(" ");
			}*/
			}

		}
		   
			/*System.out.println("-----------------------");*/
		}

	}


