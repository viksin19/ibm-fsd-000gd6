import { TestBed } from '@angular/core/testing';
import { ProjectserviceService, Projects } from './projectservice.service';

describe('ProjectserviceService', () => {
 let service:ProjectserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({})
    service = TestBed.get(ProjectserviceService);
  });

  it('should be created', () => {
    const service: ProjectserviceService = TestBed.get(ProjectserviceService);
    expect(service).toBeTruthy();
  });
 
  it('should Add and Get project',()=>{
     const projadded:Projects = {
       Pid: 1,
       Pname:'FSD'
     }
     service.add(projadded);
     const proj:any = service.getproject();
     expect(proj).toBe(projadded);

  });

   it('should Delete project',()=>{
    const projadded:Projects = {
      Pid: 1,
      Pname:'FSD'
    }
    service.add(projadded);
    service.delete(1);
    const retproj:any = service.findUserById(1);
    expect(retproj.length).toBe(0);

   });  
   it('should modify project',()=>{
     service.add({
       Pid:2,
       Pname: 'AT&T'
     });
     const modifyproj ={
       Pid: 2,
       Pname:'FSD'
     }
     service.modify(modifyproj);
     const mproj = service.findUserById(2);
     expect(mproj).toBe(modifyproj);
   });
});
