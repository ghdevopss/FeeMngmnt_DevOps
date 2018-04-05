package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import com.javatpoint.servlets.DeleteStudent;

public class DeleteStudentTest {
	DeleteStudent abc=null;

	@Test
	public void testdoGet() throws ServletException, IOException
	{
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		Mockito.when(request.getParameter("rollno")).thenReturn("9119");
		abc=new DeleteStudent();
		abc.doGet(request, response);
	}

}

