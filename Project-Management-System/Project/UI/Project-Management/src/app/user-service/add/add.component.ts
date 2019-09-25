import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

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
    password: new FormControl("")

   })

   }

  ngOnInit() {
  }
  submit(){
     let username = this.newAddUserForm.value.username;
     let ulocation = this.newAddUserForm.value.ulocation;
     let udomain = this.newAddUserForm.value.udomain;
     let img = this.newAddUserForm.value.img;
     let email = this.newAddUserForm.value.email;
     let previous_project = this.newAddUserForm.value.previous_project;
     let userType = this.newAddUserForm.value.userType;
     let password = this.newAddUserForm.value.password;
     let user =[];
     user.push({
       username: username,
       ulocation: ulocation,
       udomain: udomain,
       img: img,
       email: email,
       previous_project: previous_project,
       userType: userType,
       password: password
     }) 
     
     const _baseUrl = `http://b4ibm21.iiht.tech:8001`;

    fetch(_baseUrl + `/users`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(user)
    })
      .then(res => res.json())
      .then(res => {
       console.log(res.body);
      })
  }

}
