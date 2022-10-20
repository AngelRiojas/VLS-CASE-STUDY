import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Course } from '../model/course.model';
import { CourseSbService } from '../service/course-sb.service';

@Component({
  selector: 'app-course-sb',
  templateUrl: './course-sb.component.html',
  styleUrls: ['./course-sb.component.css']
})
export class CourseSbComponent implements OnInit {

  //properties
  section = 'Courses Section';
  courses?: Course[];

  constructor(private courseSbService:CourseSbService, private router: Router) { }

  ngOnInit(): void {
    console.log("INIT leave service")
    this.courseSbService.getCourses().subscribe(
      (data) => {
        this.courses = data;
        console.log(this.courses);
      }
    )
  }

  gotoAddCourse() {
    this.router.navigate(['addCourse']);
  }

  DeleteCourse(toDeleteCourse: Course) {
    console.log('Course sent to server..');
    console.log(toDeleteCourse);
    this.courseSbService.deleteCourse(toDeleteCourse.courseId).subscribe(
      (data) => {
        //remove from array
        this.courses = this.courses.filter(
          (course) => {course != toDeleteCourse}
        )
        console.log('Denied.', toDeleteCourse);
      }
    );
    this.router.navigate(['courses']);
  }

  gotoLogin() {
    this.router.navigate(['/']);
  }

}
