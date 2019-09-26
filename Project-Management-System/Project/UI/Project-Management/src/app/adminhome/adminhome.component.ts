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


public barOptions={
  scaleShowVerticalLines: false,
  responsive: true
};
public barLables=['2006','2007','2008'];
public barChartType='bar';
public barLegends=true;
public barData=[
{ data: [40,98,40], label: 'A'},
{ data: [35,60,70], label: 'B'}
];


public doughnutLabels=['Task','Teams'];
public doughnutChartType='doughnut';
public doughnutData=[40,80];


public pieLabels=['Manager','Employee'];
public pieData=[20,100];
public pieChartType='pie';

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
