import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  roles: any[]
  newAddUserForm: FormGroup
  constructor() {
    this.newAddUserForm = new FormGroup({
      username: new FormControl(""),
      ulocation: new FormControl(""),
      udomain: new FormControl(""),
      img: new FormControl(""),
      email: new FormControl(""),
      previous_project: new FormControl(""),
      userType: new FormControl(""),
      password: new FormControl(""),
      availability: new FormControl("")

    })
    this.roles =[{type : "manager"},{type : "user"}];
  }

  ngOnInit() {
  }
  submit() {
    let username = this.newAddUserForm.value.username;
    let ulocation = this.newAddUserForm.value.ulocation;
    let udomain = this.newAddUserForm.value.udomain;
    let img = this.newAddUserForm.value.img;
    let email = this.newAddUserForm.value.email;
    let previous_project = this.newAddUserForm.value.previous_project;
    let userType = this.newAddUserForm.value.userType.type;
    let password = this.newAddUserForm.value.password;
    let availability = this.newAddUserForm.value.availability;
    let user = [];
    user.push({
      username: username,
      password: password,
      ulocation: ulocation,
      availability: availability,
      email: email,
      img: img,
      udomain: udomain,
      previous_project: previous_project,
      userType: userType,
    })

    const _baseUrl = `http://b4ibm21.iiht.tech:8001`;
    fetch(_baseUrl + `/user`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(user)
    })
      .then(res => res.json())
      .then(res => {
        console.log(res);
      })
  }

}
