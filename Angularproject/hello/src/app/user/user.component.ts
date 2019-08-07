import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
message:string
url:string
users:string[]
employees:Employee[]
showtable:boolean

  constructor() {
  
   }

  ngOnInit() {
    this.message= "This is first time we are using Angular !!!!!!!!!";
    this.url = "https://wegotthiscovered.com/wp-content/uploads/2018/11/Marvel-Avengers-4-title-1.jpg";
    this.users= [ 
      "vikram",
      "suraj",
      "vivek",
      "shivam",
      "anirban",
      "mentor"
    ];
    this.employees = [
      {
        id:1,
        name:'vikram'
      },
      {
        id:2,
        name:'jai'
      },
      {
        id:3,
        name:'vivek'
      }
    ];
    
    this.showtable = this.employees.length > 0 ;
    

}
}

interface Employee {
  id:number
  name:string
}