import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ManagerhomeComponent } from './managerhome/managerhome.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { AddProjectComponent } from './projectservice/add-project/add-project.component';
import { ViewProjectComponent } from './projectservice/view-project/view-project.component';
import { AddTaskComponent } from './task-service/add-task/add-task.component';
import { ViewTaskComponent } from './task-service/view-task/view-task.component';
import { AddTeamComponent } from './team-service/add-team/add-team.component';
import { ViewTeamComponent } from './team-service/view-team/view-team.component';
import { AddComponent } from './user-service/add/add.component';
import { ViewComponent } from './user-service/view/view.component';
import { UpdateprofileComponent } from './updateprofile/updateprofile.component';



const routes: Routes = [
  {
    path: 'home',
    component:HomeComponent
  },
  {
    path: 'adminhome',
    component: AdminhomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'updateprofile',
    component: UpdateprofileComponent
  },
  {
    path: 'signup',
    component: SignupComponent
  },
  {
    path: 'userhome',
    component: UserhomeComponent
  },
  {
    path: 'managerhome',
    component: ManagerhomeComponent
  }, 
  {
    path: 'projectService',
    children: [
      {
        path: 'add',
        component: AddProjectComponent
      },
      {
        path: 'view',
        component: ViewProjectComponent
      }
    ]
  },
  {
    path: 'taskService',
    children: [
      {
        path: 'add',
        component: AddTaskComponent
      },
      {
        path: 'view',
        component: ViewTaskComponent
      }
    ]
  },
  {
    path: 'userService',
    children: [
      {
        path: 'add',
        component: AddComponent
      },
      {
        path: 'view',
        component: ViewComponent
      }
    ]
  },
  {
    path: 'teamService',
    children: [
      {
        path: 'add',
        component: AddTeamComponent
      },
      {
        path: 'view',
        component: ViewTeamComponent
      }
    ]
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
