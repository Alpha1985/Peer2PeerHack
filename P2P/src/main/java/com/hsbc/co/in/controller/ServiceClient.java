package com.hsbc.co.in.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.hsbc.co.in.model.ResponseModel;

public class ServiceClient {

	public static void main(String[] args) {

	 
	      HttpHeaders headers = new HttpHeaders();
	      headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
	      headers.setContentType(MediaType.APPLICATION_JSON);
	 
	      RestTemplate restTemplate = new RestTemplate();
	 
	      // Data attached to the request.
	      //HttpEntity<Employee> requestBody = new HttpEntity<>(newEmployee, headers);
	 
	      // Send request with POST method.
	      ResponseModel e = restTemplate.postForObject("http://localhost:8080/home/restsample", null, ResponseModel.class);
	 
	      if (e != null && e.getResponseCode() != null) {
	 
	         System.out.println("REsponse Received: " + e.getResponseCode());
	      } else {
	         System.out.println("Some error!");
	      }

	}

}
