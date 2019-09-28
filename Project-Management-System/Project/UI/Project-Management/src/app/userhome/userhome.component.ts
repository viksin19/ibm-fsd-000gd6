import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-userhome',
  templateUrl: './userhome.component.html',
  styleUrls: ['./userhome.component.css']
})
export class UserhomeComponent implements OnInit {

  email: String
  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.email = this.route.snapshot.queryParams.email;
    localStorage.setItem("email", JSON.stringify(this.email));
  }
}
