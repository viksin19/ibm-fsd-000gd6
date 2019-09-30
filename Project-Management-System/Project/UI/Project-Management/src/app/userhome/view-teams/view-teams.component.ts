import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';
import { TeamInterface } from 'src/app/Team/Team';

@Component({
  selector: 'app-view-teams',
  templateUrl: './view-teams.component.html',
  styleUrls: ['./view-teams.component.css']
})
export class ViewTeamsComponent implements OnInit {

  email: String
  users: User
  team : TeamInterface


  constructor() { }

  ngOnInit() {    
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
        const _project = `http://localhost:8020`;
        fetch(_project + `/findbyid/${this.users.taskId}`,{
          method: "GET",
          headers: {
            "Content-type": "application/json"
          }
        })
        .then(res => res.json())
        .then(res => {
          this.team = res;
        })
      })
  }

}
