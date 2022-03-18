package vieuw;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.UIManager;

import Controler.Controler;



public class Lancement {

		
		public static void main(String []args) throws ClassNotFoundException, IOException, SQLException {
		    try {
		            //here you can put the selected theme class name in JTattoo
		            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		 
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		
	
		// initialisation et lancement de l'interface de login
		popUp popUp1= new popUp();
		LoginView login = new LoginView();
		Controler controleur1 =new Controler(login, popUp1);
		login.getFrame().setVisible(true);
		
		ApplicationView2 MenuPrincipal = new ApplicationView2(popUp1);
		ApplicationView2.getFrame().setVisible(false);
		Controler controleur2 =new Controler(MenuPrincipal);
		

		popUp1.getFrmDclarationDeNon().setVisible(false);
		
		
	//	ApplicationView AffichageView= new ApplicationView();
	//	AffichageView.getFrame().setVisible(false);
	//	Controler controleur3 =new Controler(AffichageView);
		
	


}

}