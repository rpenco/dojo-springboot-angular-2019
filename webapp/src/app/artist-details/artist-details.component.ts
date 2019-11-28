import { Component } from '@angular/core';
import { Artist } from '../entity/artist';
import { ActivatedRoute } from '@angular/router';
import { ArtistsService } from '../artists/artists.service';
import { map, switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-artist-details',
  templateUrl: './artist-details.component.html',
  styleUrls: ['./artist-details.component.scss']
})
export class ArtistDetailsComponent {

  artist: Artist;

  constructor(route: ActivatedRoute, private artistService: ArtistsService) {

    route.paramMap.pipe(
      switchMap (params => {
        return this.artistService.getArtist(params.get('id'));
      })
    ).subscribe(artist => this.artist = artist);
  }

}
