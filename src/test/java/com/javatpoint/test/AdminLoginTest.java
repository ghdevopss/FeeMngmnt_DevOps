package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.javatpoint.beans.AccountantBean;
import com.javatpoint.dao.AccountantDao;
import com.javatpoint.servlets.AccountantLogin;
import com.javatpoint.servlets.AdminLogin;

public class AdminLoginTest  extends TestCase {
	AdminLogin abc=null;


	HttpSession session =Mockito. mock(HttpSession.class);
	RequestDispatcher rd=Mockito.mock(RequestDispatcher.class);


	@Test
	public void testMethodfordoGet() throws Exception {

		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		Mockito.when(request.getParameter("email")).thenReturn("admin@feereport.com");
		Mockito.when(request.getParameter("password")).thenReturn("admin123");
		Mockito.when(request.getRequestDispatcher("navadmin.html")).thenReturn(rd);
		Mockito.when(request.getSession()).thenReturn(session);
		Mockito.when(request.getRequestDispatcher("adminhome.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("AdminLoginForm.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("footer.html")).thenReturn(rd);

		Mockito.when(response.getWriter()).thenReturn(pw);
		abc=new AdminLogin();
		abc.doGet(request,response);
	}
}



















