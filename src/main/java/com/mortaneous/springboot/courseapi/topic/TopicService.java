package com.mortaneous.springboot.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("java", "Java", "All about Java"),
			new Topic("cpp", "C++", "Everything C++"), new Topic("html", "HTML", "HTML pages")));
	
	/* Create */
	public Topic addTopic(Topic topic) {
		topics.add(topic);
		
		return topic;
	}

	/* Read */
	public Topic getTopic(String id) {
		return topics.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst().get();
	}
	
	/* Read (All) */
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	/* Update */
	public Topic updateTopic(Topic topic) {
		return getTopic(topic.getId())
				.setTitle(topic.getTitle())
				.setDescription(topic.getDescription());
	}
	
	/* Delete */
	public Topic deleteTopic(String id) {
		Topic topic = getTopic(id);
		topics.removeIf(t -> t.getId().equals(id));
		return topic;
	}
	
}
