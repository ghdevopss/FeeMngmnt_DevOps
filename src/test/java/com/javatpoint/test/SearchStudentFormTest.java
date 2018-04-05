package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import com.javatpoint.servlets.AdminLogin;
import com.javatpoint.servlets.SearchStudentForm;

public class SearchStudentFormTest {

	SearchStudentForm abc=null;
	RequestDispatcher rd=Mockito.mock(RequestDispatcher.class);


	@Test
	public void testDoGet() throws Exception {
		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		SearchStudentForm abc=new 	SearchStudentForm ();
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		Mockito.when(response.getWriter()).thenReturn(pw);

		Mockito.when(request.getRequestDispatcher("navaccountant.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("SearchStudentForm.html")).thenReturn(rd);
		Mockito.when(request.getRequestDispatcher("footer.html")).thenReturn(rd);
		abc= new SearchStudentForm();
		abc.doGet(request,response);


	}

}
