package com.zera.security.repositories;

import com.zera.security.models.SecurityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<SecurityModel, Long> {
}
