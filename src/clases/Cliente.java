package clases;

public class Cliente {
	int cod_cliente, estado_civil;
	String nombres, ape_paterno, ape_materno, direccion, fec_nac, fec_afiliacion, telef, dni, login, password;
	
	public Cliente(int cod_cliente, int estado_civil, String nombres, String ape_paterno, String ape_materno,String direccion, String fec_nac, String fec_afiliacion, String telef, String dni, String login, String password) {
		this.cod_cliente = cod_cliente;
		this.estado_civil = estado_civil;
		this.nombres = nombres;
		this.ape_paterno = ape_paterno;
		this.ape_materno = ape_materno;
		this.direccion = direccion;
		this.fec_nac = fec_nac;
		this.fec_afiliacion = fec_afiliacion;
		this.telef = telef;
		this.dni = dni;
		this.login = login;
		this.password = password;
	}
	
	
	
}
