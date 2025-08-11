package com.nit.servlet;


import java.io.IOException;
import java.util.Date;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest requst,HttpServletResponse responce)throws ServletException,IOException {
	//get printWriter
		PrintWriter pw=responce.getWriter();
		//set responce contetent type
		responce.setContentType("text/html");
		
		pw.println("<h1>date and time is::"+new Date()+"</h1>");
		pw.println("<br><a href='index.html'>home</a>");
		pw.close();
	}
protected void doPost(HttpServletRequest requst,HttpServletResponse responce) {
	try {
		doGet(requst, responce);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
