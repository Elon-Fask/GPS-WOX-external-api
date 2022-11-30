package com.testgpswox.dev.repo;

import com.testgpswox.dev.entity.DeviceData;
import com.testgpswox.dev.entity.Root;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repo extends JpaRepository<Root, Integer> {


}
