package corgi.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class DemoApplicationTest {

	@Test
	public void testMain() {
		DemoApplication.main(new String[]{});
	}
}
