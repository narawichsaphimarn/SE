package com.se.team21.backend.B5926329.Repository;

import com.se.team21.backend.B5926329.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface MemberRepository extends JpaRepository<Member, Long>{
    Member findByUsernameAndPassword(String username,String password);
}
