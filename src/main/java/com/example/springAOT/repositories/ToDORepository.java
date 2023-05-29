package com.example.springAOT.repositories;

import com.example.springAOT.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDORepository extends JpaRepository<ToDo,Long> {
}
