package com.carrx.springmvc.inaction.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.carrx.springmvc.inaction.controller.HomeController;

public class HomeControllerTest {

	@Test
	public void testHome() throws Exception {
		HomeController hc = new HomeController();
		MockMvc mm = MockMvcBuilders.standaloneSetup(hc).build();
		mm.perform(MockMvcRequestBuilders.get("/home/home")).andExpect(MockMvcResultMatchers.view().name("home"));
	}
}
