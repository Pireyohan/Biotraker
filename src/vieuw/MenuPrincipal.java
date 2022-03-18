package vieuw;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JList;
import com.toedter.calendar.JCalendar;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class MenuPrincipal {

	private static JFrame frame;
	private static JTextField TxNPatient;
	private static JTextField TxCodeBarre;
	private static JTextField NumMallette;
	private  static JComboBox<String> listeOrigine;
	private static Object[] elementsSelection;
	private static JLabel lblTPrel;
	private static JLabel lblDtePrel;
	private  static JLabel lblCodeBarreLalette;
	private  static JList list;
	private static JCalendar calendarPrel;
	private static JPanel panelSearch;
	private static ImageIcon icone;
	private static JTextField txtNDePrlvement;
	
	private static JTextField NumAnalyseMenuPrincipal;
	private static JTextField txtTypeDePrlvement;
	
	private static JTextField txtNom;
	private static JTextField textField;
	private static JTable table;
	private JTextField Nom;
	private JTextField TypePrel;
	private static JButton BouttonValEnregistrementTemporaire;
	private JButton BouttonValEnregistrementTemporaire_1;
	
	
	
	/**
	 * Launch the application.
	 * @return 
	 */
	
	 
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 1169, 752);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TxNPatient = new JTextField();
		TxNPatient.setBackground(Color.ORANGE);
		TxNPatient.setForeground(Color.BLACK);
		TxNPatient.setHorizontalAlignment(SwingConstants.CENTER);
		TxNPatient.setText("MALLETTE EN COURS\r\n");
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
		/*********************** Menu d�roulant pour s�lectionner les types de pr�l�vements*************************/
		elementsSelection= new Object[] {"Muqueux","Cutan�s", "Mycobact�ries","Expectoration","Sang","H�mocultures","Sph�re ORL","Urines","Autres"}; 
		listeOrigine= new JComboBox(elementsSelection);
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
		
		
		list = new JList();
		list.setBorder(BorderFactory.createTitledBorder("Enregistrement des analyses :"));
		list.setBounds(266, 322, 879, 383);
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
		
		
		NumMallette = new JTextField();
		NumMallette.setHorizontalAlignment(SwingConstants.CENTER);
		NumMallette.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		NumMallette.setBounds(266, 142, 123, 39);
		NumMallette.setColumns(10);
		
		frame.getContentPane().add(NumMallette);
		
		txtNDePrlvement = new JTextField();
		txtNDePrlvement.setHorizontalAlignment(SwingConstants.CENTER);
		txtNDePrlvement.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		txtNDePrlvement.setColumns(10);
		txtNDePrlvement.setBounds(519, 142, 131, 39);
		frame.getContentPane().add(txtNDePrlvement);
		
		NumAnalyseMenuPrincipal = new JTextField();
		NumAnalyseMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		NumAnalyseMenuPrincipal.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		NumAnalyseMenuPrincipal.setColumns(10);
		NumAnalyseMenuPrincipal.setBounds(393, 142, 123, 39);
		frame.getContentPane().add(NumAnalyseMenuPrincipal);
		
		txtTypeDePrlvement = new JTextField();
		txtTypeDePrlvement.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypeDePrlvement.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		txtTypeDePrlvement.setColumns(10);
		txtTypeDePrlvement.setBounds(274, 237, 79, 23);
		frame.getContentPane().add(txtTypeDePrlvement);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(376, 237, 87, 20);
		frame.getContentPane().add(dateChooser);
		
		txtNom = new JTextField();
		txtNom.setBackground(Color.GREEN);
		txtNom.setForeground(Color.WHITE);
		txtNom.setText("NOM");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		txtNom.setColumns(10);
		txtNom.setBounds(1015, 157, 79, 39);
		frame.getContentPane().add(txtNom);
		
		textField = new JTextField();
		textField.setBackground(Color.RED);
		textField.setText("NOM");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(1017, 225, 79, 39);
		frame.getContentPane().add(textField);
		
		JLabel lblTubeEnregistrer = new JLabel("Tube à enregistrer");
		lblTubeEnregistrer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTubeEnregistrer.setBounds(985, 132, 145, 32);
		frame.getContentPane().add(lblTubeEnregistrer);
		
		JLabel lblTubesFinaliss = new JLabel("Tubes FInalisés");
		lblTubesFinaliss.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTubesFinaliss.setBounds(985, 194, 145, 32);
		frame.getContentPane().add(lblTubesFinaliss);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(296, 667, 696, -316);
		frame.getContentPane().add(table);
		
		Nom = new JTextField();
		Nom.setHorizontalAlignment(SwingConstants.CENTER);
		Nom.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		Nom.setColumns(10);
		Nom.setBounds(266, 187, 123, 39);
		frame.getContentPane().add(Nom);
		
		TypePrel = new JTextField();
		TypePrel.setHorizontalAlignment(SwingConstants.CENTER);
		TypePrel.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		TypePrel.setColumns(10);
		TypePrel.setBounds(393, 187, 123, 39);
		frame.getContentPane().add(TypePrel);
		
		BouttonValEnregistrementTemporaire = new JButton("Enregistrement");
		BouttonValEnregistrementTemporaire.setBounds(529, 200, 121, 23);
		frame.getContentPane().add(BouttonValEnregistrementTemporaire);
		
		BouttonValEnregistrementTemporaire_1 = new JButton("Appel ID");
		BouttonValEnregistrementTemporaire_1.setBounds(660, 153, 89, 23);
		frame.getContentPane().add(BouttonValEnregistrementTemporaire_1);
	

		String url= "loupe.png";
		ImageIcon icone= new ImageIcon(url);
		frame.getIconImages();
		
		
	
	}

	public static JFrame getFrame() {
		return frame;
	}

	public JTextField getTxNPatient() {
		return TxNPatient;
	}

	public JTextField getTxCodeBarre() {
		return TxCodeBarre;
	}

	public static JTextField getNumMalletteMenuEnregistrement() {
		return NumMallette;
	}

	public JComboBox<String> getListeOrigine() {
		return listeOrigine;
	}

	public Object[] getElementsSelection() {
		return elementsSelection;
	}

	public JLabel getLblTPrel() {
		return lblTPrel;
	}

	public JLabel getLblDtePrel() {
		return lblDtePrel;
	}

	public JLabel getLblCodeBarreLalette() {
		return lblCodeBarreLalette;
	}

	public JList getList() {
		return list;
	}

	public JCalendar getCalendarPrel() {
		return calendarPrel;
	}

	public JPanel getPanelSearch() {
		return panelSearch;
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public JTextField getTxtNDePrlvement() {
		return txtNDePrlvement;
	}

	public JTextField getNumAnalyseMenuPrincipal() {
		return NumAnalyseMenuPrincipal;
	}

	public JTextField getTxtTypeDePrlvement() {
		return txtTypeDePrlvement;
	}

	public JTextField getTxtNom() {
		return txtNom;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTable getTable() {
		return table;
	}

	public static JButton getBouttonValEnregistrementTemporaire() {
		return BouttonValEnregistrementTemporaire;
	}

	public static void setBouttonValEnregistrementTemporaire(JButton bouttonValEnregistrementTemporaire) {
		BouttonValEnregistrementTemporaire = bouttonValEnregistrementTemporaire;
	}
}