import { Injectable} from '@angular/core';
import { Player } from '../player/player.component';
import { throwError , Observable } from 'rxjs';
import { HttpClient, HttpErrorResponse} from '@angular/common/http';
import { catchError } from 'rxjs/operators'


@Injectable({
  providedIn: 'root'
})
export class PlayerserviceService {

  constructor(private http:HttpClient) { }
  url:string='http://localhost:8002/player/add';
  showurl:string='http://localhost:8002/player/show'
  addPlayer(player:Player):Observable<any>{

    return this.http.post<any>(this.url,player).pipe(catchError(this.handleError));
  }

  getPlayer():Observable<Player[]>{
    return this.http.get<Player[]>(this.showurl).pipe(catchError(this.handleError));
  }
handleError(error:HttpErrorResponse){
  return throwError(error || " Error Meassage");
}
}
