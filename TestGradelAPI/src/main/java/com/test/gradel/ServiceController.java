package com.test.gradel;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestService")
public class ServiceController {

	@RequestMapping("/getStudentDetails")
	public String getStudentDetails() {
		return "Pravin";
	}
	
	@RequestMapping(value="/postStudentDetails",method=RequestMethod.POST)
	public String postStudentDetails() {
		return "Pravin";
	}
	
	@RequestMapping(value="/putStudentDetails",method=RequestMethod.POST)
	public StudentData putStudentDetails(@RequestBody StudentData studentData) {
		return studentData;
	}
}
