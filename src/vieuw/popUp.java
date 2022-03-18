	
	package vieuw;
	
import java.awt.Font;
	import java.awt.Image;
	import java.awt.Toolkit;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
	import java.util.Enumeration;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFileChooser;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JLayeredPane;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;
	import javax.swing.JTextPane;
	import javax.swing.UIManager;
	import javax.swing.border.BevelBorder;
	import javax.swing.plaf.FontUIResource;

	public class popUp {

		private JFrame frmDclarationDeNon;
		private JTextField textField;
		private JTextField textField_1;
		static String[] Yesno = { "Oui", "Non" };
		private static JTextField numAnaConf ;
		private JTextField Nom;
		private JTextField Age;
		private JTextField Genre;
		private JTextField Prenom;
		private JTextField Date;
		private JComboBox<String> comboBoYes;
		private JComboBox comboBoYes_1;
		private JTextField textPrel;
		private JButton btnVldNonConf;
		public JButton getBtnVldNonConf() {
			return btnVldNonConf;
		}

		public void setBtnVldNonConf(JButton btnVldNonConf) {
			this.btnVldNonConf = btnVldNonConf;
		}

		public popUp() {
			initialize();
		}

		public static void setUIFont(FontUIResource f) {
			Enumeration keys = UIManager.getDefaults().keys();
			while (keys.hasMoreElements()) {
				Object key = keys.nextElement();
				Object value = UIManager.get(key);
				if (value instanceof FontUIResource) {
					FontUIResource orig = (FontUIResource) value;
					Font font = new Font(f.getFontName(), orig.getStyle(), f.getSize());
					UIManager.put(key, new FontUIResource(font));
				}
			}
		}

		

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {

			setUIFont(new FontUIResource(new Font("Bahnschrift 11", 0, 10)));

			frmDclarationDeNon = new JFrame();
			frmDclarationDeNon.setTitle("D\u00E9claration de non conformit\u00E9e");
			frmDclarationDeNon.setIconImage(
					Toolkit.getDefaultToolkit().getImage("F:\\Users\\kedal\\eclipse-workspace\\bioTracker\\logoBio.png"));
			frmDclarationDeNon.setBounds(100, 100, 650, 447);
			frmDclarationDeNon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmDclarationDeNon.getContentPane().setLayout(null);

			JLayeredPane layeredPane = new JLayeredPane();
			layeredPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			layeredPane.setBounds(10, 11, 614, 139);
			frmDclarationDeNon.getContentPane().add(layeredPane);

			numAnaConf = new JTextField();
			numAnaConf.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					
					
					
				}
			});
			numAnaConf.setBounds(120, 38, 224, 20);
			layeredPane.add(numAnaConf);

			 Prenom = new JTextField();
			Prenom.setBounds(448, 38, 156, 20);
			layeredPane.add(Prenom);

			

			

			JLabel lblNewLabel = new JLabel("N\u00B0Analyse");
			lblNewLabel.setBounds(26, 41, 57, 14);
			layeredPane.add(lblNewLabel);

			JLabel lblService = new JLabel("Nom");
			lblService.setBounds(53, 69, 30, 14);
			layeredPane.add(lblService);

			JLabel lblPrenom = new JLabel("Prenom");
			lblPrenom.setBounds(354, 41, 66, 14);
			layeredPane.add(lblPrenom);

			JLabel lblGenre = new JLabel("Genre");
			lblGenre.setBounds(160, 100, 38, 14);
			layeredPane.add(lblGenre);

			 Genre = new JTextField();
			Genre.setBounds(205, 97, 30, 20);
			layeredPane.add(Genre);

			JLabel lblDateNaissance = new JLabel("Date naissance");
			lblDateNaissance.setBounds(354, 72, 113, 14);
			layeredPane.add(lblDateNaissance);

			 Nom = new JTextField();
			Nom.setBounds(119, 66, 156, 20);
			layeredPane.add(Nom);

			JLabel lblInformation = new JLabel("Information");
			lblInformation.setBounds(257, 10, 66, 14);
			layeredPane.add(lblInformation);
			
			Date = new JTextField();
			Date.setBounds(448, 69, 156, 20);
			layeredPane.add(Date);
			
			textPrel = new JTextField();
			textPrel.setBounds(448, 97, 156, 20);
			layeredPane.add(textPrel);
			
			JLabel lblPrel = new JLabel("Prel");
			lblPrel.setBounds(354, 100, 66, 14);
			layeredPane.add(lblPrel);

			JLayeredPane layeredPane_1 = new JLayeredPane();
			layeredPane_1.setBounds(20, 149, 614, 236);
			frmDclarationDeNon.getContentPane().add(layeredPane_1);

			textField = new JTextField();
			textField.setBounds(140, 43, 412, 125);
			layeredPane_1.add(textField);
			textField.setColumns(10);

			JRadioButton rdbtnNewRadioButton = new JRadioButton("Echantillon");
			rdbtnNewRadioButton.setBounds(6, 43, 109, 23);
			layeredPane_1.add(rdbtnNewRadioButton);

			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Analyse");
			rdbtnNewRadioButton_1.setBounds(6, 69, 109, 23);
			layeredPane_1.add(rdbtnNewRadioButton_1);

			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Service");
			rdbtnNewRadioButton_2.setBounds(6, 95, 109, 23);
			layeredPane_1.add(rdbtnNewRadioButton_2);

			JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Transport");
			rdbtnNewRadioButton_2_1.setBounds(6, 121, 109, 23);
			layeredPane_1.add(rdbtnNewRadioButton_2_1);

			JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("Patient");
			rdbtnNewRadioButton_2_1_1.setBounds(6, 147, 109, 23);
			layeredPane_1.add(rdbtnNewRadioButton_2_1_1);

			JLabel lblNewLabel_1 = new JLabel("Cause:");
			lblNewLabel_1.setBounds(20, 11, 66, 14);
			layeredPane_1.add(lblNewLabel_1);

			textField_1 = new JTextField();
			textField_1.setBounds(187, 11, 86, 23);
			layeredPane_1.add(textField_1);
			textField_1.setColumns(10);

			JLabel lblNewLabel_1_1 = new JLabel("Emeteur");
			lblNewLabel_1_1.setBounds(140, 15, 66, 14);
			layeredPane_1.add(lblNewLabel_1_1);

			comboBoYes = new JComboBox(Yesno);
			comboBoYes.setBounds(328, 11, 47, 22);
			layeredPane_1.add(comboBoYes);

			
			JLabel lblNewLabel_1_1_1 = new JLabel("Impact");
			lblNewLabel_1_1_1.setBounds(286, 15, 66, 14);
			layeredPane_1.add(lblNewLabel_1_1_1);

			JLabel lblNewLabel_1_1_2 = new JLabel("Gravit\u00E9");
			lblNewLabel_1_1_2.setBounds(385, 15, 66, 14);
			layeredPane_1.add(lblNewLabel_1_1_2);

			 comboBoYes_1 = new JComboBox(Yesno);
			comboBoYes_1.setBounds(444, 11, 47, 22);
			layeredPane_1.add(comboBoYes_1);
			
			 btnVldNonConf = new JButton("Validation");
			btnVldNonConf.setBounds(271, 205, 104, 21);
			layeredPane_1.add(btnVldNonConf);
		}

		public JTextField getTextPrel() {
			return textPrel;
		}

		public void setTextPrel(JTextField textPrel) {
			this.textPrel = textPrel;
		}

		public JComboBox<String> getComboBoYes() {
			return comboBoYes;
		}

		public void setComboBoYes(JComboBox<String> comboBoYes) {
			this.comboBoYes = comboBoYes;
		}

		public JFrame getFrmDclarationDeNon() {
			return frmDclarationDeNon;
		}

		public void setFrmDclarationDeNon(JFrame frmDclarationDeNon) {
			this.frmDclarationDeNon = frmDclarationDeNon;
		}

		public JTextField getTextField() {
			return textField;
		}

		public void setTextField(JTextField textField) {
			this.textField = textField;
		}

		public JTextField getTextField_1() {
			return textField_1;
		}

		public void setTextField_1(JTextField textField_1) {
			this.textField_1 = textField_1;
		}

		public static String[] getYesno() {
			return Yesno;
		}

		public static void setYesno(String[] yesno) {
			Yesno = yesno;
		}

		public static JTextField getNumAnaConf() {
			return numAnaConf;
		}

		public static void setNumAnaConf(JTextField numAnaConf) {
			popUp.numAnaConf = numAnaConf;
		}

		public JTextField getNom() {
			return Nom;
		}

		public void setNom(JTextField nom) {
			Nom = nom;
		}

		public JTextField getAge() {
			return Age;
		}

		public void setAge(JTextField age) {
			Age = age;
		}

		public JTextField getGenre() {
			return Genre;
		}

		public void setGenre(JTextField genre) {
			Genre = genre;
		}

		public JTextField getPrenom() {
			return Prenom;
		}

		public void setPrenom(JTextField prenom) {
			Prenom = prenom;
		}

		public JTextField getDate() {
			return Date;
		}

		public void setDate(JTextField date) {
			Date = date;
		}

		public JComboBox getComboBoYes_1() {
			return comboBoYes_1;
		}

		public void setComboBoYes_1(JComboBox comboBoYes_1) {
			this.comboBoYes_1 = comboBoYes_1;
		}
	}



