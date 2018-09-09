package com.carrx.springmvc.inaction.test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import com.carrx.springmvc.inaction.bean.po.SpittlePO;
import com.carrx.springmvc.inaction.controller.SpittleController;
import com.carrx.springmvc.inaction.service.SpittleService;

public class SpittleControllerTest {

	@Mock
	private SpittleService hs;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSpittle() throws Exception {

		List<SpittlePO> expectedSpittles = createSpittleList(20);
		when(hs.listSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);

		SpittleController hc = new SpittleController(hs);
		MockMvc mm = MockMvcBuilders.standaloneSetup(hc)
				.setSingleView(new InternalResourceView("/springmvc/jsp/spittles.jsp")).build();
		mm.perform(MockMvcRequestBuilders.get("/spittle/spittles"))
				.andExpect(MockMvcResultMatchers.view().name("spittles"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
				.andExpect(MockMvcResultMatchers.model().attribute("spittleList", hasItem(expectedSpittles.toArray())));
	}

	private List<SpittlePO> createSpittleList(int i) {
		List<SpittlePO> list = new ArrayList<>(i);
		for (i = 0; i < 20; i++) {
			list.add(new SpittlePO("Spittle" + i, new Date()));
		}
		return list;
	}
}
