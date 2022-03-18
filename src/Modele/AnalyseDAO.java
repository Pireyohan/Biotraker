package Modele;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AnalyseDAO {

	private static Connection conn3;

	public AnalyseDAO() throws ClassNotFoundException, IOException, SQLException {
		// je me connecte la la base de donnée
		conn3 = ConnexionBDD.getConnection();

	}

	// méthode qui prend en paramétre notre prélévement
	public static Prelevement EnregistrementAnalysePrelevement(Analyse enregistrement) {

		// on récupére le num prelevement via le getter de notre objet enregistrement.
		int NumAnalyse = enregistrement.getNum_Analyse();

		// on crée une arraylist qui prend en paramétre l'objet prelevement

		// ArrayList<Prelevement> enregistrementPrel= new ArrayList<Prelevement>();
		// ArrayList<Patient> renvoiePatient= new ArrayList<Patient>();
		// instanciation des objets patients et prelevemnt
		Prelevement prel = new Prelevement();
		ArrayList<Prelevement> ArrayPrel = new ArrayList<Prelevement>();
		// Patient Patient = new Patient();

		try {
			// on fait une requete SQL avec le contenu de l'objet prelevement NUM_Prel
			Statement instruction3 = conn3.createStatement();

			String SQL = "Select * from prelevement NATURAL JOIN analyse where num_ana='" + NumAnalyse
					+ "' and prelevement.num_ana=analyse.num_ana;";

			ResultSet resultat = instruction3.executeQuery(SQL);

			while (resultat.next()) {

				// attribue dans notre objet les carateristique obtenu depuis la base de donnée
				// prel.setDate_Prel(resultat.getString("Date_Prel"));
				prel.setType_Prel(resultat.getString("Type_Prel"));
				prel.setOrigine_prel(resultat.getString("Origine_Prel"));
				prel.setTemp_prel(resultat.getFloat("Temperature_prel"));
				prel.setDate_Prel(resultat.getDate("Date_prel"));
				
				ArrayPrel.add(prel);

				// on ajoute ces caracteristiques dans un objet list l'objet suivi

			}

//			while (resultat.next()) {
//			
//			Patient.setNom(resultat.getString("Nom_Patient"));
//			Patient.setPrenom(resultat.getString("prenom_Patient"));
//			renvoiePatient.add(Patient);
//			return renvoiePatient;
			// }

			resultat.close();

		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
		// on retourne une array list
		return prel;

	}
	

	public static ArrayList<Prelevement> RevnoieListPrel(Analyse enregistrement) {

		// on récupére le num prelevement via le getter de notre objet enregistrement.
		int NumAnalyse = enregistrement.getNum_Analyse();

		// on crée une arraylist qui prend en paramétre l'objet prelevement

		// ArrayList<Prelevement> enregistrementPrel= new ArrayList<Prelevement>();
		// ArrayList<Patient> renvoiePatient= new ArrayList<Patient>();
		// instanciation des objets patients et prelevemnt
		Prelevement prel = new Prelevement();
		ArrayList<Prelevement> ArrayPrel = new ArrayList<Prelevement>();
		// Patient Patient = new Patient();

		try {
			// on fait une requete SQL avec le contenu de l'objet prelevement NUM_Prel
			Statement instruction3 = conn3.createStatement();

			String SQL = "Select * from prelevement NATURAL JOIN analyse where num_ana='" + NumAnalyse
					+ "' and prelevement.num_ana=analyse.num_ana;";

			ResultSet resultat = instruction3.executeQuery(SQL);

			while (resultat.next()) {

				// attribue dans notre objet les carateristique obtenu depuis la base de donnée
				// prel.setDate_Prel(resultat.getString("Date_Prel"));
				prel.setType_Prel(resultat.getString("Type_Prel"));
				prel.setOrigine_prel(resultat.getString("Origine_Prel"));
				prel.setTemp_prel(resultat.getFloat("Temperature_prel"));
				prel.setDate_Prel(resultat.getDate("Date_prel"));
				
				ArrayPrel.add(prel);

				// on ajoute ces caracteristiques dans un objet list l'objet suivi

			}

//			while (resultat.next()) {
//			
//			Patient.setNom(resultat.getString("Nom_Patient"));
//			Patient.setPrenom(resultat.getString("prenom_Patient"));
//			renvoiePatient.add(Patient);
//			return renvoiePatient;
			// }

			resultat.close();

		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
		// on retourne une array list
		return ArrayPrel;

	}
	
	
	

	public static Patient EnregistrementAnalysePatient(Analyse enregistrement) {

		// on récupére le num prelevement via le getter de notre objet enregistrement.
		int NumAnalyse = enregistrement.getNum_Analyse();

		// on crée une arraylist qui prend en paramétre l'objet prelevement

		// ArrayList<Prelevement> enregistrementPrel= new ArrayList<Prelevement>();
		// ArrayList<Patient> renvoiePatient= new ArrayList<Patient>();
		// instanciation des objets patients et prelevemnt
		// Prelevement prel = new Prelevement();
		Patient Patient = new Patient();

		try {
			// on fait une requete SQL avec le contenu de l'objet prelevement NUM_Prel
			Statement instruction3 = conn3.createStatement();

			String SQL = "Select * from patient NATURAL JOIN analyse where num_ana='" + NumAnalyse
					+ "' and patient.num_patient=analyse.num_patient;";

			ResultSet resultat = instruction3.executeQuery(SQL);

			while (resultat.next()) {

				Patient.setNom(resultat.getString("Nom_Patient"));
				Patient.setPrenom(resultat.getString("prenom_Patient"));
				
			}

			resultat.close();

		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
		// on retourne une array list
		return Patient;

	}

	
	
	public static Patient EnregistrementAnalysePatientPop(Analyse enregistrement) {

		// on récupére le num prelevement via le getter de notre objet enregistrement.
		int NumAnalyse = enregistrement.getNum_Analyse();

		// on crée une arraylist qui prend en paramétre l'objet prelevement

		// ArrayList<Prelevement> enregistrementPrel= new ArrayList<Prelevement>();
		// ArrayList<Patient> renvoiePatient= new ArrayList<Patient>();
		// instanciation des objets patients et prelevemnt
		// Prelevement prel = new Prelevement();
		Patient Patient = new Patient();
		
		try {
			// on fait une requete SQL avec le contenu de l'objet prelevement NUM_Prel
			Statement instruction3 = conn3.createStatement();

			String SQL = "Select num_ana, num_prelevement, nom_patient, prenom_patient, date_naissance_patient, sexe_patient from analyse NATURAL JOIN prelevement, patient where num_ana="+ NumAnalyse; 
			         
			
			ResultSet resultat = instruction3.executeQuery(SQL);
			
			
			
			while (resultat.next()) {

				Patient.setNom(resultat.getString("Nom_Patient"));
				Patient.setPrenom(resultat.getString("prenom_Patient"));
				Patient.setSexe(resultat.getString("sexe_patient"));
				Patient.setDateNaissance(resultat.getDate("Date_naissance_Patient"));
				Patient.setMutuelle(resultat.getInt("num_prelevement"));
				
			}

			resultat.close();

		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
		// on retourne une array list
		return Patient;

	}
	
	public void  erengistrementNonConf(NonConform nconf) {
		

		try {

			PreparedStatement prepareStatement = conn3.prepareStatement("insert into  conformitetable(Impact_Conf, Num_Emetteur,Commentaire_CONF,Gravite_Conf,num_prelevement)values(?,?,?,?,?)");
			prepareStatement.setString(1,nconf.getImpact());
			prepareStatement.setString(2, nconf.getN_emeteur());
			prepareStatement.setString(3, nconf.getCommentaire());
			prepareStatement.setString(4, nconf.getGravite());
			prepareStatement.setInt(5, nconf.getN_prelevement());
			
			
			prepareStatement.executeUpdate();

		} catch (SQLException ex) {

			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ((SQLException) ex).getMessage());
			System.out.println("VendorError:" + ((SQLException) ex).getErrorCode());

		}

	
	}
}
