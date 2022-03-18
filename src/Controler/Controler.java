package Controler;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Modele.Analyse;
import Modele.AnalyseDAO;
import Modele.LoginDAO;
import Modele.LoginModel;
import Modele.NonConform;
import Modele.Patient;
import Modele.Prelevement;
import Modele.PrelevementDAO;
import vieuw.ApplicationView;
import vieuw.ApplicationView2;
import vieuw.LoginView;
import vieuw.popUp;

public class Controler {

	private LoginDAO loginDao;
	private static PrelevementDAO PrelevementDAO;
	private static AnalyseDAO analyseDAO;
	private static LoginView vue;
	private LoginModel infoModel;
	private static String login = null;
	private static String motDePasse = null;
	private static String NumAnalyse;
	private static String NumMalletteEntered;
	private static String NumPrelevementEntered;
	// private static MenuPrincipal MenuPrincipal;
	private static ApplicationView2 ApplicationView;
	private static ArrayList<Prelevement> List = null;
	private static popUp popup1;
	private NonConform nComf;
	private static ArrayList<NonConform> List2 = null;

	public Controler(LoginView vue, popUp popup1) throws ClassNotFoundException, IOException, SQLException {
		Controler.vue = vue;
		this.popup1 = popup1;
		this.loginDao = new LoginDAO();
		ActionUSers();

	}

//	public Controler(MenuPrincipal MenuPrincipal) throws ClassNotFoundException, IOException, SQLException {		
//		Controler.MenuPrincipal = MenuPrincipal;
//		this.analyseDAO = new AnalyseDAO();
//	//	ActionEnregistrementMallette();	
//		ActionEnregistrementNumAnalyse();
//		
//
//	}

	public Controler(ApplicationView2 ApplicationView) throws ClassNotFoundException, IOException, SQLException {
		Controler.ApplicationView = ApplicationView;
		this.PrelevementDAO = new PrelevementDAO();
		this.analyseDAO = new AnalyseDAO();

		System.out.println("tu es dans le controleur");
		ActionEnregistrementMallette();
		ActionEnregistrementNumAnalyse();
		AffichageSuiviTracabilite();
		AffichageSuiviTracabilite2();
		Anana();
		vldConf();
	}

	private static void Anana() {

		popup1.getNumAnaConf().addActionListener(ActionEvent -> ValidConformite());
	}

	private void vldConf() {

		popup1.getBtnVldNonConf().addActionListener(ActionEvent -> envoiNconfor());
		System.out.println("bisou");
	}

	private static void ActionUSers() {

		LoginView.getBtnNewButton().addActionListener(ActionEvent -> compareLogin());

	}

	private static void ActionEnregistrementMallette() {
		/*
		 * Methode permettant de lancer une action sur le num_mallette en appuyant la
		 * touche entrer
		 */
		ApplicationView.getnumMalletteEntrer().addActionListener(ActionEvent -> EnregistrementMallette());

	}

	private static void ActionEnregistrementNumAnalyse() {
		/*
		 * Methode permettant de lancer une action sur le num_mallette en appuyant la
		 * touche entrer
		 */
		// enregistrement.getNumAnalyseMenuPrincipal().addActionListener(ActionEvent ->
		// EnregistrementNumAnalyse());
		ApplicationView.getNumAnalyseMenuPrincipal().addActionListener(ActionEvent -> EnregistrementNumAnalyse());

	}

	private static void AffichageSuiviTracabilite() {

		ApplicationView.getSuiviePreSui().addActionListener(ActionEvent -> SuiviTracabilite());
		
	}
	
	private static void AffichageSuiviTracabilite2() {
		ApplicationView.getNPatientSuivi().addActionListener(ActionEvent -> SuiviTracabiliteNumPatient());
	}
	
	private static void compareLogin() {

		boolean connexion = false;
		int accumulation = 0;

		login = LoginView.getTxtLogin().getText();
		System.out.println(login);
		motDePasse = LoginView.getPasswordField().getText();
		System.out.println(motDePasse);

		while (connexion == false) {

			if (login.equals("") || motDePasse.equals("")) {
				LoginView.getButtonStatusConnect().setText("Remplissez les champs SVP");
				connexion = false;
				break;
			}

			if (LoginDAO.loginUsers(login, motDePasse) == true) {

				LoginView.getButtonStatusConnect().setText("Connexion OK");

				vue.getFrame().setVisible(false);

				ApplicationView2.getFrame().setVisible(true);

				// ApplicationView.getFrame().setVisible(true);

				connexion = true;
				break;

			} else if (LoginDAO.loginUsers(login, motDePasse) == false) {

				connexion = false;
				LoginView.getButtonStatusConnect().setText("Mauvais Login ou Mot de passe");
				break;

			}
		}

	}

