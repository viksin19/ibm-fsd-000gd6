package com.example.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.CreateTasksRequestModel;

@FeignClient(name = "TASKS")
public interface ProjectFeignClient {
	@PostMapping("/tasks")
	public ResponseEntity<?> createTask(CreateTasksRequestModel taskDetail);
}
