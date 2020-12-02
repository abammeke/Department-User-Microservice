import { Component, OnInit } from '@angular/core';
import {NetworkServices} from "../services/network.requests";
import {Router} from "@angular/router";

@Component({
  selector: 'home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  constructor(private networkServices: NetworkServices, private rout: Router) { }

  ngOnInit(): void {
  }

  submit(f){
    console.log(f.value);
    return this.networkServices.createUser(f)
      .subscribe(response => {
        sessionStorage.setItem("createUserResponse", JSON.stringify(response));
      })
  }

}
