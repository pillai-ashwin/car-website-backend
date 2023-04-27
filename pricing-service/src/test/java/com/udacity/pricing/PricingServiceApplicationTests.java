package com.udacity.pricing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetPrice() throws Exception {
		mvc.perform(get("/services/price").param("vehicleId", "1"))
				.andExpect(status().isOk())
		.andExpect(jsonPath("vehicleId").value("1"))
		.andExpect(jsonPath("currency").value("USD"));
	}

}
