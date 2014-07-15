
public class Electrodomestico {
	
	protected static int precioBase = 100;
	protected static int pesoBase = 5;
	protected Color color;
	protected ConsumoEnergetico consumoEnergetico;
	protected int precio;
	protected int peso;
	
	public Electrodomestico(){
		this.precio = precioBase;
		this.consumoEnergetico = ConsumoEnergetico.F;
		this.color = Color.BLANCO;	
		this.peso = pesoBase;
		
	}
	 
	public Electrodomestico(int precio,int peso){
		this.precio = precio;
		this.peso = peso;
		this.color = Color.BLANCO;	
	}

	public Electrodomestico(int precio,char consumoEnergetico,int peso,String color){
		
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		this.precio = this.precioFinal()+precio;
		this.color = this.comprobarColor(color);
	}
	
	protected int precioFinal(){
		return precioBase+this.getConsumo()+this.getTamaño();
	}
	
	protected ConsumoEnergetico comprobarConsumoEnergetico(char letra){
		char letra1 = Character.toUpperCase(letra);
		switch(letra1){
			case 'A':
				return ConsumoEnergetico.A;
			case 'B':
				return ConsumoEnergetico.B;
			case 'C':
				return ConsumoEnergetico.C;
			case 'D':
				return ConsumoEnergetico.D;
			case 'E':
				return ConsumoEnergetico.E;
			case 'F':
				return ConsumoEnergetico.F;
			default:
				return ConsumoEnergetico.F;
		}
		
	}
	
	protected Color comprobarColor(String color){
		Color c;
		if(color.equals("BLANCO")){
			c = Color.BLANCO;
		}else if(color.equals("NEGRO")){
			c = Color.NEGRO;
		}else if(color.equals("AZUL")){
			c = Color.AZUL;
		}else if(color.equals("GRIS")){
			c = Color.GRIS;
		}else if(color.equals("ROJO")){
			c = Color.ROJO;
		}else{
			c = Color.BLANCO;
		}
		return c;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	private int getTamaño(){

		int p=0;
		if( (this.precio > 0) && (this.precio <= 19) ){
			p=10;	
		}else if( (this.precio > 20) && (this.precio <= 49) ){
			p = 50;
		}else if( (this.precio > 49) && (this.precio <= 70) ){
			p = 80;
		}else if( this.precio >=80 ){
			p = 100;
		}
		return p;
	}
	
	private int getConsumo(){
		int consumo = 0;
		switch(this.consumoEnergetico){
		case A:
			consumo = 100;
			break;
		case B:
			consumo = 80;
			break;
		case C:
			consumo = 80;
			break;
		case D:
			consumo = 80;
			break;
		case E:
			consumo = 80;
			break;
		case F:
			consumo = 80;
			break;
		default:
			
		}
		
		return consumo;
	}
	
}
