
public class Electrodomestico {
	
	private float precioBase;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;
	private float peso;
	
	public Electrodomestico(){
		this.precioBase = 100;
		this.consumoEnergetico = ConsumoEnergetico.F;
		this.peso = 5;
		this.color = Color.BLANCO;	
		
	}
	 
	public Electrodomestico(float precio,float peso){
		this.precioBase = precio;
		this.peso = peso;
		this.peso = 5;
		this.color = Color.BLANCO;	
	}

	public Electrodomestico(float precioBase,char consumoEnergetico,float peso,String color){
		this.precioBase = precioBase;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		this.color = this.comprobarColor(color);
	}
	
	private ConsumoEnergetico comprobarConsumoEnergetico(char letra){
		
		switch(letra){
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
	
	private Color comprobarColor(String color){
		switch(color){
		case "BLANCO":
			return Color.BLANCO;
		case "NEGRO":
			return Color.NEGRO;
		case "AZUL":
			return Color.AZUL;
		case "ROJO":
			return Color.ROJO;
		case "GRIS":
			return Color.GRIS;
		default: 
			return Color.BLANCO;
		}
		
	}
	
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
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

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
