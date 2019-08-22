package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		Integer id = Integer.parseInt(idString); // pode usar valueof(idString)

		Banco banco = new Banco();

		Empresa empresa = banco.buscaEmpresaId(id);

		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);

		System.out.println("acao mostrando empresa");
		
		
		return "forward:formAlteraEmpresa.jsp";
	}
}
