package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.model.Student;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired


    CourseRepository courseRepository;
    @GetMapping("/listCourse")
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }



    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Integer id)
    {
        return courseRepository.findById(id).get();
    }
    @DeleteMapping("/course/{id}")
    public List<Course> deleteCourse(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

    @PostMapping("/course")
    public List<Course> addCourse(@RequestBody Course Course) {
        courseRepository.save(Course);
        return courseRepository.findAll();
    }

    @PutMapping("/course/{id}")
    public List<Course> updateCourse(@RequestBody Course course, @PathVariable Integer id,@RequestBody String desc) {
        Course courseObj = courseRepository.findById(id).get();
        courseObj.setTitle(course.getTitle());
        courseObj.setDescription(Course.getDescription(desc));
        Object CourseObj;
        courseRepository.save(courseObj);
        return courseRepository.findAll();
    }

}
