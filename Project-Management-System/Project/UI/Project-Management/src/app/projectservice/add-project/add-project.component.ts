import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Interfaces/User';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-add-project',
  templateUrl: './add-project.component.html',
  styleUrls: ['./add-project.component.css']
})
export class AddProjectComponent implements OnInit {
  users: User[]
  role: string
  uNames: userName[]
  newProjectForm: FormGroup
  constructor() {
    this.role = "manager"
    this.newProjectForm = new FormGroup({
      pname: new FormControl(""),
      plocation: new FormControl(""),
      start_date: new FormControl(""),
      end_date: new FormControl(""),
      pmanagerEmail: new FormControl("")
    })
  }

  ngOnInit() {
    const _baseUrl = `http://b4ibm21.iiht.tech:8001/`;
    fetch(_baseUrl + `/users/role/${this.role}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
        this.users = res;
        this.ints()
      })
  }

  ints() {
    this.uNames = [];
    console.log(this.users);
    for (let i = 0; i < this.users.length; i++) {
      let uDetails = {email : this.users[i].email, name : this.users[i].username}
      console.log(uDetails);
      this.uNames[i] =(uDetails);
    }
  }

  submit() {

  }
}

interface userName{
  email : string
  name : string
}
