package Modele;

public class NonConform {

	private int N_conf;
	private String N_emeteur;
	private String Commentaire;
	private String Gravite;
	private String Impact;
	private int N_prelevement;

	public NonConform() {
		super();
		N_conf = 0;
		N_emeteur = "";
		Commentaire = "";
		Gravite = "";
		Impact = "";
		N_prelevement = 0;
	}



	public NonConform(int n_conf, String n_emeteur, String commentaire, String gravite, String impact,
			int n_prelevement) {
		super();
		N_conf = n_conf;
		N_emeteur = n_emeteur;
		Commentaire = commentaire;
		Gravite = gravite;
		Impact = impact;
		N_prelevement = n_prelevement;
	}




	public int getN_conf() {
		return N_conf;
	}



	public void setN_conf(int n_conf) {
		N_conf = n_conf;
	}



	public String getN_emeteur() {
		return N_emeteur;
	}



	public void setN_emeteur(String n_emeteur) {
		N_emeteur = n_emeteur;
	}



	public String getCommentaire() {
		return Commentaire;
	}



	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}



	public String getGravite() {
		return Gravite;
	}



	public void setGravite(String gravite) {
		Gravite = gravite;
	}



	public String getImpact() {
		return Impact;
	}



	public void setImpact(String impact) {
		Impact = impact;
	}



	public int getN_prelevement() {
		return N_prelevement;
	}



	public void setN_prelevement(int n_prelevement) {
		N_prelevement = n_prelevement;
	}



	@Override
	public String toString() {
		return + N_conf + "," + N_emeteur + "," + Commentaire + "," + Gravite + "," + Impact + "," + N_prelevement;
	}

}
