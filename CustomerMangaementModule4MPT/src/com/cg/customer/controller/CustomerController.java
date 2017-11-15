package com.cg.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.customer.model.CustomerBean;
import com.cg.customer.service.CustomerService;



@Controller
public class CustomerController 
{
	@Autowired
	CustomerService service;
	public CustomerService getService() {
		return service;
	}
	public void setService(CustomerService service) {
		this.service = service;
	}
	@RequestMapping("/start")
	public String start(Model model)
	{
		model.addAttribute("cust",new CustomerBean());
		return "CustomerRegForm";
		
	}
	@RequestMapping("/regform")
	public ModelAndView register(@ModelAttribute("cust")@Valid CustomerBean cust,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("CustomerRegForm");
		}
		else
		{
			service.addCustomer(cust);
			return new ModelAndView( "customerSuccess","k",cust);
		}
		
		
	}
	@RequestMapping("/getId")
	public String getId()
	{
		return "searchdetails";
		
	}
	@RequestMapping("/getById")
	public ModelAndView getById(@RequestParam("custId") int no)
	{
		CustomerBean bean=service.findCustomerById(no);
		return new ModelAndView("getdetails","m",bean);
		
	}
	
	@RequestMapping("/getAll")
	public ModelAndView getAll()
	{
		List<CustomerBean> mylist=service.getAll();
		return new ModelAndView("getAll","key",mylist);
	}
	
}

