package com.avinash.learn;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.avinash.learn.domain.Task;
import com.avinash.learn.service.TaskService;

@SpringBootApplication
public class AvinashAngualrAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvinashAngualrAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskservice) {
		return args -> {
			taskservice.save(new Task(1L, "Created By SprinBoot Applciation", LocalDate.now(), true));

			taskservice.save(
					new Task(2L, "Created By SprinBoot Applciation", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
			taskservice.save(
					new Task(3L, "Created By SprinBoot Applciation", LocalDate.now().plus(2, ChronoUnit.DAYS), false));
			taskservice.save(
					new Task(4L, "Created By SprinBoot Applciation", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
			taskservice.save(
					new Task(5L, "Created By SprinBoot Applciation", LocalDate.now().plus(4, ChronoUnit.DAYS), false));

			taskservice.save(
					new Task(6L, "Created By SprinBoot Applciation", LocalDate.now().plus(5, ChronoUnit.DAYS), false));

			taskservice.save(
					new Task(7L, "Created By SprinBoot Applciation", LocalDate.now().plus(6, ChronoUnit.DAYS), false));

			taskservice.save(
					new Task(8L, "Created By SprinBoot Applciation", LocalDate.now().plus(7, ChronoUnit.DAYS), false));
		};
	}
}
