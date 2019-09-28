import { Component, OnInit } from '@angular/core';
import { Team } from 'src/app/Team/Team';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-team',
  templateUrl: './view-team.component.html',
  styleUrls: ['./view-team.component.css']
})
export class ViewTeamComponent implements OnInit {

  users: Team[]
  tDetails: teamDetails[]
  delemail: String
  updateemail: String
  

  constructor(private router: Router) {
   }

  ngOnInit() {
    const _baseUrl = `http://localhost:8050`;
    fetch(_baseUrl + `/getByTaskId/1`,{
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
    this.tDetails = [];
    for (let i= 0; i< this.users.length; i++){
      let tName = {
        email : this.users[i].uemail
      }
      this.tDetails[i] = (tName);
    }
  }

  delete(email){
    this.delemail  = email
    const _baseUrl = `http://localhost:8050`;
    fetch(_baseUrl + `/deleteByemail/${this.delemail}`, {
      method: "GET"
    })
    this.ngOnInit();
  }

//   update(email){
//     this.updateemail = email
//     const _baseUrl = `http://localhost:8050`;
//     fetch(_baseUrl + `/getByemail/${this.updateemail}`, {
//       method: "GET",
//       headers: {
//         "Content-Type": "application/json"
//       }
//     })
//     .then(res => res.json())
//     .then(res => {
//       this.users = res;
//       console.log(this.users);
//     })
//     this.router.navigateByUrl('/teamService/update');
//   }
}

interface teamDetails{
  email: String
}