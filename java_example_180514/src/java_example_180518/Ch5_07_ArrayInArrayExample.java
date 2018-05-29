package java_example_180518;

public class Ch5_07_ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		//선언된 배열의 초기값 확인.
		for(int i=0; i<mathScores.length; i++) 
		{
			for(int k=0; k<mathScores[i].length;k++) 
			{
				System.out.println("mathScores["+i+"]["+k+"]="
				           +mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores=new int[2][];
		englishScores[0]=new int[2];//1행에 2개의 열배정
		englishScores[1]=new int[3];//2행에 3개의 열배정
		for(int i=0; i<englishScores.length; i++) 
		{
			for(int k=0; k<englishScores[i].length;k++) 
			{
				System.out.println("englishScores["+i+"]["+k+"]="
				           +englishScores[i][k]);
			}
		}
		int[][] javaScores= {{95,80},{92,96,80}};//1행 2행.
		
	}

}
