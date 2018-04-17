package com.mitt.bankclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mitt.bankclient.bo.BankService;
import com.mitt.bankclient.vo.BankVO;


@Controller
@SessionAttributes("userBean")
public class BankInfoController {
	
	@Autowired
	private BankService bankService = null;
	
	@RequestMapping("/displayregistration.do")
	public String displayPage(Model model){
		BankVO bvo= new BankVO();
		model.addAttribute("userBean",bvo);
		System.out.println(bvo);
		return "personalinfo";
	}
	
	
	@RequestMapping("/addPersonalInfo.do")
	public String addPersonalInfo(@ModelAttribute("userBean") BankVO bvo){
		//step1
		
		System.out.println("PersonalInfoController:addPersonalInfo -- Start");
		System.out.println("First Name:"+bvo.getFirstName());
		
		//step2
		 
		//userService.registerUser(user);
		
		//step3
		System.out.println("PersonalInfoController:addPersonalInfo -- End");
		return "contactinfo";
	}
	
	@RequestMapping("/addContactInfo.do")
	public String addIBankInfo(@ModelAttribute("userBean") BankVO bvo){
		//step1
		System.out.println("PersonalInfoController:addContactInfo -- Start");
		System.out.println("First Name:"+bvo.getFirstName());
		System.out.println("Address:"+bvo.getAddress());
		//step2
		 
		
		
		//step3
		System.out.println("PersonalInfoController:addContactInfo -- End");
		return "bankinfo";
	}
	
	@RequestMapping("/addBankInfo.do")
	public String displayAllInfo(@ModelAttribute("userBean") BankVO bvo) throws Exception{
		bankService.addBankInfo(bvo);
		return "outputsuccess";
	}
	
	@RequestMapping("/getAllBankInfo.do")
	public ModelAndView getAllBankInfo(ModelMap map) {
		BankVO [] listbvo = bankService.getAllBankInfo();
		
		ModelAndView model = new ModelAndView("viewallinfo");
		model.addObject("listbvo",listbvo);
		return model;
	}
}
