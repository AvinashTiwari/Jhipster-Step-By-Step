package com.avinash.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.learn.domain.Task;
import com.avinash.learn.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController  {

	private TaskService taskService;
	public TaskController(TaskService taskService)
	{
		this.taskService = taskService;
	}
	
	@GetMapping(value = {"", "/"})
	public Iterable<Task> listTask()
	{
		return taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task)
	{
		System.out.println("called to ave");
	   return 	taskService.save(task);
	}
}
