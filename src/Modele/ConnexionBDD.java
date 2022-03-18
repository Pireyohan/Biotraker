package Modele;
import java.io.*;
import java.sql.*;
import java.util.*;

public class ConnexionBDD {

	
	private static Connection connexion =null;
			

	public ConnexionBDD() throws IOException, SQLException, ClassNotFoundException {
		
		try {
			InputStream input = new FileInputStream("config/db.properties");
			Properties prop = new Properties();
			
			prop.load(input);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			Class.forName(driver);
			connexion = DriverManager.getConnection(url, user, password);
			System.out.println("connexion OK babe");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

	  // Créer ou retourner une connexion
		public static Connection getConnection() throws ClassNotFoundException, IOException, SQLException {
			if (connexion == null) {
				new ConnexionBDD();
			}
			return connexion;
		}

		// Fermer la connexion à la base de donnée
		public static void stop() {
			if (connexion != null) {
				try {
					connexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		

}

