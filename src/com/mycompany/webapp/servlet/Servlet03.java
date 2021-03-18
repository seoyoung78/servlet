package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Servlet03 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet03 - service() ����");
		
		//��û ������ Ȯ��
		System.out.println("Ŭ���̾�Ʈ IP:" + req.getRemoteHost());
		
		//������ ���� �� JSP ����
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("����1");
		board.setBcontent("����1");
		board.setBwriter("spring");
		req.setAttribute("board", board);
		
		//���� ������ ���� �� ����
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view03.jsp");
		rd.forward(req, resp);
	}
}
