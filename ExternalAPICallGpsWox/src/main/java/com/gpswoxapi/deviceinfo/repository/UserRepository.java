package com.gpswoxapi.deviceinfo.repository;

import com.gpswoxapi.deviceinfo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findUsersByEmail(String email);

}
