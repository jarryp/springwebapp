package com.palaciossystems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.palaciossystems.pojo.Admin;
import com.palaciossystems.service.AdminService;

@Controller
public class adminController {
	
	
	@Autowired private AdminService adminService;

	@RequestMapping("/admin")
	public String showAdmin(Model model,
			@ModelAttribute("resultado") String resultado){
		model.addAttribute("admin", new Admin());
		model.addAttribute("resultado", resultado);
		
		return "admin";
	}
	
	@RequestMapping(value="/admin/save", method=RequestMethod.POST)
	public String handleAdmin(@ModelAttribute("admin") Admin adminForm, 
			                  Model model, RedirectAttributes ra,
			                  @RequestParam("estado") String estado){
		//model.addAttribute("adminForm", adminForm);
		
		System.out.println(adminForm);
		System.out.println("request Param: "+estado);
		
		ra.addFlashAttribute("resultado", "Cambios Realizados con exito");
		
		return "redirect:/admin";
		//return "admin";
	}
}
