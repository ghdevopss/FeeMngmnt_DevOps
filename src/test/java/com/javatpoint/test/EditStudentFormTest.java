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

import com.javatpoint.servlets.EditStudentForm;

public class EditStudentFormTest {
	EditStudentForm abc =null;
	HttpSession session =Mockito. mock(HttpSession.class);
	RequestDispatcher rd=Mockito.mock(RequestDispatcher.class);
	@Test
	public void testdoGet() throws Exception
	{
		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		Mockito.when(response.getWriter()).thenReturn(pw);
		Mockito.when(request.getParameter("rollno")).thenReturn("9119");
		Mockito.when(request.getRequestDispatcher("navaccountant.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("footer.html")).thenReturn(rd);
		abc=new EditStudentForm();
		abc.doGet(request,response);
	}

}