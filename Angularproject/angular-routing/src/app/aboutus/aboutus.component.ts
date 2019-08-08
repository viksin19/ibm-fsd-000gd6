import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {

  constructor(private router: Router ,private route: ActivatedRoute) { }
  userid:number

  ngOnInit() {

    this.userid = this.route.snapshot.params.id;
  }

  Prev(){
    this.router.navigate(['edit'])
  }

}
