import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlayerComponent } from './player/player.component';
import { ShowplayerComponent } from './showplayer/showplayer.component';
import { HomeComponent } from './home/home.component';



const routes: Routes = [
  {
   path:'',
   component:HomeComponent
  },
{
  path : 'addplayer',
  component: PlayerComponent
},
{
  path: 'showplayer',
  component: ShowplayerComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
