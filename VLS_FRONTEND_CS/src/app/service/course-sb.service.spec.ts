import { TestBed } from '@angular/core/testing';

import { CourseSbService } from './course-sb.service';

describe('CourseSbService', () => {
  let service: CourseSbService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CourseSbService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
