import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';
import { Project } from 'src/app/project/Project';

@Component({
  selector: 'app-view-projectdetails',
  templateUrl: './view-projectdetails.component.html',
  styleUrls: ['./view-projectdetails.component.css']
})
export class ViewProjectdetailsComponent implements OnInit {

  email: String
  users: User
  project: Project

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
      if(this.users!=null){
        const _project = `http://localhost:8010`;
      fetch(_project + `/findbyid/${this.users.projectid}`, {
        method: "GET",
        headers: {
          "Content-Type": "application/json"
        }
      })
      .then(res => res.json())
      .then(res => {
        this.project = res;
      })
      }
    })
  }

}
