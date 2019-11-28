package com.thalesgroup.coding.framework.s02.services;

import com.thalesgroup.coding.framework.s02.dto.AlbumDto;
import com.thalesgroup.coding.framework.s02.entities.Album;
import com.thalesgroup.coding.framework.s02.repositories.AlbumRepository;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private MapperFactory mapperFactory;

    public AlbumDto getAlbum(UUID id, MapperFactory mapperFactory) {
        Album album = this.albumRepository.getOne(id);
        return mapperFactory.getMapperFacade().map(album, AlbumDto.class);
    }

}
