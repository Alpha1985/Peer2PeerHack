package com.hsbc.co.in.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsbc.co.in.model.ResponseModel;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value="/index", method= {RequestMethod.GET, RequestMethod.POST})
	public String homePage(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("==== Inside Home page ====s");
		return "index";
	}
	
	@RequestMapping(value="/restsample", method= {RequestMethod.POST})
	@ResponseBody
	public ResponseModel getHttpResponse() {
		System.out.println("=== Inside rest call ===");
		ResponseModel model = new ResponseModel();
		model.setResponseCode("200");
		return model;
	}

}
