package bootsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello Cold World";
	}
	
	/*@GetMapping("/all")
	public String allTasks() {
		return taskService.findAll().toString();
	}
	
	@GetMapping("/save")
	public String saveTask(@RequestParam String name, @RequestParam String desc) {
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return "Task Saved!";
	}
	
	@GetMapping("/delete")
	public String deleteTask(@RequestParam int id) {
		taskService.delete(id);
		return "Task Deleted!";
	}*/
	
}