package com.tns.collegeservice;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Collegeservice1 
{
	@Autowired
	private collegeservicerepository repo;
	
	public List<collegeservice> listAll()
	{
		return repo.findAll();
	}
	
	public void save(collegeservice comp)
	{
		repo.save(comp);
	}
	
	public collegeservice get(Integer company_id)
	{
		return repo.findById(company_id).get();
	}
	public void delete(Integer company_id)
	{
		repo.deleteById(company_id);
	}
	
}

