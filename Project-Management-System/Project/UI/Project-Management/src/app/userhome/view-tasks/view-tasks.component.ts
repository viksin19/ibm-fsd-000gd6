import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';
import { Task } from 'src/app/task/Task';

@Component({
  selector: 'app-view-tasks',
  templateUrl: './view-tasks.component.html',
  styleUrls: ['./view-tasks.component.css']
})
export class ViewTasksComponent implements OnInit {

  email: String
  users: User
  task: Task

  constructor() { }

  ngOnInit() {    
    this.email=JSON.parse(window.localStorage.getItem("email"));
    console.log(this.email);
    const _baseUrl = `http://localhost:8001`;
    fetch(_baseUrl + `/users/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
        this.users = res;
        console.log(this.users);
        const _project = `http://localhost:8021`;
        fetch(_project + `/findbyid/${this.users.projectid}`,{
          method:"GET",
          headers: {
            "Content-Type" : "application/json"
          }
        })
        .then(res => res.json())
        .then(res => {
          this.task = res;
        })
      })
  }

}
