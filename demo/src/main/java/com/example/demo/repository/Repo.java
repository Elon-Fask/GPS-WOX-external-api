package com.example.demo.repository;

import com.example.demo.entities.Item;
import com.example.demo.entities.Root;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Root, Integer> {



}
