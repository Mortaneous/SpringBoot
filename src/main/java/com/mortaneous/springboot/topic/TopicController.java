package com.mortaneous.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@PostMapping
	public String createTopic() {
		return "<under construction>";
	}

	@GetMapping("/{id}")
	public Topic getTopic(String id) {
		return new Topic("aTopic", "A Topic", "topic topic");
	}
	
	@PutMapping("/{id}")
	public String updateTopic(String id) {
		return "<under construction>";
	}
}
