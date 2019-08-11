import { Component, OnInit } from '@angular/core';
import { ProjectserviceService } from '../projectservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {

  constructor(private projectobj: ProjectserviceService , private route: Router) { }
  projects:Projects[]
  ngOnInit() {
    this.projects = this.projectobj.getproject();
    }
    delete(_id){
      this.projectobj.delete(_id);
      this.projects = this.projectobj.getproject();
    }
    edit(data){
      this.route.navigate(['/project/modify'],{queryParams : {projs : JSON.stringify(data)}})
    }
}

interface Projects {
  Pid:number
  Pname:string
}
