package com.slksoft.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.dao.UsersDao;
import com.slksoft.entity.Message;
import com.slksoft.entity.User;

public class UsersService {

	SqlSessionFactory factory;

	public UsersService() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public void registerNewUser(User user) {
		// should do validation of user fields (TBD)
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			dao.addNewUser(user);
		}
	}
	
	public User loginUser(String email,String password) {
		
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			return dao.loginUser(email,password);
		}
		
		
	}
	
	public void addNewMessage(Message msg) {
		// should do validation of user fields (TBD)
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			dao.addNewMessage(msg);
		}
	}

	public List<Message> getMsgByEmail(String email){
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			return dao.getMsgByEmail(email);
		}
	}

	public Message getMsgById(Integer id){
		try (SqlSession session = factory.openSession(true)) {
			UsersDao dao = session.getMapper(UsersDao.class);
			return dao.getMsgById(id);
		}
	}
	
	
//	public void updateDetails(User user) {
//		
//		try (SqlSession session = factory.openSession(true)) {
//			UsersDao dao = session.getMapper(UsersDao.class);
//			  dao.updateDetails(user);
//		}
//		
//		
//	}
	
 
	

}
