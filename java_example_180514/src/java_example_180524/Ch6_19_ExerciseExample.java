package java_example_180524;

public class Ch6_19_ExerciseExample {

	public static void main(String[] args) {
		Ch6_19_Exercise stud1 = new Ch6_19_Exercise();
		stud1.setName("선남"); //이름
		stud1.setAssignmentScore(91); //과제점수
		stud1.setExamScore(81);
		stud1.result();
	
		
		Ch6_19_Exercise stud2 = new Ch6_19_Exercise();
		stud2.setName("선녀"); //이름
		stud2.setAssignmentScore(86);//과제점수
		stud2.setExamScore(92);//시험점수
		stud2.result();

	}

}
