package scholar_managment;

import java.util.HashMap;

public class Component {
	private String name;
	private Teacher teacher;
	private int code;
	HashMap<Student, double[]> student = new HashMap<>();
	
	public void addGrade(Student student, double grade1, double grade2){
		if(this.student.containsKey(student)) {
			double[] grades = {grade1, grade2};
			student.put(student.getRegister(), grades);			
		}		
		
	}
	public void seeGrades() {
		
	}
	
	public double calculateMean(double grade1, double grade2){
		return (grade1 + grade2)/2;
	}
	public boolean showConcept(Student ) {
		if(calculateMean())
	}
	public double[] getGrades() {
		
	}
	
}
