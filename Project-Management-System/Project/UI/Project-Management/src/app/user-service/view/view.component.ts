import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Interfaces/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
users:User[];
email:String;
  constructor(private router:Router) { }

  ngOnInit() {
    const url=`http://b4ibm21.iiht.tech:8001/user`;
    fetch(url+`/getAllUser`,{
      method: "GET",
      headers: {
        "Content-Type":"application/json"
      }
    }).then(res=>res.json())
    .then(res=>{
      this.users=res;

    })
  }
update(email){
  const url=`http://b4ibm21.iiht.tech:8001/user`;
  fetch(url+`/${email}`,{
    method:"GET",
    headers:{
      "Content-Type":"application/json"
    }
  }).then(res=>res.json())
  .then(data=>{
    window.localStorage.setItem("data.userId",JSON.stringify(data));
  })
  this.router.navigate(['updateprofile']);
}
delete(email){
  const url=`http://b4ibm21.iiht.tech:8001/user`;
  fetch(url+`/delete/${email}`,{
    method:"POST",
    headers:{
      "Content-Type":"application/json"
    }
  }).then(res=>res.json())
  .then(res=>{
    if(res){
      alert("User Deleted !!");
    }
    this.router.navigate(['userService/view']);
  })
}
}
