package module03;

public class CollegeStudent extends Student {
	private long id;
	private String collegeName; 
	private int rating;
	
	public CollegeStudent(String firstName, String lastName, int group) {
		super(firstName, lastName, group);
	}
	
	public CollegeStudent(String lastName, Course[] coursesTaken) {
		super(lastName, coursesTaken);
	}

	public CollegeStudent(String firstName, String lastName, int group, int age, Course[] coursesTaken, long id, String collegeName, int rating) {
		super(firstName, lastName, age, group, coursesTaken);
		this.id = id;
		this.collegeName = collegeName;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
