package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet02 - service() ����");
		
		//��û ������ Ȯ��
		System.out.println("Ŭ���̾�Ʈ IP:" + req.getRemoteHost());
		
		//���� ������ ���� �� ����
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view02.jsp");
		rd.forward(req, resp);
	}
}
