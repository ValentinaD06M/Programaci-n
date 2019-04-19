import java.io.*;

public class Calculadora {

	public static void main(String[] args){		
	}
			BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));	
			
			public static int Suma (int num1 , int num2){
				return num1 + num2;
			}
			
			public static int Resta (int num1 , int num2) {
				return num1 - num2;
			}
			
			public static int multiplicación (int num1 , int num2) {
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
			
			public class Promedio {
					
					int num1; int num2; int num3; int num4; int num5;
					int suma = (num1 + num2 + num3 + num4 + num5);
					int promedio = 0; {
					promedio = (suma / 5);
					System.out.println("promedio de los 5 numeros:" + promedio);
				}		
			}
					switch (option) {
					}
					case0:
					{
						bw.write("case 0 \n");
					}
					breakcase1:
					{
						bw.write("case 1 \n");
