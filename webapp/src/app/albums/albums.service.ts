import { Injectable } from '@angular/core';
import { Album } from '../entity/album';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AlbumsService {

  public loadAlbums(): Observable<Album[]> {
    return this.http.get<Album[]>('/assets/album.json');
  }

  constructor(private http:HttpClient) { }
}
