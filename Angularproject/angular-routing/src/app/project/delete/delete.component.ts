import { Component, OnInit } from '@angular/core';
import { ProjectserviceService } from '../projectservice.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private projectobj: ProjectserviceService) { }

  ngOnInit() {
  }

}
