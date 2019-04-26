package com.cg.tdsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tdsApplication.dto.TDSDetails;
import com.cg.tdsApplication.service.TDSService;
import com.cg.tdsApplication.userInterfaceExceptions.EmployeeIdNotFoundException;

@RestController
public class TDSController {
	
	@Autowired
	TDSService tdsService;
	
	@GetMapping("/getDetailsById/{id}")
	public TDSDetails getTDSDetailsById(@PathVariable int id) {
		TDSDetails tdsDetails=tdsService.getTDSDetailsById(id);
		if(tdsDetails==null) {
			throw new EmployeeIdNotFoundException("ID Not Found wrong ID: "+id);
		}
		else
			return tdsDetails;
	}

	

}
