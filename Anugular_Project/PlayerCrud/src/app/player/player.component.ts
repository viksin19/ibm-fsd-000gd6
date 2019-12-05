import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { PlayerserviceService } from '../service/playerservice.service';


@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {
  player:Player
form:FormGroup=new FormGroup({
  $key: new FormControl(null),
  name: new FormControl(""),
  matches: new FormControl(""),
  runs: new FormControl(""),
  wickets: new FormControl(""),
  highScore: new FormControl(""),

});
  constructor(private pservice:PlayerserviceService) { }

  ngOnInit() {
  }

  add(){
    console.log("Inside add !");
    
    let name=this.form.value.name;
    let matches=this.form.value.matches;
    let runs=this.form.value.runs;
    let wickets=this.form.value.wickets;
    let highScore=this.form.value.highScore;
    
    this.player={id:'',name:name,matches:matches,runs:runs,wickets:wickets,highScore:highScore};

    this.pservice.addPlayer(this.player)
    .subscribe(data=> {  let result:any 
                      
                          console.log(result); alert('Added Successfully !!!!');
                      },
                      error=>{
                        let msg= error.status;
                        console.log(msg);
                        
                      })

  }
}

export interface Player {
  id:string,
  name: string
  matches:string
  runs:string
  wickets:string
  highScore:string
}