package com.thalesgroup.coding.framework.s02.repositories;


import com.thalesgroup.coding.framework.s02.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlbumRepository extends JpaRepository<Album, UUID> {

}
