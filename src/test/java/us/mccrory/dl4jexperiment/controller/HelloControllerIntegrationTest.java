package us.mccrory.dl4jexperiment.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Hello/Welcome controller test case.
 *
 * @author Scott McCrory
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerIntegrationTest {

	/**
	 * MockMvc allows us to mock MVC GETs, PUTs, POSTs, etc. for testing.
	 */
	@Autowired
	MockMvc mockMvc;

	/**
	 * Test fetching the list of Jenkins Jobs.
	 *
	 * @throws Exception if error occurs while testing.
	 */
	@Test
	public void testIndexPage() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

}
