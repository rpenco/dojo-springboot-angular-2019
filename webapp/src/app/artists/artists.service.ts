import { Injectable } from '@angular/core';
import { Artist } from '../entity/artist';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ArtistsService {

  public loadArtists(): Observable<Artist[]> {
    return this.http.get<Artist[]>('/assets/artists.json');
  }

  public getArtist(id: string): Observable<Artist> {
    return this.http.get<Artist>(`/assets/artist-detail-${id}.json`);
  }

  constructor(private http:HttpClient) { }
}
