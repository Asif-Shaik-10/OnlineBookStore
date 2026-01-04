package com.jsp.bookstoreapplication.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.bookstoreapplication.entitites.Customer;
import com.jsp.bookstoreapplication.repo.CustomerRepo;



@Controller
public class CustomerController {
	
	
	

	@RequestMapping("/home")
	String home() {
		return "home.jsp";
	}
	
	
	
	
	@RequestMapping("/customer")
	String customer() {
		return "customer.jsp";
	}
	
	
	@Autowired
	CustomerRepo custRepo;
	@RequestMapping("/addcustomer")
	ModelAndView addcustomer(ModelAndView model, Customer customer) {
		
		customer.setCid(null);
		Customer obj=custRepo.save(customer);
		if(obj!=null) {
			model.addObject("data","Data is Saved to db....");
		}
		else {
			model.addObject("data", "Error ......");
		}

		
		model.setViewName("display.jsp");
		return model;

	}

	@RequestMapping("/findbyid")
	public ModelAndView findbyid(@RequestParam("cid") Integer cid) {
	    ModelAndView mv = new ModelAndView("display.jsp");
	    
	    if (cid == null || cid <= 0) {
	        mv.addObject("data", "Please enter valid ID!");
	        return mv;
	    }

	    Customer customer = custRepo.findById(cid).orElse(null);
	    if (customer != null) {
	        mv.addObject("data", customer);  
	    } else {
	        mv.addObject("data", "Customer not found with ID: " + cid);
	    }
	    return mv;
	}


	@RequestMapping("/deletecustomerbyid")
	public ModelAndView deletebyid(@RequestParam Integer  cid) {
		
		ModelAndView mv=new ModelAndView();
		Customer e=custRepo.findById(cid).orElse(null);
		if(e!=null) {
			custRepo.deleteById(cid);
			mv.addObject("data","Data is deleted");
		}
		else {
			mv.addObject("data", "Error id is not found ......");
		}

		
		mv.setViewName("display.jsp");
		return mv;
		
		
		
		
	}

	@RequestMapping("/deletecustomerbyname")
	public ModelAndView deletebyname(@RequestParam String name) {
	    ModelAndView mv = new ModelAndView("display.jsp");
	    
	    Customer customer = custRepo.findByName(name).orElse(null);
	    if(customer != null) {
	        custRepo.delete(customer);
	        mv.addObject("data", "Customer deleted: " + name);
	    } else {
	        mv.addObject("data", "Customer not found with name: " + name);
	    }
	    return mv;
	}
	
	
	
	

}
