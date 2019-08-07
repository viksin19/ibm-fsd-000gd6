import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hello';
  _msg = "Yes";

  empdetails:any

  getdetails($event){
    this.empdetails = $event;
  }
}
