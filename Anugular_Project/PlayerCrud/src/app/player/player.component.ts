import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'


@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {
form:FormGroup=new FormGroup({
  $key: new FormControl(null),
  name: new FormControl(""),
  matches: new FormControl(""),
  runs: new FormControl(""),
  wickets: new FormControl(""),
  highScore: new FormControl(""),

});
  constructor() { }

  ngOnInit() {
  }

  add(){
    console.log("Inside add !");
  }
}

