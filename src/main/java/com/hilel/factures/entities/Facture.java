package com.hilel.factures.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Facture {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idFacture;
private String nomFacture;
private Double tvaFacture;
private Date dateCreation;


@ManyToOne//option 
private Boutique boutique ; 

public Facture() {
super();
}
public Facture(String nomFacture, Double tvaFacture, Date dateCreation) {
super();
this.nomFacture = nomFacture;
this.tvaFacture = tvaFacture;
this.dateCreation = dateCreation;
}
public Long getIdFacture() {
	return idFacture;
}
public void setIdFacture(Long idFacture) {
	this.idFacture = idFacture;
}
public String getNomFacture() {
	return nomFacture;
}
public void setNomFacture(String nomFacture) {
	this.nomFacture = nomFacture;
}
public Double getTvaFacture() {
	return tvaFacture;
}
public void setTvaFacture(Double tvaFacture) {
	this.tvaFacture = tvaFacture;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
@Override
public String toString() {
	return "Facture [idFacture=" + idFacture + ", nomFacture=" + nomFacture + ", tvaFacture=" + tvaFacture
			+ ", dateCreation=" + dateCreation + "]";
}
public Boutique getBoutique() {
	return boutique;
}
public void setBoutique(Boutique boutique) {
	this.boutique = boutique;
}

}
