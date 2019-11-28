package com.thalesgroup.coding.framework.s02.config;

import com.thalesgroup.coding.framework.s02.dto.AlbumDto;
import com.thalesgroup.coding.framework.s02.entities.Album;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrikaConfig {

    @Bean
    public MapperFactory mapperFactory() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(AlbumDto.class, Album.class)
                .byDefault()
                .register();

        return mapperFactory;
    }
}
