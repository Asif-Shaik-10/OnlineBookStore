package com.jsp.bookstoreapplication.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.bookstoreapplication.repo.BookRepo;

@Controller
public class BookController {

	@RequestMapping("/books")
	String books() {
		return "displaybook.jsp";
	}

	@Autowired
	BookRepo bookRepo;

	@RequestMapping("/availablebooks")
	ModelAndView displayaall() {

		ModelAndView mv = new ModelAndView("availablebooks.jsp");

		mv.addObject("allbooks", bookRepo.findAll());
		return mv;

	}

	@RequestMapping("/findbookbyid")
	public ModelAndView findBookByBid(@RequestParam Integer bid) {
		ModelAndView mv = new ModelAndView("displayfound.jsp");
		mv.addObject("foundbook", bookRepo.findById(bid).orElse(null));
		return mv;
	}
	
	

	@RequestMapping("/findbookbyname")
	public ModelAndView findBookByBname(@RequestParam String bname) {
		ModelAndView mv = new ModelAndView("displayfound.jsp");
		mv.addObject("foundbook", bookRepo.findByBname(bname));
		return mv;
	}
	
	
	
	
	@RequestMapping("/findbyprice")
	public ModelAndView findByprice(@RequestParam String price) {
		ModelAndView mv=new ModelAndView("displayfound.jsp");
		mv.addObject("foundbook",bookRepo.findByprice(price).orElse(null));
		return mv;
	}

}
