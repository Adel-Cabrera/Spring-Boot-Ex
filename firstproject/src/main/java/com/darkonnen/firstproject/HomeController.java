package com.darkonnen.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HomeController {

//	@RequestMapping("")
	@RequestMapping("/")
	public String index(@RequestParam(value = "q", required = false) String searchQuery) {
		if (searchQuery == null) {
			return "You searched nothing";
		} else {
//		return "Hewaaalao World";
			return String.format("You searched for: %s", searchQuery);
		}
	}
//	localhost:8080/?q=myQueryParam
	
//	Query Paramas vs Path Variables

    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
//    http://localhost:8080/m/123/456/7890


//	@RequestMapping("/world")
//	public String world() {
//		return "Class level anotations";
//	}

}
