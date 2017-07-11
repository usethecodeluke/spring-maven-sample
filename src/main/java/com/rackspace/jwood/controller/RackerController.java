package com.rackspace.jwood.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rackspace.jwood.domain.Racker;
import com.rackspace.jwood.service.RackerService;

@Controller
public class RackerController {
	@Autowired
	private RackerService rackerService;
	
	@RequestMapping("/racker/list")
	public void rackerList(Model model) {
		List<Racker> rackerList = rackerService.findAll();
		model.addAttribute("rackerList", rackerList);
	}
	
	@RequestMapping("/racker/add")
	public void rackerAdd() {
	}
	
	@RequestMapping(value="/racker/add", method=RequestMethod.POST)
	public String rackerAddSubmit(@ModelAttribute("racker") @Valid Racker racker, BindingResult result) {
		if(result.hasErrors()) {
			// show the form again, with the errors
			return "racker/add";
		}
	
		// validation was successful
		rackerService.add(racker);
		return "redirect:/racker/list";
			
	}

	@RequestMapping(value="/racker/list", method=RequestMethod.POST)
	public String rackerStrengthSubmit(String strength,
									Integer rackerId, BindingResult result) {
		if(result.hasErrors()) {
			// show the form again, with the errors
			return "racker/list";
		}
	
		// validation was successful
		rackerService.addStrength(rackerId, strength);
		return "redirect:/racker/list";
			
	}
}