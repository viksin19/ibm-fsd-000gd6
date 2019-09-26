import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/Interfaces/Project';
import { Router } from "@angular/router";
@Component({
  selector: 'app-view-project',
  templateUrl: './view-project.component.html',
  styleUrls: ['./view-project.component.css']
})
export class ViewProjectComponent implements OnInit {
projects: Project[];
id:Number;
  constructor(private router:Router) { }

  ngOnInit() {
    const url = `http://b4ibm21.iiht.tech:8010`;
    fetch(url+`/projects/getallproject`,{
      method: "GET",
      headers: {
        "Content-Type":"application/json"
      }
    })
    .then(res=>res.json())
    .then(data=>{
      console.log(data);
      this.projects=data;
    })
  }
update(id){
  
}
  delete(id){
    const url = `http://b4ibm21.iiht.tech:8010`;
    fetch(url+`delete/${id}`,{
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    }).then(res=>res.json)
    .then(res=>{
         if(res){
           alert("Project Deleted");
         }
        this.router.navigate(['projectService/view'])
    })
  }
team(id){
  window.localStorage.setItem("projectId",id);
  this.router.navigate(['adminhome/viewteam']);
}
}
