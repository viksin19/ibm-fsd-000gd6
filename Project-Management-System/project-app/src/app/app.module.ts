import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TaskServiceComponent } from './task-service/task-service.component';
import { ReactiveFormsModule, FormsModule } from "@angular/forms";
import { TopMenuComponent } from './top-menu/top-menu.component';

@NgModule({
  declarations: [
    AppComponent,
    TaskServiceComponent,
    TopMenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
