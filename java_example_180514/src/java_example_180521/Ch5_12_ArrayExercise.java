package java_example_180521;

public class Ch5_12_ArrayExercise {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 평점 계산하기.
		 */
		
		double score[][] = {{3.3, 3.4},
				             {3.5, 3.8},
                              {4.2, 4.3},
                               {3.9, 4.0}};
		double sum = 0; //소숫점 까지 구할 합계
		double avg = 0;
		for(int i=0; i<score.length; i++)  // i행 길이
		{
			for(int j=0; j<score[i].length; j++) //i의 열의길이.
			{
				sum = sum + score[i][j]; //현합계는 전합계 + 2차원배열 i,j	
			}
			
		}
			avg = sum/(score[0].length*score.length);
		System.out.println("평점은 : " + avg + "입니다."); //나눠나눠!!

	}

}
