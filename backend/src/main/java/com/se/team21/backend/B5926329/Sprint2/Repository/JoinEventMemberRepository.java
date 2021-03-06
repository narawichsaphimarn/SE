package com.se.team21.backend.B5926329.Sprint2.Repository;

import com.se.team21.backend.B5926329.Sprint2.Entity.JoinEventMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface JoinEventMemberRepository extends JpaRepository<JoinEventMember, Long> {
    List<JoinEventMember> findByMembers_MemberId(Long mid);
}
