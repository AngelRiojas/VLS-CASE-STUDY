import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseSbComponent } from './course-sb.component';

describe('CourseSbComponent', () => {
  let component: CourseSbComponent;
  let fixture: ComponentFixture<CourseSbComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CourseSbComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CourseSbComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
