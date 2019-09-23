import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-task-service',
  templateUrl: './task-service.component.html',
  styleUrls: ['./task-service.component.css']
})
export class TaskServiceComponent implements OnInit {
  newTaskForm: FormGroup
  constructor() {
    this.newTaskForm = new FormGroup({
      taskName: new FormControl(""),
      taskLeader: new FormControl(""),
      startDate: new FormControl(""),
      endDate: new FormControl(""),
      status: new FormControl("")
    })
  }

  ngOnInit() {
  }

  submit() {
    let taskName = this.newTaskForm.value.taskName;
    let taskLeader = this.newTaskForm.value.taskLeader;
    let startDate = this.newTaskForm.value.startDate;
    let endDate = this.newTaskForm.value.endDate;
    let status = this.newTaskForm.value.status;

    let taskDetails = [
      {taskName : taskName},
      {taskLeader: taskLeader},
      {startDate: startDate},
      {endDate: endDate},
      {status: status}
      ];
    const _baseUrl = `http://b4ibm21.iiht.tech:8021`;

    fetch(_baseUrl + "/tasks", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(taskDetails)
    })
      .then(res => res.json())
      .then(res => {
        console.log(res);
      });
  }
}
