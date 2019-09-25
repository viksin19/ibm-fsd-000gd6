import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { ManagerhomeComponent } from './managerhome/managerhome.component';
import { ProjectDetailsComponent } from './project-details/project-details.component';
import { TaskDetailsComponent } from './task-details/task-details.component';
import { TeamDetailsComponent } from './team-details/team-details.component';
import { ProjectListComponent } from './project-list/project-list.component';
import { UserListComponent } from './user-list/user-list.component';
import { UpdateProfileComponent } from './update-profile/update-profile.component';



const routes: Routes = [

  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path:'signup',
    component: SignupComponent
  },
  {
    path:'userhome',
    component: UserhomeComponent
  },
  {
    path:'managerhome',
    component: ManagerhomeComponent
  },
  {
    path:'adminhome',
    component: AdminhomeComponent
  },
  {
    path:'projectdetails',
    component: ProjectDetailsComponent
  },
  {
    path:'taskdetails',
    component: TaskDetailsComponent
  },
  {
    path:'teamdetails',
    component: TeamDetailsComponent
  },
  {
    path:'projectlist',
    component: ProjectListComponent
  },
  {
    path:'userlist',
    component: UserListComponent
  },
  {
    path:'updateprofile',
    component: UpdateProfileComponent
  },
  {
    path: '',
    component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
