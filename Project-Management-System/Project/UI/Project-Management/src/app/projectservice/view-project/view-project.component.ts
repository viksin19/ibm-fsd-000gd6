import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/Interfaces/Project';
import { Router } from "@angular/router";
@Component({
  selector: 'app-view-project',
  templateUrl: './view-project.component.html',
  styleUrls: ['./view-project.component.css']
})
export class ViewProjectComponent implements OnInit {
projects: Project[]
id:Number
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
  window.localStorage.setItem("projectId",id);
  this.router.navigate(['adminhome/updateproject']);
}

  delete(id){
    console.log(id);
    const url = `http://b4ibm21.iiht.tech:8010`;
    fetch(url+`/deleteproject/${id}`,{
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    }).then(res=>res.json)
    .then(res=>{
         if(res[0]=="deleted"){
           alert("Project Deleted");
         }
        document.location.reload();
    })
  }
team(id){
  console.log(id);
  window.localStorage.setItem("projectId",id);
  this.router.navigate(['adminhome/viewteam']);
}
}
