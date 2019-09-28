import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../Interfaces/User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-managerhome',
  templateUrl: './managerhome.component.html',
  styleUrls: ['./managerhome.component.css']
})
export class ManagerhomeComponent implements OnInit {
  userData: User
  email: string
  constructor(private route: ActivatedRoute, private router: Router,private userService: UserService) {
    this.email = this.route.snapshot.queryParams.email;
    this.getUser();
  }

  getUser(){
    console.log(this.email);
    this.userService.getUserByEmail((data)=>{
      this.userData = data;
      console.log(this.userData);
    },this.email);
  }

  ngOnInit() {localStorage.setItem("memail", JSON.stringify(this.email));}

  

}
