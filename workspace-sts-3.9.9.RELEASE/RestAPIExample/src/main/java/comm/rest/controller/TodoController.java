package comm.rest.controller;

import java.util.ArrayList;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.rest.Domain.Todo;

@RestController
@RequestMapping("/api")
public class TodoController {
	
	private List<Todo> list = null;
	
	@PostConstruct
	public void createlist() {
		list = new ArrayList<Todo>();
	}
	
	@GetMapping("/todo")
	public List<Todo> getall(){
		 
		list.add(new Todo("Practice fad", new Date()));
		list.add(new Todo("Practice fad", new Date()));
		
		return list;
	}

}
