import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { UserService } from '../user.service';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  
  @Input () message:string ;
  
  constructor(private userobj : UserService) { 
   this.inactivecount = 0;
   this.activecount = 0;
  }
  emp:any
  user:Emp[]
  _id:number
  usercount:number
  activecount:number
  inactivecount:number
  @Output () details = new EventEmitter();
  ngOnInit() {
    this.message;
    this.emp;
    this.user;
    this.usercount = this.userobj.getlength();
    this.inactivecount;
    this.activecount;
  }
  clickme() {
    console.log("this.clickme()");
    this.emp={
      id: 1,
      name: "jai"
    };
    this.details.emit(this.emp);
  }
  show(){
       this.activecount = 0;
       this.inactivecount = 0;
      this.user = this.userobj.getuser();
      this.usercount = this.userobj.getlength();
      for ( var i=0; i< this.usercount; i++){
        if(this.user[i].status == 1){
          this.activecount+=1;
        }else{
          this.inactivecount+=1;
        }
      }
  }
  add(){
   this.user.push(this.userobj.adduser());
   this.usercount = this.userobj.getlength();
  
  if(this.user[this.usercount-1].status == 1){
    this.activecount+=1;
  }else{
    this.inactivecount+=1;
  }
  }
  delete(k,d){
    for( var j= 0; j < this.user.length; j++){ 
      if ( this.user[j].id === k) {
        this.user.splice(j, 1); 
        this.usercount = this.userobj.getlength();
      
        if(d==1){
          this.activecount-=1;
        }else{
          this.inactivecount-=1;
        }

      }
  }

}
}

interface Emp {
  id:number,
  name:string,
  age:number,
  status:number
}