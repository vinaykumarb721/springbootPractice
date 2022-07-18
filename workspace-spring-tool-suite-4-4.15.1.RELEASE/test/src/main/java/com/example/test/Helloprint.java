package com.example.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloprint {
	
	@Autowired
	private Objectservice objser;
	@RequestMapping("/print")
	public String sayHi() {
		return "print";
	}
	@RequestMapping("/topic")
	public List<Object> getAll(){
		return objser.getAllTopics();
	
	}
	
	@RequestMapping("/topic/{id}")
	public Object getTopic(@PathVariable String id) {
		return objser.getOne(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topic")
	public void addTopics(@RequestBody Object topic) {
		objser.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
	public void updateTopic(@RequestBody Object topic, @PathVariable String id) {
		objser.UpdateTopic(id,topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
	public void deleteTopics(@PathVariable String id) {
		objser.deleteTopic(id);
	}
}
