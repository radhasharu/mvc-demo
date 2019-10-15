package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Message;
import com.slksoft.entity.User;
import com.slksoft.service.UsersService;

@WebServlet("/messageDetails")
public class MessageDetailsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = (User) req.getSession().getAttribute("user");
		Integer id=Integer.parseInt(req.getParameter("id"));
		if (user == null) {
			// not logged in
			resp.sendRedirect("/");
			return;
		}
	
		UsersService service=new UsersService();
		Message m=service.getMsgById(id);
		req.getSession().setAttribute("message", m);
		req.getRequestDispatcher("WEB-INF/views/message-details.jsp").forward(req, resp);
	}
}
