package com.icterguru.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icterguru.core.dao.IPaymentDAO;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	private IPaymentDAO dao;

	public IPaymentDAO getDao() {
		return dao;
	}

	public void setDao(IPaymentDAO dao) {
		this.dao = dao;
	}
	
}
