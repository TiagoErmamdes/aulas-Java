package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicios4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double porcentagemA;
		double porcentagemB;
		double popA ;
		double popB ;
		boolean valido =false;
		int i =0;
		String resposta = "s";
	do {
		do {
			
		System.out.println("Digite a quantidade de popula��o A");
		popA=scan.nextDouble();
		if(popA>0) {
			valido=true;
		}else {
			System.out.println("O valor n�o pode ser menor que 0");
		}}while(!valido);
		valido=false;
		do {
		System.out.println("Digite a porcetagem de crescimento de A");
		porcentagemA  = scan.nextDouble();
		if(porcentagemA>0) {
			valido=true;
		}else {
			System.out.println("A porcentam n�o pode ser negativa");
		}}while(!valido);
		
		
		
		
		
		do {
			valido=false;
			System.out.println("Digite a quantidade de popula��o B");
			popB=scan.nextDouble();
			if(popB>0 ) {
				valido=true;
				}else {System.out.println("O valor n�o pode ser menor que 0");
				} 
			valido=false;
			if (popB>popA){
				valido=true;
			}else{System.out.println("O valor deve ser maior que popula��o A");}
			
			}while(!valido);
			valido=false;
			do {
			System.out.println("Digite a porcetagem de crescimento de B");
			porcentagemB  = scan.nextDouble();
			if(porcentagemB>0) {
				valido=true;
			}else {
				System.out.println("A porcentam n�o pode ser negativa");
			}}while(!valido);
		
		
		while (popA < popB) {
			popA += (popA)/100*porcentagemA;
			popB +=(popB)/100* porcentagemB;
			i++;
		}
		System.out.println(i);
		System.out.println("Quer repetir o teste ? (s/n)");
		resposta = scan.next();
	}while(resposta.equalsIgnoreCase("s"));
	System.out.println("FIM");
	}
	
}