	private static void EnregistrementMallette() {

		// enregistrement de la variable code barre;
		NumMalletteEntered = ApplicationView.getnumMalletteEntrer().getText();
		int NumMalletteEnteredint = Integer.parseInt(NumMalletteEntered);

		Analyse Analyse = new Analyse();
		// je recupe le numéros de mallette;
		Analyse.setNum_Mallette(NumMalletteEnteredint);

		ApplicationView.getNumMalletteMenuEnregistrement().setText(NumMalletteEntered);

		int numMalletteConnu = Analyse.getNum_Mallette();
		System.out.println(numMalletteConnu);

		// rend le Jlabel non editable le temps de remplissage de la mallette.
		if (numMalletteConnu != 0) {

			ApplicationView.getNumMalletteMenuEnregistrement().setEnabled(false);
			ApplicationView.getNumMalletteEntrer().setEnabled(false);
		} else {
			ApplicationView.getNumMalletteMenuEnregistrement().setEditable(true);
		}

		// setAffichagCodeBarre

		// NumAnalyse = enregistrement.getNumAnalyseMenuPrincipal().getText();
//		int NumAnalyseInt =  Integer.parseInt(NumAnalyse);
//		NumPrelevementEntered = enregistrement.getTxtNDePrlvement().getText();
//		int NumPrelevementint = Integer.parseInt(NumPrelevementEntered);
//		
//		Analyse Enregistrement1 = new Analyse();
//		
//		Enregistrement1.setNum_Analyse(NumAnalyseInt);
//		Enregistrement1.setNum_Prelevement(NumPrelevementint);
//		Enregistrement1.setNum_Mallette(NumMalletteEnteredint);
//		
//		LoginDAO.AjouterEnregistrement(Enregistrement1);

	}

	private static void EnregistrementNumAnalyse() {

		String EnregistrementNumAnalyse_string = ApplicationView.getNumAnalyseMenuPrincipal().getText();

		int EnregistrementNumAnalyse_int = Integer.parseInt(EnregistrementNumAnalyse_string);

		Analyse analyse = new Analyse();
		analyse.setNum_Analyse(EnregistrementNumAnalyse_int);

		Prelevement prel = AnalyseDAO.EnregistrementAnalysePrelevement(analyse);

		ArrayList<Prelevement> prelList = new ArrayList<Prelevement>();
		prelList = AnalyseDAO.RevnoieListPrel(analyse);

		Patient Patient = AnalyseDAO.EnregistrementAnalysePatient(analyse);

		ApplicationView.gettxttypePrel().setText(prel.getType_Prel());
		ApplicationView.gettxtNom().setText(Patient.getNom());
		ApplicationView.getPrenomAffichage().setText(Patient.getPrenom());

		ApplicationView.getList_2().setListData(prelList.toArray());

	}

	private static void SuiviTracabilite() {

		// recuperation dans la vue de notre code prélévement
		String NumSuivi = ApplicationView.getSuiviePreSui().getText();
		// on change le String en Interger
		int NumSuiviInt = Integer.parseInt(NumSuivi);

		// on crée une instance de notre objet prélevement
		Prelevement Prelevement = new Prelevement();
		// on attribue à l'objet prélévement la valeur Num_prelevment
		Prelevement.setNum_prel(NumSuiviInt);

		// crée une liste a partir de la commande SQL dans DAP qui prend
		// paramétre l'objet prélévement;
		ArrayList<Prelevement> List = PrelevementDAO.PrelvementDAO(Prelevement);
		

		// on affiche dans la vue la LISTE et on ajoute le contenu de la
		// liste dans la liste;

		ApplicationView.getListSuivitracabilit().setListData(List.toArray());

	}
	
	private static void SuiviTracabiliteNumPatient() {
		String numPatientSuivi= ApplicationView.getNPatientSuivi().getText();
		int numPatientSuiviInt= Integer.parseInt(numPatientSuivi);
		Prelevement Prelevement= new Prelevement();
		ArrayList<Prelevement> List2=PrelevementDAO.PrelvementDAO(Prelevement);
		ApplicationView.getListSuivitracabilit().setListData(List2.toArray());
	}

	private static void ValidConformite() {

		String nAnalyse = popup1.getNumAnaConf().getText();
		int nAnalyse_int = Integer.parseInt(nAnalyse);

		Analyse analyse = new Analyse();
		analyse.setNum_Analyse(nAnalyse_int);

		Prelevement prel = AnalyseDAO.EnregistrementAnalysePrelevement(analyse);

		ArrayList<Prelevement> prelList = new ArrayList<Prelevement>();
		prelList = AnalyseDAO.RevnoieListPrel(analyse);

		Patient Patient = AnalyseDAO.EnregistrementAnalysePatientPop(analyse);

		int Nprel = Patient.getMutuelle();
		String B;
		B = String.valueOf(Nprel);

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateToStr = dateFormat.format(Patient.getDateNaissance());

		popup1.getNom().setText(Patient.getNom());
		popup1.getPrenom().setText(Patient.getPrenom());
		popup1.getGenre().setText(Patient.getSexe());
		popup1.getDate().setText(dateToStr);
		popup1.getTextPrel().setText(B);

	}

	public void envoiNconfor() {

		String Com = popup1.getTextField().getText();
		String Emeteur = popup1.getTextField_1().getText();
	//	String imp = popup1.getComboBoYes().getActionCommand();
		//String gra = popup1.getComboBoYes_1().getActionCommand();
		String Nprel = popup1.getTextPrel().getText();

		int b;
		b = Integer.parseInt(Nprel);

		nComf = new NonConform();
		nComf.setCommentaire(Com);
		nComf.setN_emeteur(Emeteur);
	//	nComf.setImpact(imp);
		//nComf.setGravite(gra);
		nComf.setN_prelevement(b);

		analyseDAO.erengistrementNonConf(nComf);
	}

}
