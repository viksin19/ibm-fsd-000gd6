import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { stat } from 'fs';

@Component({
  selector: 'app-add-team',
  templateUrl: './add-team.component.html',
  styleUrls: ['./add-team.component.css']
})
export class AddTeamComponent implements OnInit {
  newTeamForm: FormGroup

  constructor() {
    this.newTeamForm = new FormGroup({
      ufirstName: new FormControl(""),
      ulastName: new FormControl(""),
      uemail: new FormControl(""),
      ustatus: new FormControl(""),
      uassigndate: new FormControl("")
    })
   }

  ngOnInit() {
  }

  submit(){
    let firstName = this.newTeamForm.value.ufirstName;
    let lastName = this.newTeamForm.value.ulastName;
    let email = this.newTeamForm.value.uemail;
    let status = this.newTeamForm.value.ustatus;
    let assigndate = this.newTeamForm.value.uassigndate;
    console.log(firstName);
    console.log(lastName);
    console.log(email);
    console.log(status);
    console.log(assigndate);
    let teamDetails = [];
    teamDetails.push({"userId":"abc","ufirstName":"shankar","ulastName":"mahesh","uemail":"shankarmahesh@gmail.com",
          "ustatus":"active","uassigndate": "21/10/2019","taskId":1});
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
