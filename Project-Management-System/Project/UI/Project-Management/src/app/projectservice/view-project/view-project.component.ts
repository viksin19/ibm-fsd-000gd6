import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/Interfaces/Project';
import { Router } from "@angular/router";
import { FormGroup, FormControl } from '@angular/forms';
@Component({
  selector: 'app-view-project',
  templateUrl: './view-project.component.html',
  styleUrls: ['./view-project.component.css']
})
export class ViewProjectComponent implements OnInit {
projects: Project[]
project:Project
id:Number

  constructor(private router:Router) { 
    this.project= {  projectId: 0,
      pname:"",
      plocation: "",
      start_date:"",
      end_date:"",
      pmanagerEmail:""};
  }

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

  // call Update Form
updateForm(id){
  
  window.localStorage.setItem("projectId",id);
  console.log(id);
  const url = `http://b4ibm21.iiht.tech:8010`;
  fetch(url+`/findbyid/${id}`,{
    method: "GET",
    headers: {
      "Content-Type":"application/json"
    }
  }).then(res=>res.json())
     .then(data=>{
      
      this.project=data;
      console.log(this.project);
       this.form();
     })
 
}

// deleted

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

  // view team
team(id){
  console.log(id);
  document.getElementById("teamtoggle").click();
  window.localStorage.setItem("projectId",id);

}

// update project
update(){
  
  const url = `http://b4ibm21.iiht.tech:8010`;
  console.log(this.project);

  document.getElementById("updateclose").click();
  fetch(url + "/projects", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(this.project)
  })
    .then(res => res.json())
    .then(res => {
      console.log(res);
    });
  // document.location.reload();
}

// update form generation
form(){
  document.getElementById("toggle").click();

}
buttonclicked(){
  console.log("called bro")
}
show(){

}
}
