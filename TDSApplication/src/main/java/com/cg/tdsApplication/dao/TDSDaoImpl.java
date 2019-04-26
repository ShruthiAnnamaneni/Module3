package com.cg.tdsApplication.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.tdsApplication.dto.TDSDetails;

@Component("tdsDao")
@Repository
@ComponentScan("com.cg.tdsApplication")
public class TDSDaoImpl implements TDSDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public TDSDetails getTDSDetailsById(int id) {
		// TODO Auto-generated method stub
		TDSDetails tdsDetails=entityManager.find(TDSDetails.class, id);
		return tdsDetails;
	}
	
}
