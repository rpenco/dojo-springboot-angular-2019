import { Component, OnInit } from '@angular/core';
import { Artist } from '../entity/artist';
import { toTypeScript } from '@angular/compiler';
import { ArtistsService } from './artists.service';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.scss']
})
export class ArtistsComponent implements OnInit {

  constructor(private artistsService: ArtistsService) { }

  artists: Artist[];

  ngOnInit() {
    this.artistsService.loadArtists().subscribe(artists => this.artists = artists);
  }

}
