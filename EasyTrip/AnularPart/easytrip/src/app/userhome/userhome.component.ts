import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrls: ['./userhome.component.css']
})
export class UserhomeComponent implements OnInit {
 user={
  name: 'vikram',
  email: 'vikram@gmail.com',
  age: '23'
}
  constructor() { }

  ngOnInit() {
        window.localStorage.setItem('email',JSON.stringify(this.user));
  }

}
