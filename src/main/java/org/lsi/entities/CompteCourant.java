package org.lsi.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")

public class CompteCourant extends Compte {
	private double decouvert;
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompteCourant(Long codeCompte, Date dateCreation, double solde, double decouvert) {
		super(codeCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


}
