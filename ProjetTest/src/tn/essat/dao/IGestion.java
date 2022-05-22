package tn.essat.dao;

import java.util.List;

import tn.essat.model.Categorie;
import tn.essat.model.Enseignant;
import tn.essat.model.Etudiant;
import tn.essat.model.Pfe;

public interface IGestion {
	
	public List<Pfe> getAllPfe();
	public List<Categorie> getAllCategories();
	public List<Pfe> getAllPfeByCategorie(String speciliteCat);
	public List<Etudiant> getAllEtudiants();
	public List<Enseignant> getAllEnseignant();
	public void addPfe(Pfe p);
	public void deletePfe(int idCat);
	int getCount();
	Etudiant getEtudiantById(int idEt);
	Enseignant getEnseignantById(int En);
	Categorie getCategorieById(int id);

}