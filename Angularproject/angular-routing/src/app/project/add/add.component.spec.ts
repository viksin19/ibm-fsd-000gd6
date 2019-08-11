import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { AddComponent } from './add.component';
import { Projects, ProjectserviceService } from '../projectservice.service';
import { FormsModule } from '@angular/forms';


describe('AddComponent', () => {
  let component: AddComponent;
  let fixture: ComponentFixture<AddComponent>;
  let service:ProjectserviceService

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddComponent ],imports:[
        FormsModule
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    service = TestBed.get(ProjectserviceService);
    fixture = TestBed.createComponent(AddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

   it('should add project',()=>{
    let proj:Projects = {
      Pid: 1,
      Pname: 'FSD'
    }
    component.addProject(proj);
    const projcreated = service.findUserById(proj.Pid);
    console.log(projcreated);
    expect(projcreated).toBe(proj);

   });

});
