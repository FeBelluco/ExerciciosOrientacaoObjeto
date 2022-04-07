package br.com.gerenation.atvpoo;

public class Aviao {

	String nome;
	String rota;
	int numeroDoVoo;
	int numeroDaPassagem;
	int assento;
	
	void viajar() {
		System.out.println("Olá " + nome + ", seu número de voo é " + numeroDoVoo +
				", com destino " + rota + ", seu assento é o número " + assento + "." + "\nEMBARQUE EM 15 MINUTOS");
	}

	void informar() {
		System.out.println("Atenção passageiros do voo: " + numeroDoVoo +
				" com destino " + rota + "\n***EMBARQUE IMEDIATO!!!***");
	}
}