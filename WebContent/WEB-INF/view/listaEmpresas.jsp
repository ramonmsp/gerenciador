<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem de empresas</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />



	Usuario Logado: ${usuarioLogado.login }
	
	<br>
	<br>
	<br>
	<c:if test="${not empty empresa }">
		<h2>Empresa ${ empresa } cadastrada com sucesso</h2>
	</c:if>

	Lista de Empresas
	<br />

	<ul>
		<c:forEach items="${empresas}" var="empresa">

			<li>${empresa.nome }- <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy" />
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">remove</a>
					<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">edita</a>
					
			</li>
		</c:forEach>

	</ul>
</body>
</html>