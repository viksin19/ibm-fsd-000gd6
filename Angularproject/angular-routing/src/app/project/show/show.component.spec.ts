import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { ShowComponent } from './show.component';
import { ProjectserviceService } from '../projectservice.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

describe('ShowComponent', () => {
 
  let component: ShowComponent;
  let fixture: ComponentFixture<ShowComponent>;
  let service:ProjectserviceService

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowComponent ],
      imports: [FormsModule , Router]
    })
    .compileComponents();
  }));

  beforeEach(() => {
   
    fixture = TestBed.createComponent(ShowComponent);
    component = fixture.componentInstance;
    service = fixture.debugElement.injector.get(ProjectserviceService);
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('should delete a Element',()=>{
    service.add({
      Pid:1,
      Pname:'vikram'
    });
    component.delete(1);
    const projectremain = service.getproject();
    expect(projectremain.length).toBe(0);
  });
});
