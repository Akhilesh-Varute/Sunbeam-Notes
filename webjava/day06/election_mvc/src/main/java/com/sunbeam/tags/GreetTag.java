package com.sunbeam.tags;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;

public class GreetTag extends SimpleTagSupport {
	private int userId;
	public GreetTag() {
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public void doTag() throws JspException, IOException {
		// Business Logic
		User user = null;
		try(UserDao dao = new UserDaoImpl()) {
			user = dao.findById(userId);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		PageContext pageContext = (PageContext) this.getJspContext();
		JspWriter out = pageContext.getOut();
		// Presentation Logic
		if(user != null)
			out.println("Hello, " + user.getFirstName() + " " + user.getLastName() + "!");
		else
			out.println("Hello, Unknown!");
	}
}














