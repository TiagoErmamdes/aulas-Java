package IFMG;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		double resultado = 0;
		int opera�ao = 0;
		boolean valido = false;

		while (!valido) {
			System.out.println("Digite o numero 1");
			num1 = scan.nextInt();
			System.out.println("Digite o numero 2");
			num2 = scan.nextInt();

			System.out.println("====================\r\n" + "Calculadora de Fulano\r\n" + "====================\r\n"
					+ "Op��es:\r\n" + "1 - Soma\r\n" + "2 - Subtra��o\r\n" + "3 - Multiplica��o\r\n" + "4 - Divis�o\r\n"
					+ "5 � Sair\r\n" + "==================== ");

			opera�ao = scan.nextInt();
			resultado=0;
			if (num2 == 0 && opera�ao == 4) {
				System.out.println("O denominado n�o pode ser 0");
			} else {

				switch (opera�ao) {
				case 1:
					resultado =(double) num1 + num2;
					break;
				case 2:
					resultado =(double) num1 - num2;
					break;
				case 3:
					resultado =(double) num1 * num2;
					break;
				case 4:
					resultado =(double) num1 / num2;
					break;
				case 5:
					valido = true;
					break;
					
				default:
					break;
				}
			}System.out.println(resultado);
		}
		System.out.println("FIM");
		
	}

}
