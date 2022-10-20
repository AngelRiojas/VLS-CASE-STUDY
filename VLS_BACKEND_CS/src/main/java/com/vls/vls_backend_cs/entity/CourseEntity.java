package com.vls.vls_backend_cs.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "COURSE")
public class CourseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "COURSE_ID")
    private Integer courseId;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "COURSE_AUTHOR_NAME")
    private String courseAuthorName;

    @Column(name = "COURSE_DURATION")
    private Integer courseDuration;

    @Column(name = "COURSE_STATUS")
    private String courseStatus;

    public CourseEntity() {

    }

    public CourseEntity(Integer courseId, String courseName, String courseAuthorName, Integer courseDuration, String courseStatus) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAuthorName = courseAuthorName;
        this.courseDuration = courseDuration;
        this.courseStatus = courseStatus;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthorName() {
        return courseAuthorName;
    }

    public void setCourseAuthorName(String courseAuthorName) {
        this.courseAuthorName = courseAuthorName;
    }

    public Integer getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(Integer courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    @Override
    public String toString() {
        return "courseEntity{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseAuthorName='" + courseAuthorName + '\'' +
                ", courseDuration=" + courseDuration +
                ", courseStatus='" + courseStatus + '\'' +
                '}';
    }
}
