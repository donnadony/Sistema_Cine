package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import arreglos.Arreglo_Empleado;
import clases.Empleado;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Gui_Empleado extends JDialog implements ActionListener {
	
	private DefaultTableModel modelo;
	private JTable tblTable;

	private JLabel lblTitulo;
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidoPaterno;
	private JLabel lblApellidoMaterno;
	private JLabel lblTipoEmpleado;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApaterno;
	private JTextField txtAmaterno;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	
	private JComboBox comboBox;
	
	private JButton btnIngresar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnRegresar;
	private JButton btnAceptar;
	private JButton btnConsultar;
	private JButton btnBuscar;
	
	
	private int operacion;
	public final static int INGRESAR=0;
	public final static int CONSULTAR=1;
	public final static int MODIFICAR=2;
	public final static int ELIMINAR=3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Gui_Empleado dialog = new Gui_Empleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Gui_Empleado() {
		setResizable(false);
		setTitle("Empleados");
		setBounds(100, 100, 613, 591);
		getContentPane().setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 228, 589, 307);
			getContentPane().add(scrollPane);
			{
				tblTable = new JTable();
				scrollPane.setViewportView(tblTable);
			}
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(289, 49, 89, 23);
			btnBuscar.setVisible(false);
			getContentPane().add(btnBuscar);
		}
		{
			btnIngresar = new JButton("Ingresar");
			btnIngresar.setIcon(new ImageIcon("D:\\Programs\\EClipse\\Eclipse Proyectos\\SegundoCiclo\\imagenes\\agregar.png"));
			btnIngresar.addActionListener(this);
			btnIngresar.setBounds(499, 49, 100, 30);
			getContentPane().add(btnIngresar);
		}
		{
			btnConsultar = new JButton("Consultar");
			btnConsultar.addActionListener(this);
			btnConsultar.setBounds(499, 90, 100, 30);
			getContentPane().add(btnConsultar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(510, 140, 89, 23);
			getContentPane().add(btnModificar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(510, 174, 89, 23);
			getContentPane().add(btnEliminar);
		}
		{
			btnRegresar = new JButton("Regresar");
			btnRegresar.addActionListener(this);
			btnRegresar.setEnabled(false);
			btnRegresar.setBounds(510, 537, 89, 23);
			btnRegresar.setVisible(false);
			getContentPane().add(btnRegresar);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setEnabled(false);
			btnAceptar.setBounds(416, 537, 89, 23);
			btnAceptar.setVisible(false);
			getContentPane().add(btnAceptar);
		}
		{
			lblTitulo = new JLabel("Seleccione una Opci\u00F3n");
			lblTitulo.setBackground(Color.DARK_GRAY);
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setOpaque(true);
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setBounds(0, 0, 607, 38);
			getContentPane().add(lblTitulo);
		}
		{
			lblCodigo = new JLabel("C\u00F3digo");
			lblCodigo.setBounds(10, 53, 116, 14);
			getContentPane().add(lblCodigo);
		}
		{
			lblNombres = new JLabel("Nombres");
			lblNombres.setBounds(10, 78, 116, 14);
			getContentPane().add(lblNombres);
		}
		{
			lblApellidoPaterno = new JLabel("Apellido Paterno");
			lblApellidoPaterno.setBounds(10, 103, 116, 14);
			getContentPane().add(lblApellidoPaterno);
		}
		{
			lblApellidoMaterno = new JLabel("Apellido Materno");
			lblApellidoMaterno.setBounds(10, 128, 116, 14);
			getContentPane().add(lblApellidoMaterno);
		}
		{
			lblTipoEmpleado = new JLabel("Tipo Empleado");
			lblTipoEmpleado.setBounds(10, 153, 116, 14);
			getContentPane().add(lblTipoEmpleado);
		}
		{
			lblUsuario = new JLabel("Usuario");
			lblUsuario.setBounds(10, 178, 116, 14);
			getContentPane().add(lblUsuario);
		}
		{
			lblContraseña = new JLabel("Contraseña");
			lblContraseña.setBounds(10, 203, 116, 14);
			getContentPane().add(lblContraseña);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setBounds(129, 50, 150, 20);
			getContentPane().add(txtCodigo);
			txtCodigo.setEditable(false);
			txtCodigo.setColumns(10);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(129, 75, 150, 20);
			getContentPane().add(txtNombre);
			txtNombre.setEditable(false);
			txtNombre.setColumns(10);
		}
		{
			txtApaterno = new JTextField();
			txtApaterno.setBounds(129, 100, 150, 20);
			getContentPane().add(txtApaterno);
			txtApaterno.setEditable(false);
			txtApaterno.setColumns(10);
		}
		{
			txtAmaterno = new JTextField();
			txtAmaterno.setBounds(129, 125, 150, 20);
			getContentPane().add(txtAmaterno);
			txtAmaterno.setEditable(false);
			txtAmaterno.setColumns(10);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBounds(129, 175, 150, 20);
			getContentPane().add(txtUsuario);
			txtUsuario.setEditable(false);
			txtUsuario.setColumns(10);
		}
		{
			txtContraseña = new JTextField();
			txtContraseña.setBounds(129, 200, 150, 20);
			getContentPane().add(txtContraseña);
			txtContraseña.setEditable(false);
			txtContraseña.setColumns(10);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Supervisor", "Cajero"}));
			comboBox.setToolTipText("");
			comboBox.setBounds(129, 150, 150, 20);
			comboBox.setEnabled(false);
			getContentPane().add(comboBox);
		}		
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("A. Paterno");
		modelo.addColumn("A. Materno");
		modelo.addColumn("T. Empleado");
		modelo.addColumn("Usuario");
		modelo.addColumn("Contraseña");
		tblTable.setModel(modelo);		
		
		listar();
	}
	
	Arreglo_Empleado ae = new Arreglo_Empleado();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnRegresar) {
			do_btnRegresar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			do_btnConsultar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			do_btnAceptar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
	}
	

	
	void ingresarEmpleado(){	
		int codigo = Codigo(),t_empleado = T_Empleado();
		String nombres = Nombres(), a_paterno = A_Paterno(), a_materno = A_Materno(), usuario = Usuario(), contraseña = Contraseña();
		
		Empleado nuevo = new Empleado(codigo, t_empleado, nombres, a_paterno, a_materno,usuario,contraseña);
		ae.agregar(nuevo);
		
		/*ae.agregar(new Empleado(codigo, t_empleado, nombres, a_paterno, a_materno,"",""));*/	
		listar();	
		
		txtCodigo.setText(""+ae.codCorrelativo());	
		txtNombre.setText("");
		txtApaterno.setText("");
		txtAmaterno.setText("");
		txtNombre.requestFocus();
	}
	void consultarEmpleado(){
		Empleado x = ae.buscar(Codigo());
		if (x != null) {
			txtNombre.setText(x.getMom_e());
			txtApaterno.setText(x.getApa_e());
			txtAmaterno.setText(x.getAma_e());
		}
	}
	void modificarEmpleado(){
		
	}
	void eliminarEmpleado(){
		
	}
	
	
	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<ae.tamaño(); i++) {
			Object[] fila = {
				ae.obtener(i).getCod_e(),
				ae.obtener(i).getMom_e(),
				ae.obtener(i).getApa_e(),
				ae.obtener(i).getAma_e(), 
				ae.obtener(i).getTip_e(),
				ae.obtener(i).getLogin(),
				ae.obtener(i).getPass()
			};
			modelo.addRow(fila);
		}
	}	

	int Codigo() {
		return Integer.parseInt(txtCodigo.getText());
	}
	int T_Empleado() {
		return comboBox.getSelectedIndex();
	}	
	String Nombres() {
		return txtNombre.getText();
	}
	String A_Paterno() {
		return txtApaterno.getText();
	}
	String A_Materno() {
		return txtAmaterno.getText();
	}	
	String Usuario() {
		return txtUsuario.getText();
	}
	String Contraseña() {
		return txtContraseña.getText();
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	void habilitarEntradas(boolean x){
		comboBox.setEnabled(x);;
		txtNombre.setEditable(x);
		txtApaterno.setEditable(x);
		txtAmaterno.setEditable(x);
		txtUsuario.setEditable(x);
		txtContraseña.setEditable(x);
	}
	void habilitarBotones(boolean x){
		if(operacion != INGRESAR){
			btnBuscar.setEnabled(!x);
			btnBuscar.setVisible(!x);
		}
		btnIngresar.setEnabled(x);
		btnConsultar.setEnabled(x);
		btnModificar.setEnabled(x);
		btnEliminar.setEnabled(x);	
		if(operacion == CONSULTAR){
			btnAceptar.setEnabled(false);
			btnAceptar.setVisible(false);
		} else {
			btnAceptar.setEnabled(!x);	
			btnAceptar.setVisible(!x);
		}
		btnRegresar.setEnabled(!x);
		btnRegresar.setVisible(!x);
	}

	protected void do_btnAceptar_actionPerformed(ActionEvent arg0) {
		switch (operacion) {
		case INGRESAR:
			ingresarEmpleado(); 
			break;
		case CONSULTAR:
			consultarEmpleado();
			break;
		case MODIFICAR:
			modificarEmpleado();
			break;
		case ELIMINAR:
			eliminarEmpleado();
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent arg0) {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtApaterno.setText("");
		txtAmaterno.setText("");
		txtCodigo.setEditable(false);
		habilitarEntradas(false);
		habilitarBotones(true);
		lblTitulo.setText("Seleccione una Opción");			
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
		operacion = INGRESAR;
		lblTitulo.setText("Ingresar Empleado");
		txtCodigo.setText(""+ae.codCorrelativo());	
		txtNombre.setText("");
		txtApaterno.setText("");
		txtAmaterno.setText("");
		habilitarEntradas(true);
		habilitarBotones(false);
		txtNombre.requestFocus();
	}	
	protected void do_btnConsultar_actionPerformed(ActionEvent arg0) {
		operacion = CONSULTAR;
		lblTitulo.setText("Buscando Empleado");
		txtCodigo.setEditable(true);
		habilitarBotones(false);
		txtCodigo.requestFocus();
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent arg0) {
		consultarEmpleado();		
	}
	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
		operacion = MODIFICAR;
		lblTitulo.setText("Modificar Empleado");
		txtCodigo.setEditable(true);
		habilitarEntradas(true);
		habilitarBotones(false);
		txtCodigo.requestFocus();
	}	
}
