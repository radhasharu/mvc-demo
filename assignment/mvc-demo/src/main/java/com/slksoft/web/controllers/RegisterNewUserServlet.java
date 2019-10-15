package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.User;
import com.slksoft.service.UsersService;

@WebServlet("/register")
public class RegisterNewUserServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		req.getRequestDispatcher("WEB-INF/views/user-form.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User u=new User();
		u.setName(req.getParameter("name"));
		u.setEmail(req.getParameter("email"));
		u.setPhone(req.getParameter("phone"));
		u.setGender(req.getParameter("gender"));
		u.setPassword(req.getParameter("password"));
		u.setCreatedAt(new Date());
		
		UsersService service=new UsersService();
		service.registerNewUser(u);
		
		
		resp.sendRedirect("./login");
		

	}
	

	

}
