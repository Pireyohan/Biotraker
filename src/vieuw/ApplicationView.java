package vieuw;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JList;
import com.toedter.calendar.JCalendar;
import java.awt.SystemColor;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.*;

import javax.swing.JSeparator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ApplicationView {

	private JFrame frame;

	private JTextField TxNPatient;
	private JTextField TxCodeBarre;
	private JTextField TxSitePrel;
	private JTextField TxIdCoursier;
	private JTextField TxTemp;
	private static JTextField TxSuiviPrelevements;

	private JComboBox<String> listeOrigine;
	private Object[] elementsSelection;

	private JLabel lblTPrel;
	private JLabel lblNPatient;
	private JLabel lblDtePrel;
	private JLabel lblCodeBarreLalette;
	private JLabel lblSiteDePrlvement;
	private JLabel lblIdentifiantCouriser;
	private JLabel lblTemprature;
	private JLabel lblSuiviPrlvemenbts;

	private JList list;
	private JCalendar calendarPrel;
	private JPanel panelSearch;
	private ImageIcon icone;

	


	/**
	 * Create the application.
	 */
	public ApplicationView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @param data 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 1169, 752);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNPatient = new JLabel(" N\u00B0Patient");
		lblNPatient.setBounds(20, 161, 117, 23);
		lblNPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNPatient);

		TxNPatient = new JTextField();
		TxNPatient.setBounds(20, 183, 190, 32);
		frame.getContentPane().add(TxNPatient);
		TxNPatient.setColumns(10);

		lblDtePrel = new JLabel("Date de pr\u00E9l\u00E8vement");
		lblDtePrel.setBounds(20, 225, 200, 39);
		lblDtePrel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblDtePrel);

		lblTPrel = new JLabel("Type de prelevement ");
		lblTPrel.setBounds(20, 412, 218, 47);
		lblTPrel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblTPrel);
		/***********************
		 * Menu d�roulant pour s�lectionner les types de pr�l�vements
		 *************************/
		elementsSelection = new Object[] { "Muqueux", "Cutan�s", "Mycobact�ries", "Expectoration", "Sang",
				"H�mocultures", "Sph�re ORL", "Urines", "Autres" };
		listeOrigine = new JComboBox(elementsSelection);
		listeOrigine.setBounds(20, 451, 190, 39);
		listeOrigine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(listeOrigine);
		/**********************************************************************************************************************************/
		TxCodeBarre = new JTextField();
		TxCodeBarre.setBounds(20, 521, 167, 29);
		TxCodeBarre.setColumns(10);
		frame.getContentPane().add(TxCodeBarre);

		lblCodeBarreLalette = new JLabel("Code barre malette");
		lblCodeBarreLalette.setBounds(20, 500, 190, 23);
		lblCodeBarreLalette.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblCodeBarreLalette);

		lblSiteDePrlvement = new JLabel("Site de pr\u00E9l\u00E8vement");
		lblSiteDePrlvement.setBounds(20, 560, 190, 23);
		lblSiteDePrlvement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblSiteDePrlvement);

		TxSitePrel = new JTextField();
		TxSitePrel.setBounds(20, 582, 167, 29);
		TxSitePrel.setColumns(10);
		frame.getContentPane().add(TxSitePrel);

		lblIdentifiantCouriser = new JLabel("Identifiant coursier");
		lblIdentifiantCouriser.setBounds(20, 620, 190, 23);
		lblIdentifiantCouriser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblIdentifiantCouriser);

		TxIdCoursier = new JTextField();
		TxIdCoursier.setBounds(20, 641, 167, 29);
		TxIdCoursier.setColumns(10);
		frame.getContentPane().add(TxIdCoursier);

		lblTemprature = new JLabel("Temp\u00E9rature");
		lblTemprature.setBounds(20, 680, 190, 23);
		lblTemprature.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblTemprature);

		TxTemp = new JTextField();
		TxTemp.setBounds(151, 683, 87, 25);
		TxTemp.setColumns(10);
		frame.getContentPane().add(TxTemp);

		lblSuiviPrlvemenbts = new JLabel("Suivi pr\u00E9l\u00E8vements");
		lblSuiviPrlvemenbts.setBounds(360, 142, 228, 23);
		lblSuiviPrlvemenbts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblSuiviPrlvemenbts);

		list = new JList();
		list.setBorder(BorderFactory.createTitledBorder("Suivi tra�abilit� :"));
		list.setBounds(266, 214, 879, 491);
		frame.getContentPane().add(list);

		panelSearch = new JPanel();
		panelSearch.setBorder(BorderFactory.createTitledBorder("Recherche :"));
		panelSearch.setBounds(10, 142, 238, 573);
		frame.getContentPane().add(panelSearch);
		panelSearch.setLayout(null);

		calendarPrel = new JCalendar();
		calendarPrel.setBounds(10, 124, 213, 152);
		panelSearch.add(calendarPrel);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 127, 1096, 2);
		frame.getContentPane().add(separator);

		TxSuiviPrelevements = new JTextField();
		TxSuiviPrelevements.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		TxSuiviPrelevements.setBounds(359, 165, 218, 39);
		TxSuiviPrelevements.setColumns(10);

		frame.getContentPane().add(TxSuiviPrelevements);




