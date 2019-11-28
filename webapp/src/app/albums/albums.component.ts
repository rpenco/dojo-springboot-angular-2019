import { Component, OnInit } from '@angular/core';
import { Album } from '../entity/album';
import { toTypeScript } from '@angular/compiler';
import { AlbumsService } from './albums.service';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html',
  styleUrls: ['./albums.component.scss']
})
export class AlbumsComponent implements OnInit {

  constructor(private albumsService: AlbumsService) { }

  albums: Album[];

  ngOnInit() {
    this.albumsService.loadAlbums().subscribe(albums => this.albums = albums);
  }

}
