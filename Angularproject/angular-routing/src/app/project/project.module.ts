import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { ModifyComponent } from './modify/modify.component';
//import { ProjectRoutingModule } from './project-routing.module';



@NgModule({
  declarations: [AddComponent , DeleteComponent , ModifyComponent ],
  imports: [
    CommonModule
    //,ProjectRoutingModule
  ]
})
export class ProjectModule { }
