
public class Electrodomestico {
	
	private float precioBase;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;
	private float peso;
	
	public Electrodomestico(){
		this.precioBase = 100;
		this.consumoEnergetico = consumoEnergetico.F;
		this.peso = 5;
		this.color = Color.BLANCO;	
		
	}
	 
	public Electrodomestico(float precio,float peso){
		this.precioBase = precio;
		this.peso = peso;
		this.peso = 5;
		this.color = Color.BLANCO;	
	}

	public Electrodomestico(float precioBase,ConsumoEnergetico consumoEnergetico,float peso,Color color){
		this.precioBase = precioBase;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		this.color = color;
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
