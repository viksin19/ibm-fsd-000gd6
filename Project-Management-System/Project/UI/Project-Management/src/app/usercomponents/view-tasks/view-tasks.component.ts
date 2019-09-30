import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Interfaces/User';

@Component({
  selector: 'app-view-tasks',
  templateUrl: './view-tasks.component.html',
  styleUrls: ['./view-tasks.component.css']
})
export class ViewTasksComponent implements OnInit {

  email: String
  users: User[]
  user:any

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
        fetch(_baseUrl + `/`)
      })
  }

}
