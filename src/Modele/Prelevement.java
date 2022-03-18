package Modele;

import java.sql.Date;

public class Prelevement {
	
	private int Num_prel;
	private String Type_Prel;
	private String Origine_prel;
	private float Temp_prel;
	private Date Date_Prel;
	private Date Heure_prel; 
	private String labo_prel;
	private String Service_Prel;
	private String Tube_prel;
	private float Qte_prel;
	private String Comm_prel;
	
	
	
	public Prelevement() {
		super();
		Num_prel = 0;
		Type_Prel = "vv";
		Origine_prel = "vv";
		Temp_prel = 0;
		//Date_Prel = "2021-01-01";
		//Heure_prel = "05:18:00";
		this.labo_prel = "";
		Service_Prel = "";
		Tube_prel = "";
		Qte_prel = 0;
		Comm_prel = "";	}



	public Prelevement(int num_prel, String type_Prel, String origine_prel, float temp_prel, Date date_Prel,
			Date heure_prel, String labo_prel, String service_Prel, String tube_prel, float qte_prel,
			String comm_prel) {
		super();
		Num_prel = num_prel;
		Type_Prel = type_Prel;
		Origine_prel = origine_prel;
		Temp_prel = temp_prel;
		Date_Prel = date_Prel;
		Heure_prel = heure_prel;
		this.labo_prel = labo_prel;
		Service_Prel = service_Prel;
		Tube_prel = tube_prel;
		Qte_prel = qte_prel;
		Comm_prel = comm_prel;
	}



	@Override
	public String toString() {
		return "Prelevement [Num_prel=" + Num_prel + ", Type_Prel=" + Type_Prel + ", Origine_prel=" + Origine_prel
				+ ", Temp_prel=" + Temp_prel + ", Date_Prel=" + Date_Prel + ", Heure_prel=" + Heure_prel
				+ ", labo_prel=" + labo_prel + ", Service_Prel=" + Service_Prel + ", Tube_prel=" + Tube_prel
				+ ", Qte_prel=" + Qte_prel + ", Comm_prel=" + Comm_prel + "]";
	}



	public int getNum_prel() {
		return Num_prel;
	}



	public void setNum_prel(int num_prel) {
		Num_prel = num_prel;
	}



	public String getType_Prel() {
		return Type_Prel;
	}



	public void setType_Prel(String type_Prel) {
		Type_Prel = type_Prel;
	}



	public String getOrigine_prel() {
		return Origine_prel;
	}



	public void setOrigine_prel(String origine_prel) {
		Origine_prel = origine_prel;
	}



	public float getTemp_prel() {
		return Temp_prel;
	}



	public void setTemp_prel(float temp_prel) {
		Temp_prel = temp_prel;
	}



	public Date getDate_Prel() {
		return Date_Prel;
	}



	public void setDate_Prel(Date date_Prel) {
		Date_Prel = date_Prel;
	}



	public Date getHeure_prel() {
		return Heure_prel;
	}



	public void setHeure_prel(Date heure_prel) {
		Heure_prel = heure_prel;
	}



	public String getLabo_prel() {
		return labo_prel;
	}



	public void setLabo_prel(String labo_prel) {
		this.labo_prel = labo_prel;
	}



	public String getService_Prel() {
		return Service_Prel;
	}



	public void setService_Prel(String service_Prel) {
		Service_Prel = service_Prel;
	}



	public String getTube_prel() {
		return Tube_prel;
	}



	public void setTube_prel(String tube_prel) {
		Tube_prel = tube_prel;
	}



	public float getQte_prel() {
		return Qte_prel;
	}



	public void setQte_prel(float qte_prel) {
		Qte_prel = qte_prel;
	}



	public String getComm_prel() {
		return Comm_prel;
	}



	public void setComm_prel(String comm_prel) {
		Comm_prel = comm_prel;
	}
	
	
	
	

	

}

