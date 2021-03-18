package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.controller.Controller05;

public class Servlet05 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet05 - service() ����");
		
		//��Ʈ�ѷ� ���� �� ��û ó�� �޼ҵ� ȣ��
		Controller05 ctrl = new Controller05();
		String viewName = ctrl.getBoardList(request, response);
		
		//���� ������ ���� �� ����
		String prefix ="/WEB-INF/views/";
		String suffix =".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(prefix + viewName + suffix);
		rd.forward(request, response);
	}
}
