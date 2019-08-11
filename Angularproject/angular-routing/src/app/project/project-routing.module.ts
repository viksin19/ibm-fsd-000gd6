import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { ModifyComponent } from './modify/modify.component';


const routes: Routes = [{
            path: 'project',
            children: [
               {
                 path: 'add',
                 component: AddComponent
               },
               {
                path: 'delete',
                component: DeleteComponent
              },
              {
                path: 'modify',
                component: ModifyComponent
              },
              {
                path: '',
                component: AddComponent
              }
            ]
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProjectRoutingModule { }
