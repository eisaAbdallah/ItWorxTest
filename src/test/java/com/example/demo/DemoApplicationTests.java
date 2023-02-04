package com.example.demo;

import com.example.demo.model.IntentMessage;
import com.example.demo.repository.IntentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
	@Autowired
	private MockMvc mvc;

	@Test
	void intentsTest() throws Exception {

		createIntent();

		this.mvc.perform(MockMvcRequestBuilders.get("/user/message")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) content()
						.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect((ResultMatcher) jsonPath("$[0].name", is("bob")));
	}
	public IntentMessage createIntent(){

		IntentMessage intentMessage=new IntentMessage();
		intentMessage.setIntentId(1);
		intentMessage.setMessageId(1);
		intentMessage.setIntetntMessageId(1);
		intentMessage.setConfidence((float) 0.18);
		return intentMessage;
	}
}
