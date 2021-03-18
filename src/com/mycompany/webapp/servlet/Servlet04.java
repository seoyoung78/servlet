package com.mycompany.webapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Servlet04 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet04 - service() ����");
		
		//��û ������ Ȯ��
		System.out.println("Ŭ���̾�Ʈ IP:" + request.getRemoteHost());
		
		//������ ���� �� JSP ����
		List<Board> list = new ArrayList<Board>();
		for (int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("����" + i);
			board.setBcontent("����" + i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list", list); //����
		
		//���� ������ ���� �� ����
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/view04.jsp");
		rd.forward(request, response);
	}
}
