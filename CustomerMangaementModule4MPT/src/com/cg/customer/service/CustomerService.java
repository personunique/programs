package com.cg.customer.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customer.dao.CustomerDaoImpl;
import com.cg.customer.model.CustomerBean;


@Service
public class CustomerService {

	
	@Autowired
	CustomerDaoImpl dao;
	
	public CustomerDaoImpl getDao() {
		return dao;
	}

	public void setDao(CustomerDaoImpl dao) {
		this.dao = dao;
	}

	public CustomerBean addCustomer(CustomerBean customer)
	{
		dao.addCustomer(customer);
		return customer;
	}
	
	public CustomerBean findCustomerById(int id) {
		//no need of transaction, as it's an read operation
		CustomerBean customer  = dao.getCustomerById(id);
		return customer;
	}
	
	public List<CustomerBean> getAll() {
		return dao.getAll();
	}
}
