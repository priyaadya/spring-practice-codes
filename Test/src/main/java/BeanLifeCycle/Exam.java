package BeanLifeCycle;

public class Exam {
	
	private String subjectName;
	private double subjectDuration;
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
		System.out.println("property initiazed");
	}
	public double getSubjectDuration() {
		return subjectDuration;
	}
	public void setSubjectDuration(double subjectDuration) {
		this.subjectDuration = subjectDuration;
	}
	public void dinga() {
		System.out.println("Exam started");
	}
	public void dingi() {
		System.out.println("Exam ended");
	}
	public Exam() {
		
	}
	@Override
	public String toString() {
		return "Exam [subjectName=" + subjectName + ", subjectDuration=" + subjectDuration + "]";
	}
	
	
	

}
