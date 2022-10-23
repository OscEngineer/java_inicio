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
	
	//METODO CONSTRUCTOR se encarga de darle un estado inicial a mi Objeto
	//debe tener el mismo nombre de la clase
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
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true; 
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() { //GETTER - obtiene
		
		if(asientos_cuero==true){
			return "el coche tiene asientos de cuero";
		}else {
			return "el coche tiene asientos de tela";
		}
	}
	
	public void configura_climatizador(String climatizador) {//SETTER-establece
		
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() { //GETTER
		if(climatizador==true) {
			return "el vehiculo tiene aire acondicionado";
		}else {
			return "el vehiculo no tiene aire acondicionado";
			
		}
	}
	//aca tenemos un metodo SEETER Y GETTER, lo cual es desaconsejado
	//tiene los dos puesto que estamos estableciendo el valor de ua variable
	//y le estamos diciendo que devuelva un dato
	public String dime_peso_coche() {
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if (climatizador==true) {
			peso_total=peso_total+20;
		}
		return "el peso del coche es "+peso_total;
	}
	
	public int precio_coche() {//GETTER
		int precio_final= 10000;
		
		if (asientos_cuero==true) {
			precio_final=precio_final+3000;
		}
		if(climatizador==true) {
			precio_final=precio_final+2000;
		}
		return precio_final;
		
	}
}

