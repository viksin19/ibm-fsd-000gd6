import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { ReactiveFormsModule,FormsModule } from "@angular/forms";
import { SidebarModule } from "ng-sidebar";
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ManagerhomeComponent } from './managerhome/managerhome.component';
import { ProjectserviceComponent } from './projectservice/projectservice.component';
import { AddProjectComponent } from './projectservice/add-project/add-project.component';
import { ViewProjectComponent } from './projectservice/view-project/view-project.component';
import { TaskServiceComponent } from './task-service/task-service.component';
import { TeamServiceComponent } from './team-service/team-service.component';
import { AddTaskComponent } from './task-service/add-task/add-task.component';
import { ViewTaskComponent } from './task-service/view-task/view-task.component';
import { AddTeamComponent } from './team-service/add-team/add-team.component';
import { ViewTeamComponent } from './team-service/view-team/view-team.component';
import { UserServiceComponent } from './user-service/user-service.component';
import { AddComponent } from './user-service/add/add.component';
import { ViewComponent } from './user-service/view/view.component';
import { UpdateprofileComponent } from './updateprofile/updateprofile.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    SignupComponent,
    AdminhomeComponent,
    UserhomeComponent,
    ManagerhomeComponent,
    ProjectserviceComponent,
    AddProjectComponent,
    ViewProjectComponent,
    TaskServiceComponent,
    TeamServiceComponent,
    AddTaskComponent,
    ViewTaskComponent,
    AddTeamComponent,
    ViewTeamComponent,
    UserServiceComponent,
    AddComponent,
    ViewComponent,
    UpdateprofileComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    SidebarModule
 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
