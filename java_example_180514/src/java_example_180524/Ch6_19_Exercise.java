package java_example_180524;

public class Ch6_19_Exercise {
	//필드선언
	private String name;
	private int assignmentScore;
	private int examScore;
	private String grade;
	
	//생성자 선언
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAssignmentScore() {
		return assignmentScore;
	}

	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}

	
	
	
	private String getGrade() 
	{
	
	if((this.examScore+this.assignmentScore)/2>=90) 
	{
		this.grade = "A";
		}
	else if((this.examScore+this.assignmentScore)/2>=80) 
	{
		this.grade = "B";
	}
	else if((this.examScore+this.assignmentScore)/2>=70) 
	{
		this.grade = "C";
	}
	else if((this.examScore+this.assignmentScore)/2>=60) 
	{
		this.grade = "D";
	}
	else
	{
		this.grade = "F";
	}
		return this.grade;
	}
	
	public void result() 
	{
		System.out.println("이름 :" + getName());
		System.out.println("과제 점수 :" + getAssignmentScore());
		System.out.println("시험 점수 :" + getExamScore());
		System.out.println("학점 :" + getGrade());
	}
	
}

