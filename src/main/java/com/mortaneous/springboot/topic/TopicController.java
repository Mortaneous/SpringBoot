package com.mortaneous.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("java", "Java", "All about Java"),
				new Topic("cpp", "C++", "Everything C++"),
				new Topic("html", "HTML", "HTML pages")
		);
	}
}
