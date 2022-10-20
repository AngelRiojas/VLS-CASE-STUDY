import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Course } from '../model/course.model';

@Injectable({
  providedIn: 'root'
})
export class CourseSbService {
  baseUrl: string = "http://localhost:9098/api/v1/CourseList";

  //like @autowired... angular injects the http instance.
  constructor(private httpClient: HttpClient) { }

  getCourses() {
    return this.httpClient.get<Course[]>(this.baseUrl);
  }

  createCourse(course: Course) {
    //post : new course
    return this.httpClient.post(this.baseUrl + "/create", course);
  }

  deleteCourse(courseId:number) {
    return this.httpClient.delete<Course>(this.baseUrl + "/delete/" + courseId);
  }
}
