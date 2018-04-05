package com.javatpoint.test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import com.javatpoint.dao.AccountantDao;
import com.javatpoint.servlets.DeleteAccountant;

public class DeleteAccountantTest {
	DeleteAccountant abc = null; 

	@Test
	public void testDoGet() throws Exception{
		HttpServletRequest request =Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response =Mockito.mock(HttpServletResponse.class);
		Mockito.when(request.getParameter("id")).thenReturn("670355");
		abc=new DeleteAccountant();
		abc.doGet(request, response);
	}

}
