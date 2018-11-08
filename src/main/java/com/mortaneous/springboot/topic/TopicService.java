package com.mortaneous.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("java", "Java", "All about Java"),
			new Topic("cpp", "C++", "Everything C++"),
			new Topic("html", "HTML", "HTML pages")
	);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
