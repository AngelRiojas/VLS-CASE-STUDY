import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Login } from '../model/login.model';

@Injectable({
  providedIn: 'root'
})
export class LoginSbService {
  baseUrl: string = "http://localhost:9098/api/v1/login";

  //like @autowired... angular injects the http instance.
  constructor(private httpClient: HttpClient) { }

  getLoginById(login: Login) {
    return this.httpClient.post(this.baseUrl, login);
  }
}
