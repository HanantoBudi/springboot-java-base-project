package bootsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootsample.dao.TaskRepository;
import bootsample.model.Task;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;
	
	public List<Task> findAll() {
		List<Task> tasks = (List<Task>) taskRepo.findAll(); 
		return tasks;
	}
	
	public Task findOne(int i) {
		return taskRepo.findOne(i);
	}
	
	public void save(Task task) {
		taskRepo.save(task);
	}
	
	public void delete(int id) {
		taskRepo.delete(id);
	}

	public Task findTask(int id){
		return taskRepo.findOne(id);
	}
}