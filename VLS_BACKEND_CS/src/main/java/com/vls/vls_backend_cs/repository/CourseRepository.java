package com.vls.vls_backend_cs.repository;

import com.vls.vls_backend_cs.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
    CourseEntity findByCourseId(Integer courseId);
}
