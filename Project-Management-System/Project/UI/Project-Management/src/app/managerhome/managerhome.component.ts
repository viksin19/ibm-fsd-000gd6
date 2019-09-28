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
  manager:string
  constructor(private route: ActivatedRoute, private router: Router,private userService: UserService) {
   
    
  }


  ngOnInit() {

    this.email = localStorage.getItem("email");
    const _baseUrl = `http://b4ibm21.iiht.tech:8001/`;
    fetch(_baseUrl + `/user/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
            
        this.manager=res.username;
        console.log(this.manager);
        localStorage.setItem("manager",this.manager);

      })
  }

  

}
