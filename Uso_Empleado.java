package poo;

import java.util.*;;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creando diferentes instancias de clase y haciendo uso de los metodos
		/*
		//aca en la clase principal instanciamos la clase empleado
		//es decir vamos a crear un nuevo empleado empleado1
		//debe llevar la misma cantidad de paremetros
		Empleado empleado1= new Empleado("Pepito perez",85000,1990,12,17);
		Empleado empleado2= new Empleado("Barak Obama",130000,2000,10,15);
		Empleado empleado3= new Empleado("Maria Pulido",140000,2020,4,5);
		
		//ahora usaremos el metodo subeSueldo para subir el sueldo de todos los empleados
		 empleado1.subeSueldo(5);
		 empleado2.subeSueldo(5);
		 empleado3.subeSueldo(5);
		 
		 System.out.println("nombre "+empleado1.dameNombre()+" sueldo "+
		 empleado1.dameSueldo()+" inicio a trabajar desde "+empleado1.dameFechacontrato());
		 
		 System.out.println("nombre "+empleado2.dameNombre()+" sueldo "+
		 empleado2.dameSueldo()+" inicio a trabajar desde "+empleado2.dameFechacontrato());
		 
		 System.out.println("nombre "+empleado3.dameNombre()+" sueldo "+
		 empleado3.dameSueldo()+" inicio a trabajar desde "+empleado3.dameFechacontrato());
		 
		 */
		
		
		//otra forma es crear un array para almacenar los empleados
		Empleado misEmpleados[]= new Empleado[3];
		//da lo mismo crearlo como arriba o como abajo
		//String miarray[]=new String [3];
		misEmpleados[0]= new Empleado("pepito perez",85000,1990,12,17);
		misEmpleados[1]= new Empleado("Barak Obama",130000,2000,10,15);
		misEmpleados[2]= new Empleado("Maria Pulido",140000,2020,4,5);
		
		
		//vamos a cambiar este for por un for each
		
		/*for (int i=0;i<3;i++) {
			 misEmpleados[i].subeSueldo(5);
		}*/
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		//vamos a cambiar este for por otro for each
		/*for (int i=0;i<3;i++) {
			System.out.println("nombre: "+misEmpleados[i].dameNombre()+" su salario es: "+
		misEmpleados[i].dameSueldo()+" Fecha de ingreso: "+misEmpleados[i].dameFechacontrato());
		}*/
		// sustituye misEmpleados[i].dameNombre() por e.dameNombre()
		for(Empleado e: misEmpleados) {
			System.out.println("nombre: "+e.dameNombre()+" su salario es: "+
					e.dameSueldo()+" Fecha de ingreso: "+e.dameFechacontrato());
		}
		
	}
	
		
// cuando hacemos todo en un solo fichero java que alberga todas las clases, solo debe existir un metodo public y solo un metodo main
}

class Empleado{
	public Empleado(String nom , double sue,int anho,int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		//new estamos llamando al constructor de la clase
		//usamos el calendargregorian del segundo tipo el cual usa tres parametros
		//contruyendo el objeto grego.. el objetivo es construir una fecha
		GregorianCalendar calendario = new GregorianCalendar(anho,mes-1,dia);
		altacontrato=calendario.getTime();
	}
	
	public String dameNombre() {//GETTER
		return nombre;
	}
	
	public double dameSueldo() {//GETTER
		return sueldo;
	}
	public Date dameFechacontrato() {//GETTER
		return altacontrato;
				
	}
	//AHORA METODOS SETTER que hacen operacions y no devuelven, solo establecen valores
	public void subeSueldo(double porcentaje) {//SETTER
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
	
}