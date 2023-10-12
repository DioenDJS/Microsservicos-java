package com.dioend.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dioend.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
