package com.xworkz.app.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.app.dto.XeroxDTO;

@Component
@RequestMapping("/")
public class XeroxController {

	public XeroxController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/order.xworkz", method=RequestMethod.POST)
	public String onOrder(XeroxDTO dto,ModelMap map){
		System.out.println("created onOrder");
		System.out.println("form binding"+dto);
		map.addAttribute("name",dto.getName());
		map.addAttribute("copy",dto.getNoOfCopies());
		map.addAttribute("pages",dto.getNoOfPages());
		map.addAttribute("type", dto.getPrintout());
		System.out.println("Success page is Success");
		return "Success";
		
	}
	
	
}
