package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.mockito.Mockito;

import com.javatpoint.servlets.EditAccountant;

public class EditAccountantTest {

	EditAccountant abc=null;
	HttpSession session =Mockito. mock(HttpSession.class);
	RequestDispatcher rd=Mockito.mock(RequestDispatcher.class);


	@Test
	public void testdoPost() throws Exception
	{
		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		Mockito.when(response.getWriter()).thenReturn(pw);
		Mockito.when(request.getParameter("id")).thenReturn("1234");
		Mockito.when(request.getParameter("name")).thenReturn("abhinav");
		Mockito.when(request.getParameter("email")).thenReturn("abhinav@gmail.com");
		Mockito.when(request.getParameter("password")).thenReturn("passw0rd");
		Mockito.when(request.getParameter("address")).thenReturn("chennai");
		Mockito.when(request.getParameter("contact")).thenReturn("99999");
		abc=new EditAccountant();
		abc.doPost(request, response);
	}
}
