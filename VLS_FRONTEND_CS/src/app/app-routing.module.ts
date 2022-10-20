import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddCourseComponent } from "./add-course/add-course.component";
import { CourseSbComponent } from "./course-sb/course-sb.component";
import { LoginSbComponent } from "./login-sb/login-sb.component";

const routes: Routes = [
    {path:'',redirectTo:'/login',pathMatch:'full'},
    {path:'login', component:LoginSbComponent},
    {path:'courses', component:CourseSbComponent},
    {path:'addCourse', component:AddCourseComponent},
]
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})

export class AppRoutingModule{

}