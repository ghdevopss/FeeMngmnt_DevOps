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

public class AddAccountantTest {

	HttpSession session = Mockito.mock(HttpSession.class);
	RequestDispatcher rd=(RequestDispatcher) Mockito.mock(RequestDispatcher.class);


	@Test
	public void testdoPost() throws IOException
	{
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		Mockito.when(response.getWriter()).thenReturn(pw);
		Mockito.when(request.getRequestDispatcher("navadmin.html")).thenReturn(rd);
		Mockito.when(request.getParameter("name")).thenReturn("abhinav");		
		Mockito.when(request.getParameter("email")).thenReturn("abhinav@gmail.com");
		Mockito.when(request.getParameter("password")).thenReturn("passw0rd");
		Mockito.when(request.getParameter("address")).thenReturn("chennai");
		Mockito.when(request.getParameter("contact")).thenReturn("99999");
		Mockito.when(request.getRequestDispatcher("AddAccountantForm.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("footer.html")).thenReturn(rd);



	}

}