package processoPoo;

public class Caneta {
	String cor ;
	String modelo;
	double ponta;
	boolean tampada = true;
	
	
	public void status() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Est� tampada: "+this.tampada);
	}
	
	void tampa(){
		if (tampada == true) {
			System.out.println("Erro, C�neta tampada");
		}else {
			System.out.println("EscreVaaaaaa \\o/");
		}

	
	
	}
}
