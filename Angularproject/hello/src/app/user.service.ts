import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user:Emp[]=[]

  constructor() { }

  
  adduser(){
    return {
      id:5,
      name:'Arun Kumar',
      age:22,
      status:0
    }
  }

getuser(){
  return this.user = [
    {
      id:1,
      name:'Priyanshu',
      age:22,
      status:1
    },
    {
      id:2,
      name:'Vivek',
      age:23,
      status:1
    },
    {
      id:3,
      name:'Deepak',
      age:22,
      status:0
    },
    {
      id:4,
      name:'Vikram',
      age:23,
      status:1
    }
  ]
}

getlength(){
  return this.user.length ;
}

}

interface Emp {
  id:number,
  name:string,
  age:number,
  status:number
}