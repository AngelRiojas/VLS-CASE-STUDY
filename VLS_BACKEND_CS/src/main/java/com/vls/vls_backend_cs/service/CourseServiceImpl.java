package com.vls.vls_backend_cs.service;

import com.vls.vls_backend_cs.entity.CourseEntity;
import com.vls.vls_backend_cs.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;


    @Override
    public List<CourseEntity> getCourseEntityList() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity createCourse(CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }

    @Override
    public CourseEntity updateCourse(Integer courseId, CourseEntity courseEntity) {
        CourseEntity existingCourseEntity =  courseRepository.findByCourseId(courseId);
        existingCourseEntity.setCourseName(courseEntity.getCourseName());
        existingCourseEntity.setCourseAuthorName(courseEntity.getCourseAuthorName());
        existingCourseEntity.setCourseDuration(courseEntity.getCourseDuration());
        existingCourseEntity.setCourseStatus(courseEntity.getCourseStatus());
        CourseEntity updatedCourseEntity = courseRepository.save(existingCourseEntity);
        return updatedCourseEntity;
    }

    @Override
    public CourseEntity deleteCourse(Integer courseId) {
        CourseEntity deletedCourseEntity = courseRepository.findByCourseId(courseId);
        courseRepository.delete(deletedCourseEntity);
        return deletedCourseEntity;
    }
}
