import { Component, OnInit } from '@angular/core';
import { ProjectserviceService } from "../projectservice.service";

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
 
  constructor(private projectobj: ProjectserviceService) { }
  proj:Proj
  rproj:Proj
  ngOnInit() {
      
  }

  addProject(_data){
    // console.log(_data);
    this.projectobj.add(_data);
      this.rproj = _data;
  }
}
interface Proj {
  Pid:number
  Pname:string
  }