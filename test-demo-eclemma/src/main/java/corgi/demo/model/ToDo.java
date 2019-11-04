package corgi.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ToDo {
	
	@Id
	@GeneratedValue
	private long id;
	private String text;
	private boolean completed;

	public ToDo() {
		super();
	}
	
	public ToDo(long id, String text, boolean completed) {
		super();
		this.id = id;
		this.text = text;
		this.completed = completed;
	}

	public ToDo(String text, boolean completed) {
		super();
		this.text = text;
		this.completed = completed;
	}
}
