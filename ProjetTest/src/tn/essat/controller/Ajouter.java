package tn.essat.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Categorie;
import tn.essat.model.Enseignant;
import tn.essat.model.Etudiant;
import tn.essat.model.Pfe;

/**
 * Servlet implementation class Ajouter
 */
public class Ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IGestion guest = new GestionImp();
		int i = guest.getCount();
		String titre=request.getParameter("titrePfe");
		int idEt= Integer.parseInt(request.getParameter("etud"));
		Etudiant et= guest.getEtudiantById(idEt);
		int idEn= Integer.parseInt(request.getParameter("ense"));
		Enseignant en= guest.getEnseignantById(idEn);
		int idcat= Integer.parseInt(request.getParameter("categ"));		
		Categorie cat = guest.getCategorieById(idcat);
		
		Pfe p = new Pfe();
		p.setTitrePfe(titre);
		p.setEn(en);
		p.setEt(et);
		p.setCat(cat);
		guest.addPfe(p);
		request.getRequestDispatcher("Principale").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
