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
  users: User[]
  user:any
  project:Project
  task:Tasks

  constructor() { }

  ngOnInit() {    
    this.user=localStorage.getItem("user");
    this.email=JSON.parse(window.localStorage.getItem("email"));
    console.log(this.email);
    const _baseUrl = `http://localhost:8001`;
    fetch(_baseUrl + `/user/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
        this.users = res;

        const _project = `http://localhost:8050`;
        fetch(_project + `/${this.email}`,{
          method:"GET",
          headers: {
            "Content-Type": "application/json"
          }
        }).then(res=>res.json())
          .then(pro=>{
              
            this.project=pro;

            const _task = `http://localhost:8001`;
            fetch(_task+`/${this.project.projectId}`,{
              method:"GET",
              headers:{
                "Content-Type":"application/json"
              }
            }).then(response=>response.json())
              .then(ta=>{
                 this.task=ta;
              })

          })
      })
  }

}
