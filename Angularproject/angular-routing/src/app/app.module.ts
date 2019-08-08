import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { UsersComponent } from './users/users.component';
import { EditComponent } from './edit/edit.component';
import { QueryparamsComponent } from './queryparams/queryparams.component';
import { ProjectModule } from './project/project.module';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutusComponent,
    UsersComponent,
    EditComponent,
    QueryparamsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ProjectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
