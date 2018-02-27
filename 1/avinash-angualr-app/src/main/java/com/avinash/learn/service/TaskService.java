package com.avinash.learn.service;

import com.avinash.learn.domain.Task;

public interface TaskService {
	Iterable<Task> list();
    
	Task save(Task task);
}
