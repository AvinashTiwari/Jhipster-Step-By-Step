package com.avinash.learn.repository;

import org.springframework.data.repository.CrudRepository;

import com.avinash.learn.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long >{

}
