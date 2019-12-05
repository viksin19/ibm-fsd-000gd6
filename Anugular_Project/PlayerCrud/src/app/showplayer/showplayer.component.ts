import { Component, OnInit } from '@angular/core';
import { Player } from '../player/player.component';
import { PlayerserviceService } from '../service/playerservice.service';

@Component({
  selector: 'app-showplayer',
  templateUrl: './showplayer.component.html',
  styleUrls: ['./showplayer.component.css']
})
export class ShowplayerComponent implements OnInit {
players:Player[]
  constructor(private pservice:PlayerserviceService) { }

  ngOnInit() {
    this.getFunction();
  }
getFunction(){
this.pservice.getPlayer().subscribe(
                                     data=>{
                                              this.players=data;
                                            },
                                            error=>{
                                               console.log(error.status);
                                                    });
                                            }
}
