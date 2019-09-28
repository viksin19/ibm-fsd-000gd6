import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { User } from 'src/app/user/User';

@Component({
  selector: 'app-add-team',
  templateUrl: './add-team.component.html',
  styleUrls: ['./add-team.component.css']
})
export class AddTeamComponent implements OnInit {
  role: string
  users: User[]
  uNames: userName[]
  manager:string
  newTeamForm: FormGroup

  constructor() {
    this.role = "user"
    this.newTeamForm = new FormGroup({
      ufirstName: new FormControl(""),
      ulastName: new FormControl(""),
      uemail: new FormControl(""),
      ustatus: new FormControl(""),
      uassigndate: new FormControl("")
    })
  }

  ngOnInit() {
    this.manager=localStorage.getItem("manager");
    const _baseUrl = `http://localhost:8001`;
    fetch(_baseUrl + `/user/role/${this.role}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
    .then(res => res.json())
    .then(res => {
      this.users = res;
      this.ints();
    })
  }

  ints(){
    this.uNames = [];
    console.log(this.users);
    for(let i=0; i<this.users.length; i++){
      let uDetails ={
        email : this.users[i].email,
        name : this.users[i].username
      }
      this.uNames[i] = (uDetails);
    }
  }

  submit(){
    let firstName = this.newTeamForm.value.ufi;
    let lastName = this.newTeamForm.value.ulastName;
    let email = this.newTeamForm.value.uemail;
    let status = this.newTeamForm.value.ustatus;
    let assigndate = this.newTeamForm.value.uassigndate;
    let teamDetails = [];
    teamDetails.push({"userid":"abc","ufirstName":firstName,"ulastName":lastName,"uemail":email,
          "ustatus":status,"uassigndate": assigndate,"taskId":1});
    const _baseUrl = `http://localhost:8050`;
    fetch(_baseUrl +  "/team",{
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(teamDetails)
    })
    .then(res => res.json())
    .then(res => {
      console.log(teamDetails[0]);
      console.log(res);
    })
  }

}

interface userName{
  email : String
  name : String
}