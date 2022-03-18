package Modele;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PatientDAO {
	private static Connection conn3;


	public PatientDAO() throws ClassNotFoundException, IOException, SQLException {
		// je me connecte la la base de donnée
		conn3 = ConnexionBDD.getConnection();
	
		}
	


	// méthode qui prend en paramétre notre prélévement
	public static ArrayList<Patient> PatientDAOFiltreNumPatient(Patient NumPatient) {
		
		//on récupére le num prelevement via le getter de notre objet suivi.
			int NumPatient2 = NumPatient.getNum_patient();
			//on crée une arraylist qui prend en paramétre l'objet prelevement
			ArrayList<Patient> SuiviList= new ArrayList<Patient>();
			System.out.println("bfggbfbgf " + NumPatient2);
		
			try {	
			// on fait une requete SQL avec le contenu de l'objet prelevement NUM_Prel
			Statement instruction3 = conn3.createStatement();
			
			String SQL = "Select * from patient where num_patient='"+NumPatient2+"'";
			
			ResultSet resultat = instruction3.executeQuery(SQL);
			
			while (resultat.next()) {
				// attribue dans notre objet les carateristique obtenu depuis la base de donnée
				NumPatient.setNom(resultat.getString("Nom_Patient"));
				NumPatient.setPrenom(resultat.getString("prenom_Patient"));
				NumPatient.setDateNaissance(resultat.getDate("Date_naissance_Patient"));
				NumPatient.setSexe(resultat.getString("Sexe_Patient"));
				
				//on ajoute ces caracteristiques dans un objet list l'objet suivi
				SuiviList.add(NumPatient);
				
			}

	
			
			resultat.close();
			

		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
			// on retourne une array list
			return SuiviList;
	}
	
}
