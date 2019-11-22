import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeMainComponent } from './employee-main/employee-main.component';


const routes: Routes = [
  {
    path: 'home',
    component:EmployeeMainComponent
  },
  {
    path: '',
    component:EmployeeMainComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
