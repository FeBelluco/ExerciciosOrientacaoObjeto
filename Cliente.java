package br.com.gerenation.atvpoo;

public class Cliente {

	String nome;
	String endereco;
	int produto;
	int telefone;

	void comprar() {
		System.out.println("O " + nome + " comprou o produto: " + produto);
	}
	void trocar() {
		System.out.println("O" + nome + " efetuou a troca: " + produto);
		
	}
}
