import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { ModifyComponent } from './modify/modify.component';
import { FormsModule } from '@angular/forms';
import { ShowComponent } from './show/show.component';


//import { ProjectRoutingModule } from './project-routing.module';




@NgModule({
  declarations: [AddComponent , DeleteComponent , ModifyComponent, ShowComponent],
  imports: [
    CommonModule,
    FormsModule
    //,ProjectRoutingModule
  ]
})
export class ProjectModule { }
