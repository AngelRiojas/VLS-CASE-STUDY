package com.vls.vls_backend_cs.service;

import com.vls.vls_backend_cs.entity.CourseEntity;

import java.util.List;

public interface CourseService {
    public List<CourseEntity> getCourseEntityList();

    public CourseEntity createCourse(CourseEntity courseEntity);

    public CourseEntity updateCourse(Integer courseId, CourseEntity courseEntity);

    public CourseEntity deleteCourse(Integer courseId);
}
