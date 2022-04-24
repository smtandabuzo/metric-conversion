package com.ayo.metric.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class MetricConversionControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
	void testConversion() throws Exception {
		this.mockMvc.perform(get("/api/convert/temperature/imperial/32"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(result -> assertEquals("89.6", result.getResponse().getContentAsString()));
	}

	@Test
	void testConversionInvalidSystem() throws Exception {
		this.mockMvc.perform(get("/api/convert/temperature/abc/32"))
				.andDo(print())
				.andExpect(status().isBadRequest())
				.andExpect(result -> assertEquals("Invalid Conversion System <abc>", result.getResponse().getErrorMessage()));
	}

    
}
