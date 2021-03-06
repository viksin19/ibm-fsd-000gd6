import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user/User';
import { Project } from 'src/app/Interfaces/Project';

@Component({
  selector: 'app-view-projectdetails',
  templateUrl: './view-projectdetails.component.html',
  styleUrls: ['./view-projectdetails.component.css']
})
export class ViewProjectdetailsComponent implements OnInit {

  email: String
  users: User
  user:any
  projects:Project
  manager:string

  constructor() { }

  ngOnInit() {   
    this.user=localStorage.getItem("user"); 
    this.email=JSON.parse(window.localStorage.getItem("email"));
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
        this.users = res;
        console.log(this.users);
          
        const url = `http://b4ibm21.iiht.tech:8010`;
        fetch(url+`/project/${this.users.projectid}`,{
          method: "GET",
          headers: {
            "Content-Type":"application/json"
          }
        })
        .then(res=>res.json())
        .then(data=>{
          console.log(data);
          this.projects=data;

          fetch(_baseUrl+`/user/${this.projects.pmanagerEmail}`,{
            method: "GET",
            headers: {
              "Content-Type":"application/json"
            }
          }).then(res=>res.json())
            .then(mana=>{

              this.manager=mana;
            })
        }) 
        
      })
  }

}
