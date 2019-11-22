import { Component, OnInit,ViewChild } from '@angular/core';
import {FormGroup,FormControl,Validators} from '@angular/forms';

import {MatTableDataSource} from '@angular/material/table';
import { stringify } from '@angular/compiler/src/util';

@Component({
  selector: 'app-employee-main',
  templateUrl: './employee-main.component.html',
  styleUrls: ['./employee-main.component.css']
})
export class EmployeeMainComponent implements OnInit {
addForm:FormGroup
employees:Employee[]
domains:any[]
count:number
ELEMENT_DATA: Employee[]
// table
displayedColumns: string[] = ['empName', 'empEmail', 'empCity', 'mobile','gender','domain','hireDate'];
dataSource:Employee[]




  constructor() {
    this.addForm = new FormGroup({
      $key: new FormControl(null),
      empName: new FormControl('',[Validators.required]),
      empEmail: new FormControl('',[Validators.email]),
      empCity: new FormControl('',[Validators.required]),
      mobile: new FormControl('',[Validators.minLength(8)]),
      gender: new FormControl('',[Validators.required]),
      domain: new FormControl('',[Validators.required]),
      hireDate: new FormControl('',[Validators.required])
    });
    

    this.domains=[{Value:'Full-Stack'},{Value:'Testing'},{Value:'Networking'}]
   }

  ngOnInit() {
  this.count= parseInt(localStorage.getItem('count'));
  this.ELEMENT_DATA=JSON.parse(localStorage.getItem('employees'));
  this.dataSource = this.ELEMENT_DATA;
  }
add(){
 
 let name=this.addForm.value.empName;
let empEmail=this.addForm.value.empEmail;
let empCity=this.addForm.value.empCity;
let mobile=this.addForm.value.mobile;
let gender=this.addForm.value.gender;
let domain=(this.addForm.value.domain).Value;
let hireDate=this.addForm.value.hireDate;
let employee=[];
employee.push({
empName:name,
empEmail:empEmail,
empCity:empCity,
mobile:mobile,
gender:gender,
domain:domain,
hireDate:hireDate

});

 console.log(employee);
this.save(employee)
}
save(emp){
  if(this.count==0){
    this.employees=[emp[0]];
    this.count=this.count+1;
    localStorage.setItem('count',stringify(this.count));
    localStorage.setItem('employees',JSON.stringify(this.employees));
  }else{
  this.employees.push(emp[0]);
  localStorage.setItem('employees',JSON.stringify(this.employees));
  
  }
  console.log(this.employees);
  document.location.reload();
    // this.view(this.ELEMENT_DATA);
  //  this.ELEMENT_DATA = this.employees;
}
}

interface Employee{
  empName:string,
  empEmail:string,
  empCity:string,
  mobile:number,
  gender:string,
  domain:string,
  hireDate:string
}
export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

