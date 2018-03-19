package com.test;

import javax.print.attribute.standard.Media;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pravin")
public class MyService {

	
	@RequestMapping("/show")
	public String show(@RequestParam String name) {
		return name;
	}
	
	@RequestMapping(value="/post" , method=RequestMethod.POST)
	public String postRequest() {
		return "TEST";
	}
	

	@RequestMapping(value="/student" , method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE , produces=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Student> student(@RequestBody Student student) {
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	
}
