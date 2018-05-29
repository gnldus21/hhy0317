package java_example_180521;

public class Ch5_15_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5};
		String[] say = {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		
		
		for(int score : num) 
		{
			sum = sum + score;
			System.out.print(score + " ");
			
		}
		System.out.println("점수 총합 : " +sum);
		for(String score : say) 
		{
			System.out.print(score + " ");
		}
		
		
		
		

	}

}
