package com.gpswoxapi.external.repository;

import com.gpswoxapi.external.model.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
