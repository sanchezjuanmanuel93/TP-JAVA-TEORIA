import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class frmVentanaPrincipal extends JFrame{
	
	private JTextField txtPrecio,txtColor,txtConsumo,txtPeso;
	
	public frmVentanaPrincipal(){
		this.setTitle("Cargar Electrodomesticos");		
		this.setSize(300,200);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setComponent();
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	private void setComponent() {
		txtPrecio = new JTextField(20);
		txtColor = new JTextField(20);
		txtConsumo = new JTextField(20);
		txtPeso = new JTextField(20);
		
		this.add(txtPrecio);
		this.add(txtColor);
		this.add(txtConsumo);
		this.add(txtPeso);
	}
	
	private void cargarElectrodomestico(Electrodomestico e){
		this.txtPrecio.setText(String.valueOf(e.getPrecio()));
		this.txtColor.setText(e.getColor().toString());
		this.txtColor.setText(e.getColor().toString());
		this.txtColor.setText(e.getColor().toString());		
	}
}
