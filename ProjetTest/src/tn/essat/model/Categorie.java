package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCat;
	private String specialiteCat;
	public Categorie(int idCat, String specialiteCat) {
		super();
		this.idCat = idCat;
		this.specialiteCat = specialiteCat;
	}
	public Categorie() {
		super();
	}
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	public String getSpecialiteCat() {
		return specialiteCat;
	}
	public void setSpecialiteCat(String specialiteCat) {
		this.specialiteCat = specialiteCat;
	}
	
	

}