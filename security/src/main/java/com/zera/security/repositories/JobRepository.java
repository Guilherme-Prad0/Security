package com.zera.security.repositories;

import com.zera.security.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobModel, UUID> {
}
