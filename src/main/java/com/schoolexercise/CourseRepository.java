package com.schoolexercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CourseRepository {

	protected Map<String, CourseTopic> courses = new HashMap<String, CourseTopic>();

	public CourseRepository() {
		CourseTopic course1 = new CourseTopic("spring", "Spring Framework", "Spring Framework Description", "Alan K");
		CourseTopic course2 = new CourseTopic("java", "Core Java", "Core Java Description", "Brian F");
		CourseTopic course3 = new CourseTopic("javascript", "Javascript", "Javascript Framework Description",
				"Don Don");

		courses.put(course1.getId(), course1);
		courses.put(course2.getId(), course2);
		courses.put(course3.getId(), course3);

	}

	public Collection<CourseTopic> findAll() {
		return courses.values();
	}

	public CourseTopic findOne(String id) {
		return courses.get(id);
	}
}
