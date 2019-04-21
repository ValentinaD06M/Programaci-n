import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		operaciones metodos = new operaciones ();
		Scanner entrada = new Scanner (System.in);
		int num1, num2, num3, num4, num5, resultado, opcion;
		boolean op= true; 
		while (op) { 
	
		System.out.println (" Menu");
		System.out.println ("1. Suma");
		System.out.println ("2. Resta");
		System.out.println ("3. Multiplicación");
		System.out.println ("4. División");
		System.out.println ("5. Porcentaje");
		System.out.println ("6. Calcular el promedio de 5 números");
		System.out.println ("7. Calcular el máximo de 3 números");
		System.out.println ("8. Salir\n");
		System.out.println ("Seleccionar opcion");
		opcion = entrada.nextInt();
		
		if (opcion == 8) {
			System.out.println("Termina...");
			break;
		}
		else
		{
			switch (opcion) {
				case 1:
					System.out.println("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.println("Ingrese el segundo valor");
					num2 = entrada.nextInt();
					resultado = num1+num2;
					System.out.println("la suma es: " + resultado);
					break;
				case 2:
					System.out.println("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.println("Ingrese el segundo valor");
					num2 = entrada.nextInt();
					resultado = num1-num2;
					System.out.println("la resta es: " + resultado);
					break;
				case 3:
					System.out.println("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.println("Ingrese el segundo valor");
					num2 = entrada.nextInt();
					resultado = num1*num2;
					System.out.println("la multiplicación es: " + resultado);
					break;	
				case 4:
					System.out.println("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.println("Ingrese el segundo valor");
					num2 = entrada.nextInt();
					resultado = num1/num2;
					System.out.println("la división es: " + resultado);
					break;
				case 5:
					System.out.println("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.println("Ingrese el segundo valor");
					num2 = entrada.nextInt();
						resultado =  num1*num2/100; 
					System.out.println("el porcentaje es: " + resultado);
					break;	
				case 6:
					System.out.println("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.println("Ingrese el segundo valor");
					num2 = entrada.nextInt();
					System.out.println("Ingrese el tercer valor");
					num3 = entrada.nextInt();
					System.out.println("Ingrese el cuarto valor");
					num4 = entrada.nextInt();
					System.out.println("Ingrese el quinto valor");
					num5 = entrada.nextInt();
					int suma = (int) (num1 + num2 + num3 + num4 + num5);
					int promedio = 0; 
					resultado = (suma/5);
					System.out.println("el promedio de 5 numeros es: " + resultado);
					break;
				case 7:
					System.out.print("Ingrese el primer valor");
					num1 = entrada.nextInt();
					System.out.print("Ingrese el segundo valor");
					num2 = entrada.nextInt();
					System.out.print("Ingrese el tercer valor");
					num3 = entrada.nextInt();
					if (num1 > num2) {
						if (num1 > num3) {
							System.out.println("El número mayor es:" + num1);
						}
						else
						{
							System.out.println("El número mayor es:" + num3);
						}
						}
						else if (num2 > num3) {
							System.out.println("El número mayor es:" + num2);
						}
						else
						{
							System.out.println("El número mayor es:" + num3);
						}
			}
		}
		}
		
			}
	}
			

------------------------------------------------------------------------------------------------------------------------


import java.util.Scanner;

public class operaciones {

	public static void main(String[] args) {
	}
	
	public static int Suma (int num1, int num2){
		return num1 + num2;
	}
	
	public static int Resta (int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicación (int num1, int num2) {
		int resultado = 0;
			for (int i = 1 ; i <= num2 ; i ++) {
				resultado = resultado + num1;
			}
			return resultado;
			}
	
	public double division (int num1 , int num2) {
		if (num2 != 0) {
			return num1 /(num2 * 1.0);
			}
		else {
			return Double.NaN;
			 }
	}
	
	public double porcentaje (int num , double porc) {
			{
			if (porc >= 0.0 && porc <= 1.0) {
				return num * porc;
		}
			else
		{
			return Double.NaN;
		}
	}
	}
	
	public double promedio (int num1, int num2, int num3, int num4, int num5) {
			return num1+num2+num3+num4+num5/5;
			}
	
	public static int maximo (int num1, int num2, int num3) {
				if (num1 > num2) {
				if (num1 > num3) {
					System.out.println("El número mayor es:" + num1);
				}
				else
				{
					System.out.println("El número mayor es:" + num3);
				}
				}
				else 
					if (num2 > num3) {
					System.out.println("El número mayor es:" + num2);
				}
				else
				{
					System.out.println("El número mayor es:" + num3);
				}
				return num1*num2*num3;
		}
	}



--------------------------------------------------------------------------------------------------------------------
	
	package uri_ejercicios;

import java.io.*;
import java.util.Scanner;

public class Main {


public static void main(String[] args)
{
BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));

try
{	
	//Aca debe estar la logica que usted propone para resolver el problema
	//Leer de entero: int x = Integer.parseInt( br.readLine() )	
	int x [][];
	x = new int [1][4];
	x[1][1] = 1;
	x[1][2] = 2;
	x[1][3] = 3;
	x[1][4] = 4;
	
	for (int j=0;j<4; j++)
	{
		System.out.println(""+x[1][j]);
	}
bw.flush();
}
catch(Exception ex) 
{
ex.printStackTrace();
}
}
{
	try
	{	
		//Aca debe estar la logica que usted propone para resolver el problema
		//Leer de entero: int x = Integer.parseInt( br.readLine() )	
		final int Filas = 4, Columnas = 22;
		Scanner sc = new Scanner (System.in);
		int i, j, mayor, menor;
		int filaMayor, filaMenor, colMayor, colMenor;
		int [][] A = new int[Filas][Columnas];
		System.out.println("leer matriz:");
		for (i = 0; i < Filas; i++) {
			for (j = 0; j < Columnas; j++) {
				System.out.print("A[" + i + "][" + j + "]= ");
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("valores introducidos:");
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
			System.out.print(A[i] [j] + " ");
		}
		System.out.println();
	}
		mayor = menor = A[0][0];
		filaMayor = filaMenor = colMayor = colMenor = 0;
		
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
				if (A[i][j] > mayor) {
					mayor = A[i][j];
					filaMayor = i;
					colMayor = j;
				}
				else if (A[i][j] < menor) {
					menor = A[i][j];
					filaMenor = i;
					colMenor = j;
				}
			}
	}
		{
	System.out.print("Elemento mayor: " + mayor);
	System.out.println(" Fila: "+ filaMayor + " columna: " + colMayor);
	System.out.print("Elemento menor: " + menor);
	System.out.println(" Fila: "+ filaMenor + " columna: " + colMenor);
	}
	bw.flush();
	}
	catch(Exception ex) 
	{
	ex.printStackTrace();
}	
}
}


	
