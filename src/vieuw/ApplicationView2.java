package vieuw;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import com.toedter.components.JLocaleChooser;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApplicationView2 {
	
	
	
	private static JFrame frameMenu;
	private Object[] elementsSelection;
	private ImageIcon icone;
	private JTextField NPatientSuivi;
	private JTextField CodebarSuivi;
	private JTextField textFieldSitePreleSuivi;
	private JTextField textFieldIdCoursSuivi;
	private JTextField textFieldTemperaturSuivi;
	private JTextField SuiviePreSui;
	private JTextField numpaConfo;
	private JTextField TemperaturConf;
	private JTextField IdCoursConf;
	private JTextField SitePrelConf;
	private JTextField CodeBMallConf;
	private JTextField NonconfoPreAna;
	private JTextField ConforPréana;
	private JTextField ConfoAna;
	private JTextField NonConfAna;
	private JTextField ConfoPostAna;
	private JTextField NconfPost;
	private JTextField NumMalletteMenuEnregistrement;
	private JTextField textField_1;
	private JTextField numMalletteEntrer;
	private JTextField NumAnalyseMenuPrincipal;
	private JTextField textField_4;
	private JTextField txttypePrel;
	private JTextField txtNom;
	private JList ListSuivitracabilit ;
	private JList list_2;
	private JTextField PrenomAffichage;
	popUp pop1;
	


	/**
	 * Create the application.
	 */
	public ApplicationView2( popUp pop1) {
		this.pop1= pop1;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @param data 
	 */
	private void initialize() {
		frameMenu = new JFrame();
		frameMenu.getContentPane().setBackground(SystemColor.activeCaption);
		frameMenu.setBounds(100, 100, 1169, 752);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 85, 1133, 617);
		frameMenu.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("suivie", null, panel, null);
		panel.setLayout(null);
		
		JPanel panelSearch = new JPanel();
		panelSearch.setBounds(563, 243, -335, -237);
		panelSearch.setLayout(null);
		panelSearch.setBorder(BorderFactory.createTitledBorder("Recherche :"));
		panel.add(panelSearch);
		
		JCalendar calendarPrel = new JCalendar();
		calendarPrel.setBounds(10, 124, 213, 152);
		panelSearch.add(calendarPrel);
		
		JLabel lblNPatient = new JLabel(" N\u00B0Patient");
		lblNPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNPatient.setBounds(10, 11, 117, 23);
		panel.add(lblNPatient);
		
		NPatientSuivi = new JTextField();
		NPatientSuivi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		NPatientSuivi.setColumns(10);
		NPatientSuivi.setBounds(10, 33, 190, 32);
		panel.add(NPatientSuivi);
		
		JLabel lblTPrelSuivi = new JLabel("Type de prelevement ");
		lblTPrelSuivi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTPrelSuivi.setBounds(10, 282, 218, 47);
		panel.add(lblTPrelSuivi);
		
		JComboBox<String> listeOrigineSuivi = new JComboBox(new Object[]{});
		listeOrigineSuivi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		listeOrigineSuivi.setBounds(10, 321, 190, 39);
		panel.add(listeOrigineSuivi);
		
		JLabel lblCodeBarreLaletteSuivi = new JLabel("Code barre malette");
		lblCodeBarreLaletteSuivi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodeBarreLaletteSuivi.setBounds(10, 370, 190, 23);
		panel.add(lblCodeBarreLaletteSuivi);
		
		CodebarSuivi = new JTextField();
		CodebarSuivi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		CodebarSuivi.setColumns(10);
		CodebarSuivi.setBounds(10, 391, 190, 29);
		panel.add(CodebarSuivi);
		
		JLabel lblSiteDePrlvementSuivi = new JLabel("Site de pr\u00E9l\u00E8vement");
		lblSiteDePrlvementSuivi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSiteDePrlvementSuivi.setBounds(10, 430, 190, 23);
		panel.add(lblSiteDePrlvementSuivi);
		
		textFieldSitePreleSuivi = new JTextField();
		textFieldSitePreleSuivi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		textFieldSitePreleSuivi.setColumns(10);
		textFieldSitePreleSuivi.setBounds(10, 452, 190, 29);
		panel.add(textFieldSitePreleSuivi);
		
		JLabel lblIdentifiantCouriser = new JLabel("Identifiant couriser");
		lblIdentifiantCouriser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdentifiantCouriser.setBounds(10, 490, 190, 23);
		panel.add(lblIdentifiantCouriser);
		
		textFieldIdCoursSuivi = new JTextField();
		textFieldIdCoursSuivi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		textFieldIdCoursSuivi.setColumns(10);
		textFieldIdCoursSuivi.setBounds(10, 511, 190, 29);
		panel.add(textFieldIdCoursSuivi);
		
		JLabel lblTemprature = new JLabel("Temp\u00E9rature");
		lblTemprature.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTemprature.setBounds(10, 550, 121, 23);
		panel.add(lblTemprature);
		
		textFieldTemperaturSuivi = new JTextField();
		textFieldTemperaturSuivi.setColumns(10);
		textFieldTemperaturSuivi.setBounds(141, 553, 59, 25);
		panel.add(textFieldTemperaturSuivi);
		
		JLabel lblDtePrel = new JLabel("Date de pr\u00E9l\u00E8vement");
		lblDtePrel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDtePrel.setBounds(10, 76, 200, 39);
		panel.add(lblDtePrel);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 128, 205, 153);
		panel.add(calendar);
		
		ListSuivitracabilit = new JList();
		ListSuivitracabilit.setBorder(BorderFactory.createTitledBorder("Suivi traçabilité :"));
		ListSuivitracabilit.setBounds(238, 82, 879, 491);
		panel.add(ListSuivitracabilit);
		
		JLabel lblSuiviPrlvemenbts = new JLabel("Suivi pr\u00E9l\u00E8vements");
		lblSuiviPrlvemenbts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuiviPrlvemenbts.setBounds(290, 11, 228, 23);
		panel.add(lblSuiviPrlvemenbts);
		
		SuiviePreSui = new JTextField();
		SuiviePreSui.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		SuiviePreSui.setColumns(10);
		SuiviePreSui.setBounds(289, 30, 218, 39);
		panel.add(SuiviePreSui);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Conformité", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNPatient_1 = new JLabel(" N\u00B0Patient");
		lblNPatient_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNPatient_1.setBounds(10, 11, 117, 23);
		panel_2.add(lblNPatient_1);
		
		numpaConfo = new JTextField();
		numpaConfo.setColumns(10);
		numpaConfo.setBounds(10, 33, 190, 32);
		panel_2.add(numpaConfo);
		
		JLabel lblDtePrel_1 = new JLabel("Date de pr\u00E9l\u00E8vement");
		lblDtePrel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDtePrel_1.setBounds(10, 88, 200, 39);
		panel_2.add(lblDtePrel_1);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(5, 126, 205, 153);
		panel_2.add(calendar_1);
		
		JLabel lblTemprature_1 = new JLabel("Temp\u00E9rature");
		lblTemprature_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTemprature_1.setBounds(10, 550, 117, 23);
		panel_2.add(lblTemprature_1);
		
		TemperaturConf = new JTextField();
		TemperaturConf.setColumns(10);
		TemperaturConf.setBounds(137, 553, 58, 25);
		panel_2.add(TemperaturConf);
		
		IdCoursConf = new JTextField();
		IdCoursConf.setColumns(10);
		IdCoursConf.setBounds(10, 511, 185, 29);
		panel_2.add(IdCoursConf);
		
		JLabel lblIdentifiantCouriser_1 = new JLabel("Identifiant couriser");
		lblIdentifiantCouriser_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdentifiantCouriser_1.setBounds(10, 490, 190, 23);
		panel_2.add(lblIdentifiantCouriser_1);
		
		SitePrelConf = new JTextField();
		SitePrelConf.setColumns(10);
		SitePrelConf.setBounds(10, 452, 185, 29);
		panel_2.add(SitePrelConf);
		
		JLabel lblSiteDePrlvement_1 = new JLabel("Site de pr\u00E9l\u00E8vement");
		lblSiteDePrlvement_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSiteDePrlvement_1.setBounds(10, 430, 190, 23);
		panel_2.add(lblSiteDePrlvement_1);
		
		CodeBMallConf = new JTextField();
		CodeBMallConf.setColumns(10);
		CodeBMallConf.setBounds(10, 391, 185, 29);
		panel_2.add(CodeBMallConf);
		
		JLabel lblCodeBarreLalette_1 = new JLabel("Code barre malette");
		lblCodeBarreLalette_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodeBarreLalette_1.setBounds(10, 370, 190, 23);
		panel_2.add(lblCodeBarreLalette_1);
		
		JComboBox<String> listeOrigineConfor = new JComboBox(new Object[]{});
		listeOrigineConfor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		listeOrigineConfor.setBounds(5, 317, 190, 39);
		panel_2.add(listeOrigineConfor);
		
		JLabel lblTPrel_2_confo = new JLabel("Type de prelevement ");
		lblTPrel_2_confo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTPrel_2_confo.setBounds(5, 284, 195, 35);
		panel_2.add(lblTPrel_2_confo);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(239, 33, 879, 545);
		panel_2.add(tabbedPane_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("pré-analythique", null, panel_3, null);
		panel_3.setLayout(null);
		
		JList list_1_2 = new JList();
		list_1_2.setBounds(10, 74, 606, 432);
		panel_3.add(list_1_2);
		
		JLabel lblNPatient_1_1 = new JLabel("Non-conforme");
		lblNPatient_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNPatient_1_1.setBounds(10, 26, 91, 23);
		panel_3.add(lblNPatient_1_1);
		
		NonconfoPreAna = new JTextField();
		NonconfoPreAna.setEditable(false);
		NonconfoPreAna.setColumns(10);
		NonconfoPreAna.setBounds(111, 22, 55, 32);
		panel_3.add(NonconfoPreAna);
		
		ConforPréana = new JTextField();
		ConforPréana.setEditable(false);
		ConforPréana.setColumns(10);
		ConforPréana.setBounds(278, 22, 55, 32);
		panel_3.add(ConforPréana);
		
		JLabel lblNPatient_1_1_1 = new JLabel("Conforme");
		lblNPatient_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNPatient_1_1_1.setBounds(205, 26, 63, 23);
		panel_3.add(lblNPatient_1_1_1);
		
		JButton addPreAna = new JButton("Ajouter");
		addPreAna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pop1.getFrmDclarationDeNon().setVisible(true);
				
				
			}
		});
		addPreAna.setBounds(527, 27, 89, 23);
		panel_3.add(addPreAna);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("Analythique", null, panel_4, null);
		panel_4.setLayout(null);
		
		JList list_1_1 = new JList();
		list_1_1.setBounds(10, 78, 606, 428);
		panel_4.add(list_1_1);
		
		JLabel lblNPatient_1_1_1_1 = new JLabel("Conforme");
		lblNPatient_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNPatient_1_1_1_1.setBounds(205, 26, 63, 23);
		panel_4.add(lblNPatient_1_1_1_1);
		
		ConfoAna = new JTextField();
		ConfoAna.setEditable(false);
		ConfoAna.setColumns(10);
		ConfoAna.setBounds(278, 22, 55, 32);
		panel_4.add(ConfoAna);
		
		NonConfAna = new JTextField();
		NonConfAna.setEditable(false);
		NonConfAna.setColumns(10);
		NonConfAna.setBounds(111, 22, 55, 32);
		panel_4.add(NonConfAna);
		
		JLabel lblNPatient_1_1_2 = new JLabel("Non-conforme");
		lblNPatient_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNPatient_1_1_2.setBounds(10, 26, 91, 23);
		panel_4.add(lblNPatient_1_1_2);
		
		JButton AddAna = new JButton("Ajouter");
		AddAna.setBounds(527, 27, 89, 23);
		panel_4.add(AddAna);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("Post-analythique", null, panel_5, null);
		panel_5.setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(10, 83, 606, 423);
		panel_5.add(list_1);
		
		JLabel lblNPatient_1_1_1_2 = new JLabel("Conforme");
		lblNPatient_1_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNPatient_1_1_1_2.setBounds(205, 26, 63, 23);
		panel_5.add(lblNPatient_1_1_1_2);
		
		ConfoPostAna = new JTextField();
		ConfoPostAna.setEditable(false);
		ConfoPostAna.setColumns(10);
		ConfoPostAna.setBounds(278, 22, 55, 32);
		panel_5.add(ConfoPostAna);
		
		NconfPost = new JTextField();
		NconfPost.setEditable(false);
		NconfPost.setColumns(10);
		NconfPost.setBounds(111, 22, 55, 32);
		panel_5.add(NconfPost);
		
		JLabel lblNPatient_1_1_3 = new JLabel("Non-conforme");
		lblNPatient_1_1_3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNPatient_1_1_3.setBounds(10, 26, 91, 23);
		panel_5.add(lblNPatient_1_1_3);
		
		JButton AddPosAna = new JButton("Ajouter");
		AddPosAna.setBounds(556, 27, 89, 23);
		panel_5.add(AddPosAna);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("menu principal", null, panel_1, null);
		panel_1.setLayout(null);
		
		NumMalletteMenuEnregistrement = new JTextField();
		NumMalletteMenuEnregistrement.setBackground(Color.CYAN);
		NumMalletteMenuEnregistrement.setColumns(10);
		NumMalletteMenuEnregistrement.setBounds(29, 34, 148, 20);
		panel_1.add(NumMalletteMenuEnregistrement);
		
		JLabel lblDtePrel_2 = new JLabel("Date de prélèvement");
		lblDtePrel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDtePrel_2.setBounds(10, 55, 200, 39);
		panel_1.add(lblDtePrel_2);
		
		JLabel lblTPrel = new JLabel("Type de prelevement ");
		lblTPrel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTPrel.setBounds(10, 299, 218, 47);
		panel_1.add(lblTPrel);
		
		JComboBox listeOrigine = new JComboBox(new Object[]{});
		listeOrigine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		listeOrigine.setBounds(10, 338, 190, 39);
		panel_1.add(listeOrigine);
		
		JLabel lblCodeBarreLalette = new JLabel("Code barre malette");
		lblCodeBarreLalette.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodeBarreLalette.setBounds(10, 387, 190, 23);
		panel_1.add(lblCodeBarreLalette);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 408, 167, 29);
		panel_1.add(textField_1);
		
		JCalendar calendar_2 = new JCalendar();
		calendar_2.setBounds(10, 105, 205, 153);
		panel_1.add(calendar_2);
		
		numMalletteEntrer = new JTextField();
		numMalletteEntrer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		numMalletteEntrer.setHorizontalAlignment(SwingConstants.CENTER);
		numMalletteEntrer.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		numMalletteEntrer.setColumns(10);
		numMalletteEntrer.setBounds(293, 46, 123, 39);
		panel_1.add(numMalletteEntrer);
		
		NumAnalyseMenuPrincipal = new JTextField();
		NumAnalyseMenuPrincipal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		NumAnalyseMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		NumAnalyseMenuPrincipal.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		NumAnalyseMenuPrincipal.setColumns(10);
		NumAnalyseMenuPrincipal.setBounds(420, 46, 123, 39);
		panel_1.add(NumAnalyseMenuPrincipal);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(546, 46, 131, 39);
		panel_1.add(textField_4);
		
		txttypePrel = new JTextField();
		txttypePrel.setHorizontalAlignment(SwingConstants.CENTER);
		txttypePrel.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		txttypePrel.setColumns(10);
		txttypePrel.setBounds(293, 108, 123, 39);
		panel_1.add(txttypePrel);
		
		txtNom = new JTextField();
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		txtNom.setColumns(10);
		txtNom.setBounds(420, 108, 123, 39);
		panel_1.add(txtNom);
		
		JButton BouttonValEnregistrementTemporaire = new JButton("Enregistrement");
		BouttonValEnregistrementTemporaire.setBounds(295, 150, 121, 23);
		panel_1.add(BouttonValEnregistrementTemporaire);
		
		list_2 = new JList();
		list_2.setBorder(BorderFactory.createTitledBorder("Enregistrement des analyses :"));
		list_2.setBounds(238, 184, 880, 405);
		panel_1.add(list_2);
		
		JLabel lblDtePrel_2_1 = new JLabel("Mallette en cours\r\n");
		lblDtePrel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDtePrel_2_1.setBounds(10, 0, 200, 39);
		panel_1.add(lblDtePrel_2_1);
		
		JLabel lblDtePrel_2_1_1 = new JLabel("Mallette");
		lblDtePrel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDtePrel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDtePrel_2_1_1.setBounds(301, 15, 109, 39);
		panel_1.add(lblDtePrel_2_1_1);
		
		JLabel lblDtePrel_2_1_1_1 = new JLabel("N\u00B0 analyse");
		lblDtePrel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDtePrel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDtePrel_2_1_1_1.setBounds(420, 15, 123, 39);
		panel_1.add(lblDtePrel_2_1_1_1);
		
		JLabel lblDtePrel_2_1_1_1_1 = new JLabel("N\u00B0 Prelevement");
		lblDtePrel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDtePrel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDtePrel_2_1_1_1_1.setBounds(546, 16, 131, 39);
		panel_1.add(lblDtePrel_2_1_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(238, 181, 4000, 300);
		panel_1.add(separator);
		
		JLabel lblDtePrel_2_1_1_2 = new JLabel("Type Prelevement");
		lblDtePrel_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDtePrel_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDtePrel_2_1_1_2.setBounds(299, 76, 109, 39);
		panel_1.add(lblDtePrel_2_1_1_2);
		
		JLabel lblDtePrel_2_1_1_2_1 = new JLabel("Nom Patient\r\n");
		lblDtePrel_2_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDtePrel_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDtePrel_2_1_1_2_1.setBounds(430, 76, 109, 39);
		panel_1.add(lblDtePrel_2_1_1_2_1);
		
		PrenomAffichage = new JTextField();
		PrenomAffichage.setHorizontalAlignment(SwingConstants.CENTER);
		PrenomAffichage.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		PrenomAffichage.setColumns(10);
		PrenomAffichage.setBounds(553, 108, 123, 39);
		panel_1.add(PrenomAffichage);
		
		JLabel lblDtePrel_2_1_1_2_1_1 = new JLabel("Pr\u00E9nom Patient\r\n");
		lblDtePrel_2_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDtePrel_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDtePrel_2_1_1_2_1_1.setBounds(563, 76, 109, 39);
		panel_1.add(lblDtePrel_2_1_1_2_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Changer la Mallette");
		chckbxNewCheckBox.setBounds(385, 0, 158, 23);
		panel_1.add(chckbxNewCheckBox);
		/***********************
		 * Menu dï¿½roulant pour sï¿½lectionner les types de prï¿½lï¿½vements
		 *************************/
		elementsSelection = new Object[] { "Muqueux", "Cutanï¿½s", "Mycobactï¿½ries", "Expectoration", "Sang",
				"Hï¿½mocultures", "Sphï¿½re ORL", "Urines", "Autres" };




/************************************************************************/
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	public static JFrame getFrame() {
		return frameMenu;
	}

	public void setFrame(JFrame frame) {
		this.frameMenu = frame;
	}

	public Object[] getElementsSelection() {
		return elementsSelection;
	}

	public void setElementsSelection(Object[] elementsSelection) {
		this.elementsSelection = elementsSelection;
	}

	public JTextField getNPatientSuivi() {
		return NPatientSuivi;
	}

	public void setNPatientSuivi(JTextField nPatientSuivi) {
		NPatientSuivi = nPatientSuivi;
	}

	public JTextField getTextFieldCodebarSuivi() {
		return CodebarSuivi;
	}

	public void setTextFieldCodebarSuivi(JTextField textFieldCodebarSuivi) {
		this.CodebarSuivi = textFieldCodebarSuivi;
	}

	public JTextField getTextFieldSitePreleSuivi() {
		return textFieldSitePreleSuivi;
	}

	public void setTextFieldSitePreleSuivi(JTextField textFieldSitePreleSuivi) {
		this.textFieldSitePreleSuivi = textFieldSitePreleSuivi;
	}

	public JTextField getTextFieldIdCoursSuivi() {
		return textFieldIdCoursSuivi;
	}

	public void setTextFieldIdCoursSuivi(JTextField textFieldIdCoursSuivi) {
		this.textFieldIdCoursSuivi = textFieldIdCoursSuivi;
	}

	public JTextField getTextFieldTemperaturSuivi() {
		return textFieldTemperaturSuivi;
	}

	public void setTextFieldTemperaturSuivi(JTextField textFieldTemperaturSuivi) {
		this.textFieldTemperaturSuivi = textFieldTemperaturSuivi;
	}

	public JTextField getSuiviePreSui() {
		return SuiviePreSui;
	}

	public void setSuiviePreSui(JTextField suiviePreSui) {
		SuiviePreSui = suiviePreSui;
	}

	public JTextField getNumpaConfo() {
		return numpaConfo;
	}

	public void setNumpaConfo(JTextField numpaConfo) {
		this.numpaConfo = numpaConfo;
	}

	public JTextField getTemperaturConf() {
		return TemperaturConf;
	}

	public void setTemperaturConf(JTextField temperaturConf) {
		TemperaturConf = temperaturConf;
	}

	public JTextField getIdCoursConf() {
		return IdCoursConf;
	}

	public void setIdCoursConf(JTextField idCoursConf) {
		IdCoursConf = idCoursConf;
	}

	public JTextField getSitePrelConf() {
		return SitePrelConf;
	}

	public void setSitePrelConf(JTextField sitePrelConf) {
		SitePrelConf = sitePrelConf;
	}

	public JTextField getCodeBMallConf() {
		return CodeBMallConf;
	}

	public void setCodeBMallConf(JTextField codeBMallConf) {
		CodeBMallConf = codeBMallConf;
	}

	public JTextField getNonconfoPreAna() {
		return NonconfoPreAna;
	}

	public void setNonconfoPreAna(JTextField nonconfoPreAna) {
		NonconfoPreAna = nonconfoPreAna;
	}

	public JTextField getConforPréana() {
		return ConforPréana;
	}

	public void setConforPréana(JTextField conforPréana) {
		ConforPréana = conforPréana;
	}

	public JTextField getConfoAna() {
		return ConfoAna;
	}

	public void setConfoAna(JTextField confoAna) {
		ConfoAna = confoAna;
	}

	public JTextField getNonConfAna() {
		return NonConfAna;
	}

	public void setNonConfAna(JTextField nonConfAna) {
		NonConfAna = nonConfAna;
	}

	public JTextField getConfoPostAna() {
		return ConfoPostAna;
	}

	public void setConfoPostAna(JTextField confoPostAna) {
		ConfoPostAna = confoPostAna;
	}

	public JTextField getNconfPost() {
		return NconfPost;
	}

	public void setNconfPost(JTextField nconfPost) {
		NconfPost = nconfPost;
	}

	public JTextField getNumMalletteMenuEnregistrement() {
		return NumMalletteMenuEnregistrement;
	}

	public void setNumMalletteMenuEnregistrement(JTextField textField) {
		this.NumMalletteMenuEnregistrement = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getnumMalletteEntrer() {
		return numMalletteEntrer;
	}

	public void setnumMalletteEntrer(JTextField textField_2) {
		this.numMalletteEntrer = textField_2;
	}

	public JTextField getNumAnalyseMenuPrincipal() {
		return NumAnalyseMenuPrincipal;
	}

	public void setNumAnalyseMenuPrincipal(JTextField textField_3) {
		this.NumAnalyseMenuPrincipal = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField gettxttypePrel() {
		return txttypePrel;
	}

	public void settxttypePrel(JTextField textField_5) {
		this.txttypePrel = textField_5;
	}

	public JTextField gettxtNom() {
		return txtNom;
	}

	public void setTextField_6(JTextField textField_6) {
		this.txtNom = textField_6;
	}


	public static JFrame getFrameMenu() {
		return frameMenu;
	}

	public static void setFrameMenu(JFrame frameMenu) {
		ApplicationView2.frameMenu = frameMenu;
	}

	public JList getListSuivitracabilit() {
		return ListSuivitracabilit;
	}

	public void setListSuivitracabilit(JList listSuivitracabilit) {
		ListSuivitracabilit = listSuivitracabilit;
	}

	public JTextField getCodebarSuivi() {
		return CodebarSuivi;
	}

	public void setCodebarSuivi(JTextField codebarSuivi) {
		CodebarSuivi = codebarSuivi;
	}

	public JTextField getNumMalletteEntrer() {
		return numMalletteEntrer;
	}

	public void setNumMalletteEntrer(JTextField numMalletteEntrer) {
		this.numMalletteEntrer = numMalletteEntrer;
	}

	public JTextField getTxttypePrel() {
		return txttypePrel;
	}

	public void setTxttypePrel(JTextField txttypePrel) {
		this.txttypePrel = txttypePrel;
	}

	public JTextField getTxtNom() {
		return txtNom;
	}

	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}

	public JList getList_2() {
		return list_2;
	}

	public void setList_2(JList list_2) {
		this.list_2 = list_2;
	}

	public JTextField getPrenomAffichage() {
		return PrenomAffichage;
	}

	public void setPrenomAffichage(JTextField prenomAffichage) {
		PrenomAffichage = prenomAffichage;
	}
}
