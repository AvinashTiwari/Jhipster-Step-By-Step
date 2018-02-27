package com.avinash.learn.service;

import org.springframework.stereotype.Service;

import com.avinash.learn.domain.Task;
import com.avinash.learn.repository.TaskRepository;

@Service
public class TaskImplementation implements TaskService {

	private TaskRepository taskRepository;
	
	public TaskImplementation(TaskRepository taskRepository)
	{
		this.taskRepository = taskRepository;
	}
	
	@Override
	public Iterable<Task> list() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}
}
