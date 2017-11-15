package com.cg.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.customer.model.CustomerBean;



@Repository
@Transactional
public class CustomerDaoImpl {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	public CustomerBean addCustomer(CustomerBean customer)
	{
		entityManager.persist(customer);
		return customer;
	}
	
	public CustomerBean getCustomerById(int custId) {
		CustomerBean customer = entityManager.find(CustomerBean.class, custId);
		return customer;
	}
	
	public List<CustomerBean> getAll() {
		Query query = entityManager.createNamedQuery("getAll");
		@SuppressWarnings("unchecked")
		List<CustomerBean> CustomerList = query.getResultList();
		return CustomerList;
	}
}
