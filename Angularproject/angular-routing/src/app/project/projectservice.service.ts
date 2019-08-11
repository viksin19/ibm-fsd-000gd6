import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProjectserviceService {
projects:Projects[]=[]
  constructor() { }

  //  add user
add(data){
this.projects.push(data);
  // console.log(this.projects)
}


getproject(){
  console.log(this.projects);
  return this.projects ;
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
modify(data){

  for(var i=0; i<this.projects.length; i++){

    if(this.projects[i].Pid == data.Pid){
      
      this.projects[i].Pname = data.Pname;
    }
  }
  
}
findUserById(_id){
  return this.projects.find(u=>{
    return u.Pid == _id
  })
}

}

export interface Projects {
Pid:number
Pname:string
}
