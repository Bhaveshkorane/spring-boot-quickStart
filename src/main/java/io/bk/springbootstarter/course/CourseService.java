package io.bk.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring","spring framework","spring description"),
//			new Topic("java","java lang","java description"),
//			new Topic("python","django framework","python description"),
//			new Topic("javascript","node framework","javascript description"))	
//		);
	
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);;
		return courses;
		
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
			
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}

}
