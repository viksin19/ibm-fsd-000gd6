import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';

@Component({
  selector: 'app-view-teams',
  templateUrl: './view-teams.component.html',
  styleUrls: ['./view-teams.component.css']
})
export class ViewTeamsComponent implements OnInit {

  email: String
  users: User
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
        this.user=this.users.username;
        const _project = `http://localhost:8050`;
        fetch(_baseUrl + `/`)
      })
  }

}
