package poo;

public class Prueba_uso_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comenzamos con instanciar nuestra clase empleados
		Empleados trabajador1=new Empleados("Juanito");
		Empleados trabajador2=new Empleados("pepe");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Maria");
		
		//cambiandole la seccion enviando
		trabajador1.cambiasecccion("RRHH");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());

	}

}

class Empleados{
	
	//el costructor se encarga de darle un estado inicial a nuestros objeto
	//metodo constructor
	public Empleados(String nom) {
		
		nombre= nom;
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	
	//metodo setter para cambiar la seccion a la que pertenece un trabajador
	public void cambiasecccion (String seccion) {//SETTER
		this.seccion=seccion;
	}
	/*public void cambianombre(String nombre) {//SETTER	
		this.nombre=nombre;
	}*/
	
	public String devuelveDatos() {//GETTER
		
		return "el nombre es: "+nombre+" y la seccion es: "+seccion
				+" y el Id es: "+Id;
	}
	
	//USANDO PALABRA RESERVADA final QUE NO PERMITE CAMBIAR EL VALOR PORQUE SE HA CONVERTIDO EN UNA CONSTANTE
	private final String nombre;
	private String seccion;
	//crearemos un unico campo id que compartan todos los objetos, usamos static
	private int Id;
	private static int IdSiguiente=1;
	
}