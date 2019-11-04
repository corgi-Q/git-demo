package corgi.demo.service;

import java.util.List;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corgi.demo.repository.ToDoRepository;
import corgi.demo.model.ToDo;

@Service("toDoService")
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;

	public List<ToDo> getAllToDo() {
		return toDoRepository.findAll();
	}

	public ToDo getToDoById(long id) {
		return toDoRepository.findById(id).orElse(null);
	}

	public ToDo saveToDo(ToDo todo) {
		return toDoRepository.save(todo);
	}

	public void removeToDo(ToDo todo) {
		toDoRepository.delete(todo);
	}
	
}
