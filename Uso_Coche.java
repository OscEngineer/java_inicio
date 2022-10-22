package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche=new Coche(); //instanciar una clase -es crear un objeto
		//en este caso Renault es una instancia de la clase coche
		
		
		//Renault es un objeto perteneciente a la clase coche
		//al poner Renault.ruedas   estoy accediendo a la propiedad
		//si esta private n puedo acceder a el, debere usar un metodo
		
	
		//System.out.println("Este coche tiene "+Renault.ruedas+" ruedas");
		
		//System.out.println(Renault.dime_largo());
		
		
		//accediendo al metodo setter del color
		
		
		//llamo al metodo setter
		
		System.out.println(micoche.dame_datos_generales());	
		
		
		micoche.establece_color("amarillo");
		System.out.println(micoche.color_coche());
		
		micoche.configura_asientos("si");
		System.out.println(micoche.dime_asientos());
		


	}

}
//encapsulacion nunca se debe poder modificar directamente la propiedad de un
//objeto utilizando la instancia del objeto
// micoche,color = rosa     no se debe hacer viola la encapsulacion