/************************************************************************/
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxNPatient() {
		return TxNPatient;
	}

	public void setTxNPatient(JTextField txNPatient) {
		TxNPatient = txNPatient;
	}
	
	public JTextField getTxCodeBarre() {
		return TxCodeBarre;
	}

	public void setTxCodeBarre(JTextField txCodeBarre) {
		TxCodeBarre = txCodeBarre;
	}

	public JTextField getTxSitePrel() {
		return TxSitePrel;
	}

	public void setTxSitePrel(JTextField txSitePrel) {
		TxSitePrel = txSitePrel;
	}

	public JTextField getTxIdCoursier() {
		return TxIdCoursier;
	}

	public void setTxIdCoursier(JTextField txIdCoursier) {
		TxIdCoursier = txIdCoursier;
	}

	public JTextField getTxTemp() {
		return TxTemp;
	}

	public void setTxTemp(JTextField txTemp) {
		TxTemp = txTemp;
	}

	public static JTextField getTxSuiviPrelevements() {
		return TxSuiviPrelevements;
	}

	public void setTxSuiviPrelevements(JTextField txSuiviPrelevements) {
		TxSuiviPrelevements = txSuiviPrelevements;
	}

	public JComboBox<String> getListeOrigine() {
		return listeOrigine;
	}

	public void setListeOrigine(JComboBox<String> listeOrigine) {
		this.listeOrigine = listeOrigine;
	}

	public Object[] getElementsSelection() {
		return elementsSelection;
	}

	public void setElementsSelection(Object[] elementsSelection) {
		this.elementsSelection = elementsSelection;
	}

	public JLabel getLblTPrel() {
		return lblTPrel;
	}

	public void setLblTPrel(JLabel lblTPrel) {
		this.lblTPrel = lblTPrel;
	}

	public JLabel getLblNPatient() {
		return lblNPatient;
	}

	public void setLblNPatient(JLabel lblNPatient) {
		this.lblNPatient = lblNPatient;
	}

	public JLabel getLblDtePrel() {
		return lblDtePrel;
	}

	public void setLblDtePrel(JLabel lblDtePrel) {
		this.lblDtePrel = lblDtePrel;
	}

	public JLabel getLblCodeBarreLalette() {
		return lblCodeBarreLalette;
	}

	public void setLblCodeBarreLalette(JLabel lblCodeBarreLalette) {
		this.lblCodeBarreLalette = lblCodeBarreLalette;
	}

	public JLabel getLblSiteDePrlvement() {
		return lblSiteDePrlvement;
	}

	public void setLblSiteDePrlvement(JLabel lblSiteDePrlvement) {
		this.lblSiteDePrlvement = lblSiteDePrlvement;
	}

	public JLabel getLblIdentifiantCouriser() {
		return lblIdentifiantCouriser;
	}

	public void setLblIdentifiantCouriser(JLabel lblIdentifiantCouriser) {
		this.lblIdentifiantCouriser = lblIdentifiantCouriser;
	}

	public JLabel getLblTemprature() {
		return lblTemprature;
	}

	public void setLblTemprature(JLabel lblTemprature) {
		this.lblTemprature = lblTemprature;
	}

	public JLabel getLblSuiviPrlvemenbts() {
		return lblSuiviPrlvemenbts;
	}

	public void setLblSuiviPrlvemenbts(JLabel lblSuiviPrlvemenbts) {
		this.lblSuiviPrlvemenbts = lblSuiviPrlvemenbts;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JCalendar getCalendarPrel() {
		return calendarPrel;
	}

	public void setCalendarPrel(JCalendar calendarPrel) {
		this.calendarPrel = calendarPrel;
	}
}