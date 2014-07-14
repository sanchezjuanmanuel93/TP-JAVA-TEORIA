
public class Lavarropas extends Electrodomestico{

	private int carga;
	
	public Lavarropas(){
		super();
		this.carga = 5;
	}
	
	public Lavarropas(int carga){
		this.carga = carga;
		super();
		
	}
	
	public Lavarropas(int precio, int peso){
		super();
		this.carga = 5;
		this.precio = precio;
		this.peso = peso;
	}
	
	
}
