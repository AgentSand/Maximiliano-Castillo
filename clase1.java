
package clase1;
import java.util.Scanner;
public class clase1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
	//TP 1-a
	int numeroInicio=5;
	int numeroFin=14;
	System.out.println("Trabajo Práctico N° 1_a");
	while (numeroInicio <= numeroFin) {
		System.out.println(numeroInicio);
		numeroInicio=numeroInicio+1;
	}
	//TP 1_b
	System.out.println("Trabajo Práctico N° 1_b");
	numeroInicio=5;	
	while (numeroInicio <= numeroFin) {
		if ((numeroInicio % 2)==0){
			System.out.println(numeroInicio);
		}
		numeroInicio=numeroInicio+1;
	}
	//TP 1_c
	System.out.println("Trabajo Práctico N° 1_c");
	numeroInicio=5;
	int deci;
	Scanner dato= new Scanner (System.in);
	deci = 3;
	while (deci!=1 && deci!=2) {
		System.out.print("Ingrese 1(números impares) o 2 (números pares): ");
		deci = dato.nextInt();
		dato.close();
	}
		while (numeroInicio <= numeroFin) {
			if (deci==2) {
				if ((numeroInicio % 2)==0 ){
					System.out.println( "N° par "+numeroInicio);}			
				
			}
			else if ((numeroInicio % 2)!=0 && deci==1) {
				System.out.println("N° impar "+numeroInicio);
					}				
			numeroInicio=numeroInicio+1;
	}
		
		//TP 1_d	
	System.out.println("Trabajo Práctico N° 1_d");
	numeroInicio=5;
	
	for (int x=numeroFin; numeroInicio <= x; x--) {
		
			System.out.println(x);
		
		}
	//TP 2_d
	int ingmen=500000;//ingresos mensuales
	int canvi=4;
	int inmu=5;
	int lujo=0;
	System.out.println("El usuario con las siguientes caracteristicas \nIngresos:"+ingmen +"\nCantidad de vehículos: "+canvi+"\nCantidad de inmuebles: "+inmu+"\nCantidad de bienes de lujo: "+lujo);
	if (ingmen>=489083) {
		if (canvi>=3) {
			if (inmu>=3) {
				if (lujo>=1) {
					System.out.println("\nPertenece al segmento de ingresos altos");
					
				}else {System.out.println("\nNo pertenece al segmento de ingresos altos");}
			}else {System.out.println("\nNo pertenece al segmento de ingresos altos");}
		}else {System.out.println("\nNo pertenece al segmento de ingresos altos");}
	}else {System.out.println("\nNo pertenece al segmento de ingresos altos");}

}
}