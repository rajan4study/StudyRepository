package com.study.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.rest.model.Study;
import com.study.rest.repo.StudyRepo;

@RestController
public class StudyController {
//	@RequestMapping("getStudy")
//	public List<Study>getStudy(){
//		Study s=new Study();
//		s.setId(0);
//		s.setName("test");
//		s.setPass("pass");
//		List<Study> list=new ArrayList<>();
//		list.add(s);
//		return list;
//	}
	
//tet commit in git
	
@Autowired
StudyRepo repo;

@GetMapping("/getAll")
List<Study>getAll(){
	return (List<Study>) repo.findAll();
}

@PostMapping(path = "/addStudy", consumes = "application/json", produces = "application/json")
public void addStudy(@RequestBody Study study) {
   // repo.addStudy(study.getName(), study.getPass());
    repo.save(study);
    System.out.println("added sucesfully");
}


}
