package com.nramiscal.learningPlatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}


	
    @RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
    public String show_assignment(@PathVariable("chapter") String discard, @PathVariable("assignmentNumber") String assignmentNumber) {
    		return "assignment";
	}

	@RequestMapping("/m/{chapter}/0553/{assignmentNumber}")
	public String show_lesson(@PathVariable("chapter") String discard, @PathVariable("assignmentNumber") String assignmentNumber) {
		return "lesson";
	}
	
	

}
