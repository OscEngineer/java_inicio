package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	//metodo constructor se encarga de darle un estado inicial a mi Objeto
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=1600;
		motor=1600;
		peso_plataforma=1200;
		
		
	}
	
	//metodo getter debe tener return
	/*public String dime_largo() {//GETTER
		
		return "el largo del coche "+largo;
	}*/
	
	public String dame_datos_generales() {
		
		return "la plata forma del vehiculo tiene "+ruedas+" ruedas "+
		"mide"+(largo/1000)+" metros con un ancho de "+ancho+" cm y"
				+ "un peso de plataforma de"+peso_plataforma+" Kilos";
	}
	
		
	//metodo setter
	public void establece_color(String color_coche) {//SETTER
		//color = "azul";
		color= color_coche;
	}
	
	//para poder acceder al parametro que se establecio en el metodo setter,
	//se debe crear ahora el metodo getter
	
	
	public String color_coche() {//SETTER
		
		return "el color del coche es: "+color;
	}
	
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		
		if(asientos_cuero=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
}

