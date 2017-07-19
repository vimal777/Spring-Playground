package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class ControllerTest {
@Autowired
private MockMvc mvc;

@Test
public void testHomePage() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/app/hello");
	final ResultActions hello = this.mvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().string("Hello"));
}
@Test
public void testMathPi() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/app/tasks");
	this.mvc.perform(request)
		.andExpect(status().isOk())
		.andExpect(content().string("11.00"));
}
@Test
public void testQueryStringData() throws Exception
	{
		this.mvc.perform(get("/app/vehicles?year=1987&doors=2"))
		.andExpect(status().isOk());
	}
@Test
public void testQueryStringData1() throws Exception
	{
		this.mvc.perform(get("/app/vehicles?year=1987&doors=2"))
				.andExpect(status().isOk());
	}
}