import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';
import { Project } from 'src/app/Interfaces/Project';

@Component({
  selector: 'app-view-teams',
  templateUrl: './view-teams.component.html',
  styleUrls: ['./view-teams.component.css']
})
export class ViewTeamsComponent implements OnInit {

  email: String
  users:User[]
  user:User
  u:any
  teams:User
  project:Project

  constructor() { 
    this.user = {
      username: "",
      password: "",
      ulocation: "",
      avialability: "",
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

    this.u=localStorage.getItem("user");
    this.email=JSON.parse(window.localStorage.getItem("email"));
    console.log(this.email);
    this.email = localStorage.getItem("email");
    console.log(this.email);
    const _baseUrl = `http://b4ibm21.iiht.tech:8001`;
    fetch(_baseUrl + `/user/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
        this.user = res;
        let taskUrl = `http://b4ibm21.iiht.tech:8001`
        fetch(taskUrl + `/findByProjectId/${this.user.projectid}`,{
          method: "GET",
          headers:{
            "Content-Type":"application/json"
          }
        }).then(res=>res.json())
          .then(data=>{
               this.users=data;
               console.log(this.users);
          })
      })
  }

}
