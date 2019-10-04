import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  roles: any[]
  admin:string
  newAddUserForm: FormGroup
  cities : any[]
  available : any[]
  constructor() {
    this.newAddUserForm = new FormGroup({
      username: new FormControl("",[Validators.required]),
      ulocation: new FormControl("",[Validators.required]),
      udomain: new FormControl("",[Validators.required]),
      email: new FormControl("",[Validators.email]),
      previous_project: new FormControl("",[Validators.required]),
      userType: new FormControl("",[Validators.required]),
      password: new FormControl("",[Validators.minLength(6)]),
      availability: new FormControl("",[Validators.required])

    })
    this.roles =[{type : "manager"},{type : "user"}];

    this.cities = [{city : "Banglore"},{city : "Chennai"},{city : "Gurgaon"},{city : "Hyderabad"},{city : "Kolkata"},
    {city : "Mumbai"},{city : "Pune"}];

    this.available = [{status : "yes"},{status : "no"}];
  }

  ngOnInit() {
    this.admin=localStorage.getItem("admin");
  }
  submit() {
    let username = this.newAddUserForm.value.username;
    let ulocation = this.newAddUserForm.value.ulocation.city;
    let udomain = this.newAddUserForm.value.udomain;
    let email = this.newAddUserForm.value.email;
    let previous_project = this.newAddUserForm.value.previous_project;
    let userType = this.newAddUserForm.value.userType.type;
    let password = this.newAddUserForm.value.password;
    let availability = this.newAddUserForm.value.availability.status;
    let user = [];
    user.push({
      username: username,
      password: password,
      ulocation: ulocation,
      availability: availability,
      email: email,
      udomain: udomain,
      previous_project: previous_project,
      userType: userType,
    })


    console.log(user);
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
        if(res){
          alert("Added-Successfully !!");
        }
      })
  }

}
