package com.schoolexercise;

public class CourseTopic {
	private String id;
	private String name;
	private String description;
	private String instructor;
	private String courseDesc;

	public CourseTopic(String id, String name, String description, String instructor) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}

	public CourseTopic(String courseDesc) {

		this.courseDesc = courseDesc;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCoursDesc(String coursDesc) {
		this.courseDesc = coursDesc;
	}

}
