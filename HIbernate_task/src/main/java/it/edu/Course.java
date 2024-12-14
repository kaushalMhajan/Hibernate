package it.edu;

public class Course {
	
	private String course_Id;
	private String title;
	private int duration;
	private int fees;
	
	public Course() {
		super();
	}
	
	public Course(String course_Id, String title, int duration, int fees) {
		super();
		this.course_Id = course_Id;
		this.title = title;
		this.duration = duration;
		this.fees = fees;
	}

	public String getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(String course_Id) {
		this.course_Id = course_Id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
