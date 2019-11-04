package corgi.demo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import corgi.demo.model.ToDo;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PayloadValidatorTest {

	@Test
	public void validateCreatePayloadTest0() {
		new PayloadValidator();
	}
	
	@Test
	public void validateCreatePayloadTest1() {
		boolean rslt = PayloadValidator.validateCreatePayload(null);
		assertEquals(rslt, false);
	}

	@Test
	public void validateCreatePayloadTest2() {
		boolean rslt = PayloadValidator.validateCreatePayload(new ToDo());
		assertEquals(rslt, true);
	}
	
	@Test
	public void validateCreatePayloadTest3() {
		ToDo todo = new ToDo();
		todo.setId(0);
		boolean rslt = PayloadValidator.validateCreatePayload(todo);
		assertEquals(rslt, true);
	}
	
	@Test
	public void validateCreatePayloadTest4() {
		ToDo todo = new ToDo();
		todo.setId(1);
		boolean rslt = PayloadValidator.validateCreatePayload(todo);
		assertEquals(rslt, false);
	}
	
	@Test
	public void validateCreatePayloadTest5() {
		ToDo todo = new ToDo();
		todo.setId(-1);
		boolean rslt = PayloadValidator.validateCreatePayload(todo);
		assertEquals(rslt, false);
	}
}
