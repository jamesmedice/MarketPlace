package com.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.marketplace.model.AnnouncementType;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "announcementTypes", path = "announcementTypes")
public interface AnnouncementTypeRepository extends JpaRepository<AnnouncementType, Long> {

}
