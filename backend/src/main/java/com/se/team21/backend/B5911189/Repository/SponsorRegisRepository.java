package com.se.team21.backend.B5911189.Repository;

import com.se.team21.backend.B5911189.Entity.SponsorRegis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:8080")
public interface  SponsorRegisRepository extends JpaRepository<SponsorRegis, Long> {
    SponsorRegis findByidSponsorRegis (Long idSponsorRegis);

}