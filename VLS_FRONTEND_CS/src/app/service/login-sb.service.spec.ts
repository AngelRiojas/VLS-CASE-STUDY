import { TestBed } from '@angular/core/testing';

import { LoginSbService } from './login-sb.service';

describe('LoginSbService', () => {
  let service: LoginSbService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoginSbService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
