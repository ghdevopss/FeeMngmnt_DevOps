package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.mockito.Mockito;

import com.javatpoint.servlets.LogoutAccountant;
import com.javatpoint.servlets.SearchStudentForm;

public class LogoutAccountantTest {

	LogoutAccountant abc= null;

	RequestDispatcher rd=Mockito.mock(RequestDispatcher.class);
	HttpSession session =Mockito. mock(HttpSession.class);


	@Test
	public void testDoGet() throws Exception {
		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		LogoutAccountant abc=new LogoutAccountant();
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		Mockito.when(request.getRequestDispatcher("navhome.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("AccountantLoginForm.html")).thenReturn(rd);
		Mockito.when(response.getWriter()).thenReturn(pw);
		Mockito.when(request.getRequestDispatcher("footer.html")).thenReturn(rd);
		Mockito.when(request.getSession()).thenReturn(session);
		abc= new LogoutAccountant();
		abc.doGet(request, response);
	}

}
