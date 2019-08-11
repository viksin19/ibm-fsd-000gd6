import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './users/users.component';
import { HomeComponent } from './home/home.component';
import { EditComponent } from './edit/edit.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { QueryparamsComponent } from './queryparams/queryparams.component';
import { AddComponent } from './project/add/add.component';
import { DeleteComponent } from './project/delete/delete.component';
import { ModifyComponent } from './project/modify/modify.component';
import { ShowComponent } from './project/show/show.component';



const routes: Routes = [{
  path: 'users',
  component: UsersComponent
},
{
  path: 'home',
  component: HomeComponent
},
{
  path: 'edit',
  component: EditComponent
},{
  path: 'aboutus/:id',
  component: AboutusComponent
},
{
  path: 'query',
  component: QueryparamsComponent
},
{
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
      path: 'show',
      component: ShowComponent
    },
    {
      path: '',
      component: ShowComponent
    }
  ]
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
