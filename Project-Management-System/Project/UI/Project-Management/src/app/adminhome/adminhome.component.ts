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
  graphUser: User[]
  mCount: number
  uCount: number
  engagedUser: number
  arr:any[]


  public barOptions = {
    scaleShowVerticalLines: false,
    responsive: true
  };
  public barLables = ['2006', '2007', '2008'];
  public barChartType = 'bar';
  public barLegends = true;
  public barData = [
    { data: [40, 98, 40], label: 'A' },
    { data: [35, 60, 70], label: 'B' }
  ];


  public doughnutLabels = ['Task', 'Teams'];
  public doughnutChartType = 'doughnut';
  public doughnutData = [40, 80];

  public pieLabels = ['Manager','Free-Developer','Enganged-Developer'];
  public pieData = [ , , , ];
  public pieChartType = 'pie';

  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService) {
    this.email = this.route.snapshot.queryParams.email;
    this.mCount = 0;
    this.uCount = 0;
    this.engagedUser = 0;
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
        this.localCheck();
        fetch(_baseUrl + `user/getAllUser`, {
          method: "GET",
          headers: {
            "Content-Type": "application/json"
          }
        }).then(res => res.json())
          .then(data => {
            this.graphUser = data;
            this.graphsUser();
          })

      })



  }
  graphsUser() {
    
    for (let i = 0; i < this.graphUser.length; i++) {
      if (this.graphUser[i].userType == "manager") {
        this.mCount++;
      } else if (this.graphUser[i].availability == "yes") {
        this.uCount++;
      } else {
        this.engagedUser++;
      }

    }
     this.arr = [this.mCount,this.uCount,this.engagedUser];
     this.pieData=this.arr;
 
  }
  localCheck() {
    localStorage.setItem("email", JSON.stringify(this.userData.email));
  }

  
}

