import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../Interfaces/User';

@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrls: ['./userhome.component.css']
})
export class UserhomeComponent implements OnInit {
userName:any
email : string
user:User
  constructor(private userService :UserService) { }


  public doughnutLables = ['Task-Completed', 'Reamaining-Task'];
  public doughnutChartType = 'doughnut';
  public doughnutData = [40, 60];


  ngOnInit() {
    this.userName=localStorage.getItem("user");
     this.email=localStorage.getItem("email");
    this.userService.getUserByEmail(data =>{
       this.user = data;
    },this.email);
  }

}
