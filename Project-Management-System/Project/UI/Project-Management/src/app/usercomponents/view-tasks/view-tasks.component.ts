import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Interfaces/User';
import { Project } from 'src/app/Interfaces/Project';
import { Tasks } from 'src/app/Interfaces/Tasks';

@Component({
  selector: 'app-view-tasks',
  templateUrl: './view-tasks.component.html',
  styleUrls: ['./view-tasks.component.css']
})
export class ViewTasksComponent implements OnInit {

  email: String
  users: User
  user:any
  project:Project
  task:Tasks[]

  constructor() {
    this.users = {
      username: "",
      password: "",
      ulocation: "",
      availability: "",
      email: "",
      img: "",
      udomain: "",
      previous_project: "",
      userType: "",
      projectid: "",
      taskId: ""
   }
  }
  ngOnInit() {    
    this.user=localStorage.getItem("user");
    this.email=JSON.parse(window.localStorage.getItem("email"));
    console.log(this.email);
    const _baseUrl = `http://b4ibm.iiht.tech:8001`;
    fetch(_baseUrl + `/user/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    }).then(res => res.json())
      .then(res => {
        this.users = res;
            const _task = `http://localhost:8021`;
            fetch(_task+`/getAllTasks/${this.project.projectId}`,{
              method:"GET",
              headers:{
                "Content-Type":"application/json"
              }
            }).then(response=>response.json())
              .then(ta=>{
                 this.task=ta;
              })

          
      })
  }

}
