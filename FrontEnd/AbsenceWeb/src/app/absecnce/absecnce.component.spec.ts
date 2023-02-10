import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AbsecnceComponent } from './absecnce.component';

describe('AbsecnceComponent', () => {
  let component: AbsecnceComponent;
  let fixture: ComponentFixture<AbsecnceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AbsecnceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AbsecnceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
