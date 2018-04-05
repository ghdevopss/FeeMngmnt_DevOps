package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.mockito.Mockito;

import com.javatpoint.beans.StudentBean;
import com.javatpoint.dao.StudentDao;
import com.javatpoint.servlets.EditStudent;
import com.javatpoint.servlets.EditStudentForm;

public class EditStudentTest {

	EditStudent abc= null;
	HttpSession session =Mockito. mock(HttpSession.class);
	RequestDispatcher rd=Mockito.mock(RequestDispatcher.class);
	StudentDao studentdao=Mockito.mock(StudentDao.class);
	StudentBean bean=Mockito.mock(StudentBean.class);

	@Test
	public void testdoPost() throws IOException, ServletException
	{
		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		EditStudent abc=new EditStudent(); 
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		Mockito.when(response.getWriter()).thenReturn(pw);
		Mockito.when(request.getParameter("rollno")).thenReturn("9119");
		Mockito.when(request.getParameter("name")).thenReturn("anu");
		Mockito.when(request.getParameter("email")).thenReturn("anu@gmail.com");
		Mockito.when(request.getParameter("sex")).thenReturn("female");
		Mockito.when(request.getParameter("course")).thenReturn("ug");
		Mockito.when(request.getParameter("fee")).thenReturn("50000");
		Mockito.when(request.getParameter("paid")).thenReturn("1");
		Mockito.when(request.getParameter("due")).thenReturn("0");
		Mockito.when(request.getParameter("address")).thenReturn("chennai");
		Mockito.when(request.getParameter("contact")).thenReturn("9999999");
		abc=new EditStudent();
		abc.doPost(request, response);
	}


}
