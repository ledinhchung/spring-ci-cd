package com.chungle.demo.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DemoApplication.class)
class DemoApplicationTests {

	@Autowired
	private MockMvc mocMvc;

	@Test
	void shouldReturnDefaultMessage() throws Exception{
		this.mocMvc.perform(get("/")).andExpect(content().string(containsString("Hello this is message from Demo 1 application")));
	}

	@Test
	void shouldReturnHelloMessage() throws Exception {
		this.mocMvc.perform(get("/test")).andExpect(content().string(containsString("Hello Chung 222")));
	}

}
