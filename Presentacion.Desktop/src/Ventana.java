import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana que contiene los menues.
 * Un menu "Altas" con items "Altas clientes" y "Altas modificaciones".
 * Un menu "Buscar" y los items que sean convenientes.
 *
 * Cuando se toca en un item, este crea la ventana correspondiente
 * y la agrega en el centro de la ventana principal.
 */

public class Ventana extends JFrame implements ActionListener,KeyListener{

	private final String[] arr = {"Nro Rep","Fecha","Costo","Detalle","Patente"};
	private static final long serialVersionUID = 1L;
	private JMenuBar Barra;
	private JMenu Altas,Buscar,Ver;
	private JMenuItem Alta_Cliente,Alta_Turno,Mostrar,Ver_reparaciones,ver_Clientes;	
	//private DefaultTableModel dtm = new DefaultTableModel();
	//private JTable table = new JTable(dtm);
	//private JScrollPane scroll;
	private JTextField txt_filtro;
	private JButton btn_buscar;
	private JLabel lbl_buscar;
	public ArrayList<String> clts = new ArrayList<String>();
	
	
	public JDesktopPane frameCliente = new JDesktopPane();
	public JButton btnReparacion,btnCliente,btnEliminarReparacion,btnEditarReparacion,btnSalir;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	public JTextField patente,nombre,telefono,auto,detalle,costo;
	public DefaultTableModel dtm = new DefaultTableModel();
	public JTable tabla = new JTable(dtm);
	public JScrollPane scroll = new JScrollPane(tabla);
	public static JComboBox jcbClientes;
	public JComboBox jcbAutos;
	
	
	
	public Ventana(){
		this.setupWindows();
		this.setupReparacion();
		//this.setupBar();
		this.setupCliente();
		this.add(frameCliente, BorderLayout.CENTER);
	}

	private void setupReparacion() {
		l5 = new JLabel("CLIENTES:");
		jcbClientes = new JComboBox();
		l6 = new JLabel("AUTOS:");
		jcbAutos = new JComboBox();
		l7 = new JLabel("DETALLE:");
		detalle = new JTextField(20);
		l8 = new JLabel("COSTO:");
		costo = new JTextField(20);
		btnReparacion = new JButton("AGREGAR");
		
		frameCliente.add(l5);
		frameCliente.add(jcbClientes);
		frameCliente.add(l6);
		frameCliente.add(jcbAutos);
		frameCliente.add(l7);
		frameCliente.add(detalle);
		frameCliente.add(l8);
		frameCliente.add(costo);
		frameCliente.add(btnReparacion);
		
		l5.setBounds(450, 10,200,30);
		jcbClientes.setBounds(575, 5, 140, 27);
		l6.setBounds(450, 40,200,30);
		jcbAutos.setBounds(575, 35,140,30);
		l7.setBounds(450, 70,200,30);
		detalle.setBounds(575, 70,140,25);
		l8.setBounds(450, 100,200,30);
		costo.setBounds(575, 100,140,25);
		btnReparacion.setBounds(575, 130,140,30);
				
		
		btnReparacion.addActionListener(this);
		
	}

