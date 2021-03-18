package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Controller05 {
	public String getBoardList(HttpServletRequest request, HttpServletResponse reponse) {
		//요청 내용을 확인
		System.out.println("Ŭ���̾�Ʈ IP:" + request.getRemoteHost());
		
		//데이터 생성 및 JSP 전달
		List<Board> list = new ArrayList<Board>();
		for (int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("����" + i);
			board.setBcontent("����" + i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list", list);
		
		//뷰 이름 리턴
		//return "view05";
		return "view052";
	}
}
