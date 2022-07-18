package com.example.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Objectservice {

	public List<Object> topic = Arrays.asList(
				new Object("a","b","c"),new Object("d","e","f"),new Object("g","h","i")
				);
	
	public List<Object> getAllTopics(){
		return topic;
	}
	public Object getOne(String Id){
		return topic.stream().filter(t->t.getId().equals(Id)).findFirst().get();
	}
	public void addTopic(Object topic2) {
		topic.add(topic2);
		
	}
	public void UpdateTopic(String id,Object topic2) {
		for(int i=0;i<topic.size();i+=1) {
			Object t = topic.get(i);
			System.out.print(t.getId());
			if(t.getId().equals(id)) {
				topic.set(i,topic2);
				return;
			}
		}
		
	}
	
	
	public void deleteTopic(String id) {
	topic.removeIf(t->(t.getId().equals(id)));
		
	}
	
	}



