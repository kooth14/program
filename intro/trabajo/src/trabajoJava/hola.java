package trabajoJava;
import java.util.Scanner;
public class hola {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		double b ;
		System.out.println("ingrese la cantidad de numeros que quiera digitar");
		b = l.nextDouble();
		
		/*do{
			num++;
			System.out.println("Ingrese el numero #"+num);
			a = l.nextDouble();
			i++;
			if(0 < a) 
			{
				c = a;
				System.out.println(c);
			}
			if(a < 0) 
			{
				c = a + a;
				System.out.println(c);
			}
			
			
		}while(i <  b);*/ 
		double   c = 0, d = 0;
		
		int num = 0;int as = 0;
		for(int x = 0; x<b; x++ ) {
			double a, y ;
			num++;
			System.out.println("Ingrese el numero #"+num);
			a=l.nextDouble();
			if(0 < a) 
			{	 ++as;
				c = c + a;
				y =c/as;
				if(x < b-1) {
					System.out.println("El promedio actual es de: " + y);
				}
				
				if(x == b-1) {
					System.out.println("El promedio final es de: " + y);
				}
			}else {
				if(a < 0) 
				{
					d= d+ a;
					
					if(x < b-1) {
						System.out.println("La suma actual es de: " + d);
						x = 0;
						
					}
					
					if(x == b-1) {
						System.out.println("La suma final es de: " + d);
					}
					
					
				}
			}
			
			
			
		
		} 
		
	
		
	}

}
