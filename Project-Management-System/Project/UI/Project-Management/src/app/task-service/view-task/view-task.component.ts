import { Component, OnInit } from '@angular/core';
import { Tasks} from 'src/app/Interfaces/Tasks';
import {Project} from 'src/app/Interfaces/Project';
import{User} from 'src/app/Interfaces/User';
import { Router } from "@angular/router";
@Component({
  selector: 'app-view-task',
  templateUrl: './view-task.component.html',
  styleUrls: ['./view-task.component.css']
})
export class ViewTaskComponent implements OnInit {
tasks:Tasks[]
task:Taskraedonlyproject
uNames:userName[]
users:User[]
proid:proid[]
projects:Project[]
pname:Project[]
id:Number;
  constructor(private router:Router) { 
    this.task={
      taskName:"",
      taskLeader:"",
      startDate:"",
      endDate:"",
      status:""
  }
  ;}

  ngOnInit() {
    const url = `http://b4ibm21.iiht.tech:8010`;
    fetch(url+`/projects/getAllTasks`,{
      method: "GET",
      headers: {
        "Content-Type":"application/json"
      }
    })
    .then(res=>res.json())
    .then(data=>{
      this.tasks=data;
      this.init();
      
    })
    for(let k=0;k<this.tasks.length;k++){
    fetch(url+`/projects/findbyid/${this.proid[k]}`,{
      method: "GET",
      headers: {
        "Content-Type":"application/json"
      }
    })
    .then(res=>res.json())
    .then(data=>{
      this.pname=data;
      
    })
  }
  }
  updateForm(id){
  
    window.localStorage.setItem("taskid",id);
    const _baseUrl = `http://b4ibm21.iiht.tech:8001/`;
    const url = `http://b4ibm21.iiht.tech:8021`;
    fetch(url+`/findbyid/${id}`,{
      method: "GET",
      headers: {
        "Content-Type":"application/json"
      }
    }).then(res=>res.json())
       .then(data=>{
        
        this.task=data;
        fetch(_baseUrl+`/user/getalluser`,{
          method:"GET",
          headers:{
            "Content-Type": "application/json"
          }
        }).then(res=>res.json())
        .then(res=>{
          this.users=res;})
         this.form();
         
       })
   
  }
  init()
  {
    this.uNames = [];
    console.log(this.users);
    for (let i = 0; i < this.users.length; i++) {

      let uDetails = {email : this.users[i].email, name : this.users[i].username}
      this.uNames[i] =(uDetails);
      this.proid =[]
      for(let j=0;j<this.tasks.length;j++)
      {
        let u={projectid:this.tasks[j].projectId}
        this.proid[j]=(u);
      }
    }
  }
update(){
  const url = `http://b4ibm21.iiht.tech:8021`;

    let newtask = [];
    newtask.push({
      taskName:this.task.taskName,
      taskLeader:this.task.taskLeader,
      startDate:this.task.startDate,
      endDate:this.task.endDate,
      status:this.task.status
  })
  console.log(newtask);

  
  fetch(url + "/updatetask", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(newtask)
  })
    .then(res => res.json())
    .then(res => {
      console.log(res);
    });
    document.getElementById("updateclose").click();
    document.location.reload();
}

  delete(id){
    const url = `http://b4ibm21.iiht.tech:8021`;
    fetch(url+`/delete/${id}`,{
      method: "GET",
      headers: {
        "Content-Type": "application/json"
      }
    }).then(res=>res.json)
    .then(res=>{
         if(res){
           alert("task is removed");
         }
        this.router.navigate(['taskService/view'])
    })
  }
  form(){
    document.getElementById("toggle").click();
  
  }

}
interface userName{
  email : String
  name : String
}
interface proid{
  projectid:number
}
interface Taskraedonlyproject
{
    taskName:string,
    taskLeader:string,
    startDate:string,
    endDate:string,
    status:string,
}
