
public class Program {

	
	public static void main(String[] args){
		
		Electrodomestico e = new Electrodomestico();
		Electrodomestico e1 = new Electrodomestico(12,30);
		Electrodomestico e2 = new Electrodomestico(12,'e',30,"BLANCO");
		
		System.out.println(e.getPeso()+"-"+e.getConsumoEnergetico()+"-"+e.getColor()+"-"+e.getPrecioBase());
		System.out.println(e1.getPeso()+"-"+e1.getConsumoEnergetico()+"-"+e1.getColor()+"-"+e1.getPrecioBase());
		System.out.println(e2.getPeso()+"-"+e2.getConsumoEnergetico()+"-"+e2.getColor()+"-"+e2.getPrecioBase());


	}
}
