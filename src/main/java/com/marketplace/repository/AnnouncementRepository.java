package com.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.marketplace.model.Announcement;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "announcements", path = "announcements")
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

}
