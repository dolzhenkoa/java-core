package module03.task03;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task03 {
	/**
	 You need to create following structure of the classes.

	Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName. Create two constructors with fields startDate, name; and hourseDuration, name, teacherName. 
	
	Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age. With 2 constructors firstName, lastName, group; and lastName, coursesTaken. 
	
	CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id. Create three constructors: two the same as in Student and one with all the fields of the class.
	
	Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email. Create three constructors: two the same as in CollegeStudend and one with secretKey field.
	
	Create getters and setters for all fields and make fields private as OOP principle follows. Create 5 objects Course class. Create objects of others classes using every constructor. You must have 13 objects in Solution class.
	**/
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		Course course1=new Course(df.parse("01-11-2016"), "Java-1");
		Course course2=new Course(df.parse("01-12-2016"), "Java-2");
		Course course3=new Course(df.parse("01-01-2017"), "Java-3");
		Course course4=new Course(df.parse("01-02-2017"), "Java-4");
		Course course5=new Course(10, "Java-5", "Oww teacher");
		
		Course[] coursesTaken3={course3};
		Student student1=new Student("Jane","Student",1);
		Student student2=new Student("Ann Student",coursesTaken3);
		Student student3=new Student("Jack","Student",25,3,coursesTaken3);
				
		Course[] coursesTaken4={course4};
		CollegeStudent collegeStudent1=new CollegeStudent("Jane","CollegeStudent",1);
		CollegeStudent collegeStudent2=new CollegeStudent("Ann CollegeStudent",coursesTaken4);
		CollegeStudent collegeStudent3=new CollegeStudent("Jack","CollegeStudent",3, 33, coursesTaken4, 147, "College", 10);
		
		Course[] coursesTaken5={course5};
		SpecialStudent specialStudent1=new SpecialStudent("Jane","SpecialStudent",1);
		SpecialStudent specialStudent2=new SpecialStudent("Ann SpecialStudent", coursesTaken5);
		SpecialStudent specialStudent3=new SpecialStudent("Jack","SpecialStudent",3,123456789);
	}

}
