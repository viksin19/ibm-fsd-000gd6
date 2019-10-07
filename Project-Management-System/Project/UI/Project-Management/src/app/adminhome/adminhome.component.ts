import { Component, OnInit } from '@angular/core';
import { User } from '../Interfaces/User';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user.service';
import { Project } from '../Interfaces/Project';

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
  admin:string
  memberCount:any[]
  projects:Project[]
  

  public barOptions = {
    scaleShowVerticalLines: false,
    responsive: true
  };
  public barLables = [];
  public barChartType = 'bar';
  public barLegends = true;
  public barData = [
    { data: this.memberCount, label: 'Members' }
   
  ];


  public doughnutLables = ['Projects-Completed', 'Live-Projects'];
  public doughnutChartType = 'doughnut';
  public doughnutData = [4,6];

  public pieLabels = ['Manager','Free-Developer','Enganged-Developer'];
  public pieData = [ , , , ];
  public pieChartType = 'pie';

  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService) {
    
    
    this.mCount = 0;
    this.uCount = 0;
    this.engagedUser = 0;
  }

  ngOnInit() {
    this.email = localStorage.getItem("email");
    console.log(this.email);
    const _baseUrl = `http://b4ibm21.iiht.tech:8001/`;
    fetch(_baseUrl + `/user/${this.email}`, {
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    })
      .then(res => res.json())
      .then(res => {
        this.userData = res;
        this.admin=this.userData.username;
       console.log(this.admin);
       window.localStorage.setItem("admin",this.admin);
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


            fetch(`http://b4ibm21.iiht.tech:8010/projects/getallproject`,{
              method:"GET",
              headers:{
                "Content-Type":"application/json"
              }
            }).then(pro=>pro.json())
              .then(pro=>{
                  this.projects=pro;
                  this.proGraph();

              })
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
  
  }
  proGraph(){
     
    for ( let i=0; i<this.projects.length;i++){
      if(i==0){
        this.barLables=[this.projects[i].pname]
      }else{
      this.barLables.push(this.projects[i].pname);
      }
      
      fetch(`http://b4ibm21.iiht.tech:8001/findByProjectId/${this.projects[i].projectId}`,{
        method:"GET",
        headers:{
          "Content-Type":"application/json"
        }
      }).then(res=>res.json())
        .then(res=>{
          console.log(res);
          let result:User[]
          result=res;
          if(i==0){
            this.memberCount=[result.length];
          }else{
          this.memberCount.push(result.length);
          }
        })
    }
    console.log(this.barLables);
    console.log(this.barData);
  }

  
}