	private void setupCliente() {
		final String[] arr = {"Nro Rep","Fecha","Costo","Detalle","Patente"};
		//frameCliente.setBackground(Color.decode("#246EB7"));
		btnCliente = new JButton("GUARDAR");
		btnEliminarReparacion = new JButton("Eliminar");
		btnEditarReparacion = new JButton("Editar");
		btnSalir = new JButton("Salir");
		l1 = new JLabel("PATENTE:");
		l2 = new JLabel("NOMBRE:");
		l3 = new JLabel("TELEFONO:");
		l4 = new JLabel("MARCA/MODELO:");
		patente = new JTextField(20);
		nombre = new JTextField(20);
		telefono = new JTextField(20);
		auto = new JTextField(20);
		dtm = new DefaultTableModel();
		dtm.setColumnIdentifiers(arr);
		tabla = new JTable(dtm);
		//tabla.setBackground(Color.red);
		JScrollPane scroll = new JScrollPane(tabla);
		
		frameCliente.add(l1);
		frameCliente.add(patente);
		frameCliente.add(l2);
		frameCliente.add(nombre);
		frameCliente.add(l3);
		frameCliente.add(telefono);
		frameCliente.add(l4);
		frameCliente.add(auto);
		frameCliente.add(scroll);
		frameCliente.add(btnCliente);
		frameCliente.add(btnEliminarReparacion);
		frameCliente.add(btnEditarReparacion);
		frameCliente.add(btnSalir);
		l1.setBounds(20, 10, 120, 30);
		patente.setBounds(160,10,140,25);
		l2.setBounds(20, 40, 120, 30);
		nombre.setBounds(160, 40,140,25);
		l3.setBounds(20, 70, 120, 30);
		telefono.setBounds(160,70,140,25);
		l4.setBounds(20, 100, 120, 30);
		auto.setBounds(160, 100, 140, 25);
		btnCliente.setBounds(160, 130, 140, 27);
		scroll.setBounds(20, 300, 850, 200);
		
		btnCliente.addActionListener(this);
		
			
				
	}

	private void setupBar(){
		
		Barra = new JMenuBar();
		Altas = new JMenu("Altas");
		Ver = new JMenu("Ver");
		Buscar = new JMenu("Buscar Cliente");		
		Ver_reparaciones = new JMenuItem("Calendario");
		ver_Clientes = new JMenuItem("Agenda");
		Mostrar = new JMenuItem("Mostrar DB");  
		Alta_Cliente = new JMenuItem("Altas Cliente"); 
		Alta_Turno = new JMenuItem("Altas Turno");
		
		Altas.add(Alta_Cliente);
		Altas.add(Alta_Turno);
		Ver.add(Ver_reparaciones);
		Ver.add(ver_Clientes);
		Buscar.add(Mostrar);		
		Barra.add(Ver);
		Barra.add(Altas);
		Barra.add(Buscar);
		this.add(scroll);
		this.setJMenuBar(Barra);
		
		Alta_Cliente.addActionListener(this);
		Alta_Turno.addActionListener(this);
		Mostrar.addActionListener(this);
		Ver_reparaciones.addActionListener(this);
		ver_Clientes.addActionListener(this);
		this.setVisible(true);
	}
	
	
	private void setupWindows(){
		
		this.setResizable(false);
		this.setIconImage (new ImageIcon("ico.gif").getImage());
		this.setTitle("Taller Mecanico");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
/*
		table = new JTable(dtm);
		scroll = new JScrollPane(table);
		
		add(scroll);
		scroll.setBounds(10, 10, 500, 200);
		table.addKeyListener(this);
		dtm.setColumnIdentifiers(arr);
				*/
		
	} 
	

	public void actionPerformed(ActionEvent e) {

	}
	
	public String[] getTextValue(){
		String[] arr = {nombre.getText()+telefono.getText()+auto.getText()+patente.getText()};
		//Uso for(int i=0;getTextValue().length>i;i++){String[] arr = getTextValue();System.out.println(arr[i]);}
		return arr;
	}
	
	public void fillTable(){
		//en vez de patente es el nombre del cliente//select patente,fecha,detalle,costo,id_Reparacion from reparacion order by fecha desc limit 0 , 20		String query = "select id_reparacion,fecha,costo,detalle from reparacion  where patente = '"+p+"'";
		dtm.setRowCount(0);
		dtm.setColumnCount(0);
		dtm.setColumnIdentifiers(arr);
		
	}	
	
	public void selectedRows(){
		int[] selected = tabla.getSelectedRows();
		
		for(int i = 0;i<=selected.length;i++){
			System.out.println("las filas seleccionadas son: "+selected[i]);
		}
	}

	@Override
	public void keyPressed(KeyEvent ke) {
	   int	key = ke.getKeyCode();
		if(key == KeyEvent.VK_R){
			System.out.println("se presiono la R");
			this.fillTable();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
		
	public void cargarAutos(JComboBox<String> JCB){
	
	}
	
	public static void main(String[] args){
		Ventana v = new Ventana();
	}
	
			
}