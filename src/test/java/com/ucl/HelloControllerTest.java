package com.ucl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/test/resources/spring-servlet.xml"})
public class HelloControllerTest  {
	
	
    @Autowired	
	private WebApplicationContext wac;
    @Autowired
    private HelloController controller;
	
    private MockMvc mockMvc;
    private int value1 =2;
    private int value2 =2;

	@Before
    public void setup() {
        // Setup Spring test in standalone mode		
		DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
        this.mockMvc = builder.build();        
    }
	
	@Test
	public void testDevOpsTeam() throws Exception {
		System.out.println("testing");
	   ResultMatcher ok = MockMvcResultMatchers.status().isOk();
	   ResultMatcher msg = MockMvcResultMatchers.model()
	                           .attribute("msg","Reece Ryan Joanne Maj");

	   MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/team");
	   this.mockMvc.perform(builder)
	                   .andExpect(ok)
	                   .andExpect(msg);
	}
	
    @Test
    public void contextLoads() throws Exception {
		 assertNotNull(controller);
    }

	
    @Test
    public void addValues(){
    	assertEquals(value1+value2,4);
    }


    @Test
    public void minusValues(){
    	 assertEquals(value1-value2,0);
    }
    
}
