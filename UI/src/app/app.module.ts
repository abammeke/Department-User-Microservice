import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import {FormsModule} from "@angular/forms";
import {NetworkServices} from "./services/network.requests";
import {HttpClient, HttpClientJsonpModule, HttpClientModule, HttpHeaders} from "@angular/common/http";
import {Router, RouterModule} from "@angular/router";

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule,
    RouterModule.forRoot([])
  ],
  providers: [
    NetworkServices
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
