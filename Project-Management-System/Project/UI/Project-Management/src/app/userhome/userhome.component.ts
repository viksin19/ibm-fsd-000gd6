import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../Interfaces/User';
import { Tasks } from '../Interfaces/Tasks';

@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrls: ['./userhome.component.css']
})
export class UserhomeComponent implements OnInit {
userName:any
email : string
userRecord:User
userTask:Tasks
  constructor(private userService :UserService) {
  
   }


  public doughnutLables = ['Task-Completed', 'Reamaining-Task'];
  public doughnutChartType = 'doughnut';
  public doughnutData = [40, 60];


  ngOnInit() {
    this.userName=localStorage.getItem("user");
     this.email=localStorage.getItem("email");
    this.userService.getUserByEmail(data =>{
       this.userRecord = data;
       console.log(this.userRecord);
    },this.email);


  }

  updateStatus(){
    document.getElementById("closeStatus").click();
      console.log(this.userTask);
    
  }

}
