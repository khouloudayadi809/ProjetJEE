<%@page import="tn.essat.model.Etudiant"%>
<%@page import="tn.essat.model.Enseignant"%>
<%@page import="tn.essat.model.Categorie"%>

<%@page import="java.util.List"%>
<%@page import="tn.essat.dao.GestionImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<% GestionImp  etu = new GestionImp (); 
List<Etudiant> etudiants = etu.getAllEtudiants();
%>
<% GestionImp  ens = new GestionImp (); 
List<Enseignant> enseignants = ens.getAllEnseignant();
%>

<% GestionImp  cate = new GestionImp (); 
List<Categorie> categories = cate.getAllCategories();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ajouter un PFE</h1>
<a href="Principale">Retour</a>
<Br><Br>
<form methode='Get' action='Ajouter'>
<p>Titre:<input type="text" name="titrePfe"></p>
<p>Etudiant:<select name="etud" id="etud">
<% for (Etudiant e : etudiants){ %>
<option value=<%= e.getIdEt() %>><%=e.getNomEt() %></option>
<%} %></select>

<p>Enseignant:<select name="ense" id="ense">
<% for (Enseignant en : enseignants){ %>
<option value=<%= en.getIdEn() %>><%=en.getNomEn()%></option>
<%} %> </select>

<p>Categorie:<select name="categ" id="categ">
 <%for (Categorie ca : categories){ %>
<option value=<%= ca.getIdCat() %>><%=ca.getSpecialiteCat()%></option>
<%} %></select>
<br><br>
<input type="submit" value="Enregistrer">
</body>
</html>