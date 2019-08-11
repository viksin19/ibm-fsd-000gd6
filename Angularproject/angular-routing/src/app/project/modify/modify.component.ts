import { Component, OnInit } from '@angular/core';
import { ProjectserviceService, Projects } from '../projectservice.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent implements OnInit {
 proj:Projects
  constructor(private projectobj: ProjectserviceService , private route:ActivatedRoute ,private routes:Router ) { }
   
  ngOnInit() {
    //console.log(JSON.parse(this.route.snapshot.queryParams.projs));
     this.proj = JSON.parse(this.route.snapshot.queryParams.projs)
     
  }
modifyProject(){
  // console.log(this.proj);
   this.projectobj.modify(this.proj);
   this.routes.navigate(['/project/show'])
    
                }

              }

