import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProjectserviceService {
projects:Projects[]
  constructor() { }

  // get user
  getproject(){
    return this.projects ;
  }


  //  add user
add(data){
this.projects.push({
  Pid:data.id,
  Pname:data.name});
}
// delete user
delete(id){
  for( var k=0; k < this.projects.length ; k++){
    if(this.projects[k].Pid == id){
      this.projects.splice(k,1);
    }
  }
}
// modify user
modify(id,name){

  this.projects.forEach(p=>{
    if(p.Pid == id){
      p.Pid = id;
      p.Pname = name;
    }
  })
}

}

interface Projects {
Pid:number
Pname:string
}
