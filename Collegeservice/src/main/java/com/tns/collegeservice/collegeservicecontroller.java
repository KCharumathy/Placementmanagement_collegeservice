package com.tns.collegeservice;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class collegeservicecontroller
{
	@Autowired(required=true)
	private Collegeservice1 service;
	
	@GetMapping("/collegeservice")
	public java.util.List<collegeservice> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/collegeservice/{company_id}")
	public ResponseEntity<collegeservice> get(@PathVariable Integer company_id)
	{
		try
		{
			collegeservice comp=service.get(company_id);
			return new ResponseEntity<collegeservice>(comp,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<collegeservice>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/collegeservice")
	public void add(@RequestBody collegeservice comp)
	{
		service.save(comp);
	}
	
	@PutMapping("/collegeservice/{company_id}")
	public ResponseEntity<?> update(@RequestBody collegeservice comp, @PathVariable Integer company_id)
	{
		collegeservice existcomp=service.get(company_id);
		service.save(existcomp);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/studentservice/{s_id}")
	public void delete(@PathVariable Integer company_id)
	{
		service.delete(company_id);
	}
}
