package org.ssu.sslab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.ssu.sslab.controller.DogController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MySpringBootApplicationTests {
	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
	}

	@Test
	public void getDogs() throws Exception {
		mvc.perform(get("/dogs")).andExpect(status().isOk());
	}
}
