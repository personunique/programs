package com.cg.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.customer.model.Customer;
import com.cg.customer.service.ICustomerService;

@Controller
public class customerController {

	@Autowired
	ICustomerService service;
	
	
	
	@RequestMapping("/start")
	public String goToStart(){
		return "customerRegForm";
	}
	
	@RequestMapping("/reg")
	public ModelAndView registration(Customer cust){
		service.addDetails(cust);
		return new ModelAndView("customerSuccess", "k", cust);
	}
	
	
	
	
	@RequestMapping("/goFind")
	public String goToFind(){
		return "custIdFind";
	}
	
	@RequestMapping("/find")
	public ModelAndView findById(@RequestParam("custId") int custId){
		
		Customer cust = service.retrieveById(custId);
		return new ModelAndView("customerSuccess", "k", cust);
	}
	
	
	@RequestMapping("/goFindAll")
	public ModelAndView findAll(){
		
		List<Customer> custList = service.retrieveDetails();
		return new ModelAndView("customerListSuccess", "list", custList);
	}
	
	
	
	
	/*@RequestMapping("/goDelete")
	public String goToDelete(){
		return "custIdDelete";
	}
	
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("custId") int custId){
		Customer cust = service.retrieveById(custId);
		service.deleteDetails(cust);
		return "deleteCust";
	}*/
	
}
	
	
