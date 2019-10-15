package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Message;
import com.slksoft.entity.User;
import com.slksoft.service.UsersService;

@WebServlet("/inbox")
public class InboxServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = (User) req.getSession().getAttribute("user");
		if (user == null) {
			// not logged in
			resp.sendRedirect("/");
			return;
		}
		
		String email=user.getEmail();
		UsersService service=new UsersService();
		List<Message> m= service.getMsgByEmail(email);
		
		req.getSession().setAttribute("msg",m);
		req.getRequestDispatcher("WEB-INF/views/inbox.jsp").forward(req, resp);

	}
	
	
	

}
