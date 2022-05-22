package tn.essat.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import tn.essat.model.Categorie;
import tn.essat.model.Enseignant;
import tn.essat.model.Etudiant;
import tn.essat.model.Pfe;

public class GestionImp implements IGestion {
	
	Session session;

	public GestionImp() {
	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
	SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
	this.session=sessionFactory.openSession();

	}

	@Override
	public List<Pfe> getAllPfe() {
		Query<Pfe> p = this.session.createQuery("select pf from Pfe pf");
		List<Pfe> listePFE = p.getResultList();
		return listePFE;		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pfe> getAllPfeByCategorie(String speciliteCat) {
		Query<Pfe> p = this.session.createQuery("select pf,cat from Pfe,Categorie pf,cat where pf.idCat=cat.cat_id AND cat.specilite==speciliteCat");
		List<Pfe> listePFE = p.getResultList();
		return listePFE;
	}
	@Override
	public List<Etudiant> getAllEtudiants() {
	Query<Etudiant> etd = this.session.createQuery("select et from Etudiant et");
	List<Etudiant> listeEtd = etd.getResultList();
	return listeEtd;
	}
	
	@Override
	public Etudiant getEtudiantById(int id) {
	Query<Etudiant> etd = this.session.createQuery("select et from Etudiant et where et.idEt = id");
	Etudiant Etd = etd.getSingleResult();
	return Etd;
	}


	@Override
	public List<Enseignant> getAllEnseignant() {
	Query<Enseignant> ens = this.session.createQuery("select en from Enseignant en");
	List<Enseignant> listeEns = ens.getResultList();
	return listeEns;
	}
	
	@Override
	public Enseignant getEnseignantById(int id) {
	Query<Enseignant> en = this.session.createQuery("select en from Enseignant en where en.idEn = id");
	Enseignant En = en.getSingleResult();
	return En;
	}
	
	@Override
	public List<Categorie> getAllCategories() {
	Query<Categorie> ens = this.session.createQuery("select en from Categorie en");
	List<Categorie> listeCat = ens.getResultList();
	return listeCat;
	}
	
	@Override
	public Categorie getCategorieById(int id) {
		Query<Categorie> cat = this.session.createQuery("select ca from Categorie ca where en.idCat = id");
		Categorie En = cat.getSingleResult();
		return En;
		}


	@Override
	public void addPfe(Pfe p) {
	this.session.getTransaction().begin();
	this.session.save(p);
	this.session.getTransaction().commit();

	}



	@Override
	public void deletePfe(int idPfe) {
	Pfe pfe= this.session.load(Pfe.class , idPfe);
	this.session.getTransaction().begin();
	this.session.delete(pfe);
	this.session.getTransaction().commit();

	}
	@Override
	public int getCount() {
		Query query = this.session.createQuery("select COUNT(titrePfe) from Pfe p");
		int i=query.executeUpdate();
		return i;
	}
	

}