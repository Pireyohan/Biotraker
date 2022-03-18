package Modele;

import java.sql.Date;

public class Patient {
	
	private String Prenom;
	private int Num_patient;
	private String Nom;
	private Date DateNaissance;
	private String Sexe;
	private int mutuelle;
	private int NumSecuPatient;
	private String Com_Patient;
	private String tel_Patient;
	private String email_patient;
	

	public Patient() {
		this.Prenom = "";
		this.Nom= "";
		this.Num_patient= 0;
		this.DateNaissance = null;
		this.Sexe="";
		this.mutuelle=0;
		this.NumSecuPatient=0;
		this.Com_Patient="";
		this.tel_Patient="";
		this.email_patient="";
	}


	public Patient(String prenom, int num_patient, String nom, Date dateNaissance, String sexe, int mutuelle,
			int numSecuPatient, String com_Patient, String tel_Patient, String email_patient) {
		super();
		Prenom = prenom;
		Num_patient = num_patient;
		Nom = nom;
		DateNaissance = dateNaissance;
		Sexe = sexe;
		this.mutuelle = mutuelle;
		NumSecuPatient = numSecuPatient;
		Com_Patient = com_Patient;
		this.tel_Patient = tel_Patient;
		this.email_patient = email_patient;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public int getNum_patient() {
		return Num_patient;
	}


	public void setNum_patient(int num_patient) {
		Num_patient = num_patient;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public Date getDateNaissance() {
		return DateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}


	public String getSexe() {
		return Sexe;
	}


	public void setSexe(String sexe) {
		Sexe = sexe;
	}


	public int getMutuelle() {
		return mutuelle;
	}


	public void setMutuelle(int mutuelle) {
		this.mutuelle = mutuelle;
	}


	public int getNumSecuPatient() {
		return NumSecuPatient;
	}


	public void setNumSecuPatient(int numSecuPatient) {
		NumSecuPatient = numSecuPatient;
	}


	public String getCom_Patient() {
		return Com_Patient;
	}


	public void setCom_Patient(String com_Patient) {
		Com_Patient = com_Patient;
	}


	public String getTel_Patient() {
		return tel_Patient;
	}


	public void setTel_Patient(String tel_Patient) {
		this.tel_Patient = tel_Patient;
	}


	public String getEmail_patient() {
		return email_patient;
	}


	public void setEmail_patient(String email_patient) {
		this.email_patient = email_patient;
	}
	
	
	
	
	
	
	
	
	
	
}
