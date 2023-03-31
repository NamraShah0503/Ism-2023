package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcController extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String val = req.getParameter("name");
	int no1 = Integer.parseInt(req.getParameter("no1"));
	int no2 = Integer.parseInt(req.getParameter("no2"));
	int ans = 0 ;
	
	if(val.equalsIgnoreCase("add")) {
		ans = no1+no2;
	}
	if(val.equalsIgnoreCase("sub")) {
		ans = no1-no2;
	}
	if(val.equalsIgnoreCase("mul")) {
		ans = no1*no2;
	}
	if(val.equalsIgnoreCase("div")) {
		ans = no1/no2;
	}
	
	
	System.out.println(ans);
	
	}
	
	
	}
	
