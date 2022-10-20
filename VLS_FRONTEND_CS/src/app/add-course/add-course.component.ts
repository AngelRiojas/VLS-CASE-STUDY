import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Course } from '../model/course.model';
import { CourseSbService } from '../service/course-sb.service';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {

  //properties
  addCourseForm?: FormGroup;
  course?: Course; 

  constructor(private formBuild: FormBuilder, private courseSbService:CourseSbService, private router: Router) { }

  ngOnInit(): void {
    this.addCourseForm = this.formBuild.group({
      courseId: [],
      courseName: [],
      courseAuthorName: [],
      courseDuration: [],
      courseStatus: [],
    })

  }

  gotoCourse() {
    this.router.navigate(['courses']);
  }

  saveCourse() {
    this.courseSbService.createCourse(this.addCourseForm.value)
    .subscribe((data) => {
      console.log("data saved.", data)
    })
    window.alert("leave added");
    this.router.navigate(['courses']);
  }
}
