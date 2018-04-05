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

import com.javatpoint.servlets.AddStudent;

public class AddStudentTest {

    AddStudent abc=null;
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
		Mockito.when(request.getParameter("name")).thenReturn("abhinav");
		Mockito.when(request.getParameter("email")).thenReturn("abhinav@gmail.com");
		Mockito.when(request.getParameter("sex")).thenReturn("male");
		Mockito.when(request.getParameter("course")).thenReturn("ug");
		Mockito.when(request.getParameter("fee")).thenReturn("50000");
		Mockito.when(request.getParameter("paid")).thenReturn("30000");
		Mockito.when(request.getParameter("due")).thenReturn("20000");
		Mockito.when(request.getParameter("address")).thenReturn("chennai");
		Mockito.when(request.getParameter("contact")).thenReturn("99999");
		Mockito.when(request.getRequestDispatcher("navaccountant.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("AddStudentForm.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("footer.html")).thenReturn(rd);
		abc=new AddStudent();
		abc.doPost(request, response);
	}

}