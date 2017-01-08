package calcu;

import java.util.Scanner;

public class Calcular 
{

	public static void saludoInicial(String nombre)
	{
		
		System.out.println("Hola " + nombre);
		
	}
	
	public static int sumar(int num1, int num2 )
	{
		
		return num1+num2;
		
		
	}
	
	public static double multiplicar(double a, double b)
	{
		
		return a*b;
		
		
	}
	
	
	public static double dividir(double a, double b)
	{
		
		return a/b;
		
		
	}
	
	
	public static double restar(double a, double b)
	{
		
		return a-b;
		
		
	}
	
	public static void main(String[] args) 
	{
		
		Scanner lee = new Scanner(System.in);
		System.out.print("INGRESA TU NOMBRE ==>");
		saludoInicial(lee.nextLine());
		boolean flag = false;
		do{
			
			System.out.print(" \n Ingrese una opcion \n 1. \t Sumar \n 2. \t Multiplicar \n 3. \t Dividir \n 4. \t Restar \n 5. \t Salir"
			+ "\n Ingrese la opcion a ingresar (1,2,3,4,5) -->");
			int choose = lee.nextInt();
			System.out.println("La opcion escogida fue " +choose); // me imprime la opcion que elige el usuario
			switch (choose)
			{
			
			case 1: // para sumar
				
				System.out.print("Ingrese el primer digito a Sumar ->");
				int a = lee.nextInt();
				System.out.print("Ingrese el segundo digito a Sumar ->");
				int b = lee.nextInt();
				System.out.println("El resultado de la suma es " +sumar(a,b));
				//flag = true;
				//lee.nextLine();
				break;
				
			case 2: // para multiplicar
				
				System.out.print("Ingrese el primer digito a Multiplicar ->");
				double a1 = lee.nextDouble();
				System.out.print("Ingrese el segundo digito a Multiplicar ->");
				double b1 = lee.nextDouble();
				System.out.println("El resultado de la Multiplicacion es " +multiplicar(a1,b1));
				//flag = true;
				break;
				
				
			case 3: // para dvidir
				
				System.out.print("Ingrese el primer digito a Dividir ->");
				double a2 = lee.nextDouble();
				System.out.print("Ingrese el segundo digito a Dividir ->");
				double b2 = lee.nextDouble();
				System.out.println("El resultado de la Division es " +dividir(a2,b2));
				//flag = true;
				break;
				
			case 4: // para restar
				
				System.out.print("Ingrese el primer digito a Restar ->");
				double a3 = lee.nextDouble();
				System.out.print("Ingrese el segundo digito a Restar ->");
				double b3 = lee.nextDouble();
				System.out.println("El resultado de la Resta es " +restar(a3,b3));
				//flag = true;
				break;
					
				
			case 5: // para SALIR
				
			flag = true;
			break;
			
			}
			
			
			//flag = true;
			
		}while(flag == false);
		
		System.out.println("HASTA LA VISTA BABY");
		
		//System.out.println(sumar(5,6));
		//System.out.println(multiplicar(80,50));
		//System.out.println(dividir(50,130));

	}

}
