package com.cg.tdsApplication.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.tdsApplication.dao.TDSDao;
import com.cg.tdsApplication.dto.TDSDetails;

@Component("tdsService")
@Service
@Transactional
public class TDSServiceImpl implements TDSService{
	@Autowired
	TDSDao tdsDao;
	@Override
	public TDSDetails getTDSDetailsById(int id) {
		// TODO Auto-generated method stub
		return tdsDao.getTDSDetailsById(id);
	}

}
