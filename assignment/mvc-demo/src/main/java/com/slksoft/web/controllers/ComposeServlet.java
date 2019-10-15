package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Message;
import com.slksoft.entity.User;
import com.slksoft.service.UsersService;
@WebServlet("/compose")
public class ComposeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = (User) req.getSession().getAttribute("user");
		if (user == null) {
			// not logged in
			resp.sendRedirect("/");
			return;
		}
		req.getRequestDispatcher("WEB-INF/views/compose.jsp").forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = (User) req.getSession().getAttribute("user");
		
		Message m=new Message();
		
		m.setMsgFrom(user.getEmail());
		m.setMsgTo(req.getParameter("to"));
		m.setCc(req.getParameter("cc"));
		m.setSubject(req.getParameter("subject"));
		m.setBody(req.getParameter("body"));
		m.setSendAt(new Date());
		
		//System.out.println(m.toString());
		
		UsersService service =new UsersService();
		service.addNewMessage(m);
		
		resp.sendRedirect("./inbox");
	}
	
	

}
