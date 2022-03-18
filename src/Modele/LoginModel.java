package Modele;

public class LoginModel {
	
	private static String login;
	private String MDP;
	
	
	public LoginModel(String login, String mDP) {
		super();
		this.login = login;
		this.MDP = mDP;
	}


	public static String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getMDP() {
		return MDP;
	}


	public void setMDP(String mDP) {
		MDP = mDP;
	}

}
