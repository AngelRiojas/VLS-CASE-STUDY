import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Login } from '../model/login.model';
import { LoginSbService } from '../service/login-sb.service';

@Component({
  selector: 'app-login-sb',
  templateUrl: './login-sb.component.html',
  styleUrls: ['./login-sb.component.css']
})
export class LoginSbComponent implements OnInit {
  //properties
  loginForm?: FormGroup;
  login?: Login; 
  userFound?: Login;
  constructor(private formBuild: FormBuilder, private loginSbService: LoginSbService, private router: Router) { }

  ngOnInit(): void {
    this.userFound = {};
    this.loginForm = this.formBuild.group({
      loginId:['',[Validators.required]],
      loginPassword:['',[Validators.required]],
    })
  }

  submitData() {
    this.loginSbService.getLoginById(this.loginForm.value)
    .subscribe((data) => {
      this.userFound = data;
      console.log("login: ", data)
      console.log("USER FOUND", this.userFound)
      if(this.userFound != null) {
        window.alert("Access Success!");
        localStorage.setItem('loginId',this.userFound.loginId);
        console.log("localStorage: ", localStorage.getItem('loginId'));
        this.router.navigate(['courses']);
      } 
      else {
        window.alert("User invalid!");
      }
    })
    
  }
}
