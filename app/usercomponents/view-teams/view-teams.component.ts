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
  users: User
  user:any
  teams:User
  project:Project

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
        fetch(_baseUrl + `/user/${this.users.projectid}`,{
          method: "GET",
          headers:{
            "Content-Type":"application/json"
          }
        }).then(res=>res.json())
          .then(data=>{

               this.teams=data;
               console.log(this.teams);

               fetch(`http://b4ibmtech.iiht:8010/project/${this.users.projectid}`,{
                 method:"GET",
                 headers:{
                   "Content-Type":"application"
                 }
                }).then(res=>res.json())
                    .then(pro=>{
                       
                      this.project=pro;
                       
                    })
              
          })
      })
  }

}
