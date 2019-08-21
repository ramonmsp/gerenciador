package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String idString = request.getParameter("id");
		Integer id = Integer.parseInt(idString); //pode usar valueof(idString)
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		System.out.println("acao removendo empresa");
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
		
	}

}
