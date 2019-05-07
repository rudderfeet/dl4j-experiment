package us.mccrory.dl4jexperiment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Application context loader unit test.
 * 
 * @author Scott McCrory
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DL4JExperimentApplicationTest {

	/**
	 * Tests the creation of a Spring context.
	 *
	 * @throws Exception Upon failure
	 */
	@Test
	public void contextLoads() throws Exception {

		// The instantiation of this test will load the Spring context,
		// so thenafter we test autowiring by confirming that these DAO
		// and Controller objects were created and injected into this test.
//		assertThat(jenkinsDao).isNotNull();

	}

}
