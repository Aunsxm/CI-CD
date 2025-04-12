package edu.fisa.ce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
	
	@Autowired
	private PeopleRepository dao;
	
	@GetMapping("one")
	public List<People> getAll(){
		return dao.findByPeopleNameAndAge("연아", 10);
	}
	
	@PostMapping("save")
	public String savePeople() {
		dao.save(new People("연아",10));
		dao.save(new People("연아",10));
		dao.save(new People("연아",10));
		dao.save(new People("연아",30));
		dao.save(new People("연아",20));
		dao.save(new People("연아",10));
		dao.save(new People("연아2",10));
		return "저장성공";
	}
	
	
	@GetMapping("fisa")
	public String getPeople() {
		System.out.println(dao.findById(1l));
		return "성공";
	}
}
