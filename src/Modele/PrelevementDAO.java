package Modele;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PrelevementDAO {

	private static Connection conn2;


	public PrelevementDAO() throws ClassNotFoundException, IOException, SQLException {
		// je me connecte la la base de donnée
		conn2 = ConnexionBDD.getConnection();
	
		}
	


	// méthode qui prend en paramétre notre prélévement
	public static ArrayList<Prelevement> PrelvementDAO(Prelevement Suivi) {
		
		//on récupére le num prelevement via le getter de notre objet suivi.
			int NumPrelement = Suivi.getNum_prel();
			//on crée une arraylist qui prend en paramétre l'objet prelevement
			ArrayList<Prelevement> SuiviList= new ArrayList<Prelevement>();
		
			try {	
			// on fait une requete SQL avec le contenu de l'objet prelevement NUM_Prel
			Statement instruction2 = conn2.createStatement();
					
			String SQL = "Select * from prelevement where num_prelevement= '" + NumPrelement + "' ";
			
			ResultSet resultat = instruction2.executeQuery(SQL);
		
			while (resultat.next()) {
				// attribue dans notre objet les carateristique obtenu depuis la base de donnée
				Suivi.setComm_prel(resultat.getString("Commentaire_prel"));
				Suivi.setType_Prel(resultat.getString("Type_Prel"));
				Suivi.setOrigine_prel(resultat.getString("Origine_Prel"));
				Suivi.setTemp_prel(resultat.getFloat("Temperature_prel"));
				
				//on ajoute ces caracteristiques dans un objet list l'objet suivi
				SuiviList.add(Suivi);
				
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
