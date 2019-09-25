import { Component, OnInit } from '@angular/core';
import { User } from '../Interfaces/User';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-adminhome',
  templateUrl: './adminhome.component.html',
  styleUrls: ['./adminhome.component.css']
})
export class AdminhomeComponent implements OnInit {
  userData: User
  email: string
  constructor(private route: ActivatedRoute, private router: Router,private userService: UserService) {
    this.email = this.route.snapshot.queryParams.email;
  }

  ngOnInit() {
    const _baseUrl = `http://b4ibm21.iiht.tech:8001/`;
    fetch(_baseUrl + `/user/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
        console.log(res.email);
        this.userData = res;
        this.submit();
      })
  }

  submit(){
    localStorage.setItem("email", JSON.stringify(this.userData.email));
  }
}
