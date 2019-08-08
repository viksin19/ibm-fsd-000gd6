import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }
  Prev(){
    this.router.navigate(['users'])
  }
  Next(){
    this.router.navigate(['aboutus','20'])
  }
}
