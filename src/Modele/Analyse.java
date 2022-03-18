package Modele;


public class Analyse {
	
	private int Num_Mallette;
	private int Num_Analyse;
	private int Num_Prelevement;
	private String Ori_analyse;
	private String prescription_analyse;
	private String labor_analyse;
	private int Num_Transport;
    private int num_prelevement;
    private int Num_codebarre;
    
	
	public Analyse() {

		this.Num_Mallette = 0;
		this.Num_Analyse = 0;
		this.Num_Prelevement = 0;
		this.Ori_analyse ="";
		this.prescription_analyse ="";
		this.labor_analyse= "";
		this.Num_Transport= 0;
		this.num_prelevement =0;
		this.Num_codebarre=0;
	    
	
	}


	public Analyse(int num_Mallette, int num_Analyse, int num_Prelevement, String ori_analyse,
			String prescription_analyse, String labor_analyse, int num_Transport, int num_prelevement2) {
		super();
		Num_Mallette = num_Mallette;
		Num_Analyse = num_Analyse;
		Num_Prelevement = num_Prelevement;
		Ori_analyse = ori_analyse;
		this.prescription_analyse = prescription_analyse;
		this.labor_analyse = labor_analyse;
		Num_Transport = num_Transport;
		num_prelevement = num_prelevement2;
	}


	public int getNum_Mallette() {
		return Num_Mallette;
	}


	public void setNum_Mallette(int num_Mallette) {
		Num_Mallette = num_Mallette;
	}


	public int getNum_Analyse() {
		return Num_Analyse;
	}


	public void setNum_Analyse(int num_Analyse) {
		Num_Analyse = num_Analyse;
	}


	public int getNum_Prelevement() {
		return Num_Prelevement;
	}


	public void setNum_Prelevement(int num_Prelevement) {
		Num_Prelevement = num_Prelevement;
	}


	public String getOri_analyse() {
		return Ori_analyse;
	}


	public void setOri_analyse(String ori_analyse) {
		Ori_analyse = ori_analyse;
	}


	public String getPrescription_analyse() {
		return prescription_analyse;
	}


	public void setPrescription_analyse(String prescription_analyse) {
		this.prescription_analyse = prescription_analyse;
	}


	public String getLabor_analyse() {
		return labor_analyse;
	}


	public void setLabor_analyse(String labor_analyse) {
		this.labor_analyse = labor_analyse;
	}


	public int getNum_Transport() {
		return Num_Transport;
	}


	public void setNum_Transport(int num_Transport) {
		Num_Transport = num_Transport;
	}


	public int getNum_prelevement() {
		return num_prelevement;
	}


	public void setNum_prelevement(int num_prelevement) {
		this.num_prelevement = num_prelevement;
	}
	
	public int Num_codebarre() {
		return num_prelevement;
	}


	public void Num_codebarre(int Num_codebarre) {
		this.Num_codebarre = Num_codebarre;
	}
	

	
	



	
	
	

}
