package com.pacote.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletClasse")
public class ServletClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletClasse() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nome = request.getParameter("nome");
		
		PrintWriter saida = response.getWriter();
		
		saida.println("<HTML><BODY>");
		saida.println("<H1>Seja bem vindo, "+ nome +"</H1");
		saida.println("</HTML></BODY>");
		
		saida.close();
	}

}
