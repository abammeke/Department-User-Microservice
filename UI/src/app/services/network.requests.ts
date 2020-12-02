import {HttpClient, HttpHeaders} from "@angular/common/http";
import {catchError, map} from "rxjs/operators";
import {throwError} from "rxjs";
import {Injectable} from "@angular/core";


@Injectable({
  providedIn: 'root'
})
export class NetworkServices{

  constructor(private http: HttpClient) {
  }
  url='http://localhost:9003/users/';

  createUser(user){
    console.log("Enter data: " + user);

    return this.http.post(this.url, JSON.stringify(user.value), {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'secure': 'false',
        'logLevel': 'debug',
        'changeOrigin': 'false'
      })})
      .pipe((map(data => data)),
        catchError( error => {
          console.log('Error occur');
          return throwError(error)
        })
      )
  }

}
