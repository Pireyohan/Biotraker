package Modele;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	private static Connection conn;
	private static String loginBDD = null;
	private static String mot_de_passeBDD;

	public LoginDAO() throws ClassNotFoundException, IOException, SQLException {
		
		conn = ConnexionBDD.getConnection();
	
		}
	


	public static boolean loginUsers(String login, String motDePasse) {
		System.out.println("check");

		try {

			Statement instruction = conn.createStatement();
			String SQL = "Select login, M_passe_User from users where login = '" + login + "' and M_passe_User =  '"
					+ motDePasse + "'";
	
					
			ResultSet resultat = instruction.executeQuery(SQL);

			while (resultat.next()) {
				
				loginBDD = resultat.getString("login");
		
				mot_de_passeBDD = resultat.getString("M_passe_User");
		

			}
			
			if (login.equals(loginBDD) && motDePasse.equals(mot_de_passeBDD)){
				System.out.println("est good");
				return true;
				
			}
			else if (!login.equals(loginBDD) ||  motDePasse.equals(mot_de_passeBDD)){
				return false;
			}
			resultat.close();
			


		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
		return false;

	}

	public static String getLogin() {
		return loginBDD;
	}

	public static String getMot_de_passe() {
		return mot_de_passeBDD;
	}

	
public static boolean AjouterEnregistrement(Analyse analyse ) {
		
		

		try {
			
		
			Statement instruction = conn.createStatement();
			
			int analyseLocal = analyse.getNum_Analyse();
			System.out.println(analyseLocal);
			
			String SQL = "Select Nom_patient, type_prel from Analyse a, prelevement p, Patient pt where a.num_ana=p.num_ana and pt.num_patient=a.num_patient and Num_Ana='analyseLocal' ";
			ResultSet resultat = instruction.executeQuery(SQL);

			while (resultat.next()) {
				
			String Patient = resultat.getString("Nom_patient");
			String Prelevement = resultat.getString("type_prel");
			
			Patient patient = new Patient();
			Prelevement prl = new Prelevement();
			
			patient.setNom(Patient);
			prl.setType_Prel(Prelevement);
		
			}
			
			resultat.close();
			


		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendoError: " + ((SQLException) ex).getErrorCode());
		}
		return false;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
