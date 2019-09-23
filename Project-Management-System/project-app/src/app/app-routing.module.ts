import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TaskServiceComponent } from './task-service/task-service.component';


const routes: Routes = [
  {
    path : "register",
    component : TaskServiceComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
