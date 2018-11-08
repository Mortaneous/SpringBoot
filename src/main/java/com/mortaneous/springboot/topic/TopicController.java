package com.mortaneous.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {

	@GetMapping
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("java", "Java", "All about Java"),
				new Topic("cpp", "C++", "Everything C++"),
				new Topic("html", "HTML", "HTML pages")
		);
	}
	
	@GetMapping("/id")
	public Topic getTopic() {
		return new Topic("aTopic", "A Topic", "topic topic");
	}
}
