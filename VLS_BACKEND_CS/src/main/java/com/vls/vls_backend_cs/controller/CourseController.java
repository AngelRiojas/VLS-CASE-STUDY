package com.vls.vls_backend_cs.controller;

import com.vls.vls_backend_cs.entity.CourseEntity;
import com.vls.vls_backend_cs.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/api/v1/CourseList")
    public List<CourseEntity> getCourseEntityList() {
        List<CourseEntity> courseEntityList = courseService.getCourseEntityList();
        return courseEntityList;
    }

    @PostMapping("/api/v1/CourseList/create")
    public CourseEntity createCourse(@RequestBody CourseEntity courseEntity){
        CourseEntity saveCourseEntity = courseService.createCourse(courseEntity);
        return saveCourseEntity;
    }

    // Path variables are values sent from the browser
    @PutMapping("api/v1/CourseList/update/{courseId}")
    public CourseEntity updateCourse(@PathVariable(value = "courseId") String courseId, @RequestBody CourseEntity courseEntity ) {
        return courseService.updateCourse(Integer.valueOf(courseId), courseEntity);
    }

    @DeleteMapping("api/v1/CourseList/delete/{courseId}")
    public CourseEntity deleteCourse(@PathVariable(value = "courseId") Integer courseId) {
        return courseService.deleteCourse(courseId);
    }
}
