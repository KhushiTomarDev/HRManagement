package com.cg.hrdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.cg.hrdatabase.entity.Jobs;

@RepositoryRestResource(
        path = "jobs",                 // URL → /jobs
        collectionResourceRel = "jobs" // JSON name
)
public interface JobRepository extends JpaRepository<Jobs, String> {

}