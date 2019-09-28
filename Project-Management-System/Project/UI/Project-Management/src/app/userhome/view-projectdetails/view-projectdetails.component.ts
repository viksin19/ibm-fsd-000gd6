import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';

@Component({
  selector: 'app-view-projectdetails',
  templateUrl: './view-projectdetails.component.html',
  styleUrls: ['./view-projectdetails.component.css']
})
export class ViewProjectdetailsComponent implements OnInit {

  email: String
  users: User[]

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
        console.log(this.users);
      })
  }

}
