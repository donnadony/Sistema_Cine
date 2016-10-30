package clases;

public class Empleado {
	
	int cod_e,tip_e;
	String mom_e, apa_e, ama_e, login, pass;
	
	public Empleado(int cod_e, int tip_e, String mom_e, String apa_e, String ama_e, String login, String pass) {
		this.cod_e = cod_e;
		this.tip_e = tip_e;
		this.mom_e = mom_e;
		this.apa_e = apa_e;
		this.ama_e = ama_e;
		this.login = login;
		this.pass = pass;
	}

	public int getCod_e() {
		return cod_e;
	}
	public void setCod_e(int cod_e) {
		this.cod_e = cod_e;
	}

	public int getTip_e() {
		return tip_e;
	}
	public void setTip_e(int tip_e) {
		this.tip_e = tip_e;
	}

	public String getMom_e() {
		return mom_e;
	}
	public void setMom_e(String mom_e) {
		this.mom_e = mom_e;
	}

	public String getApa_e() {
		return apa_e;
	}
	public void setApa_e(String apa_e) {
		this.apa_e = apa_e;
	}

	public String getAma_e() {
		return ama_e;
	}
	public void setAma_e(String ama_e) {
		this.ama_e = ama_e;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
}
