package br.com.gerenation.atvpoo;

public class TestaAviao {
	//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	public static void main(String[] args) {

		Aviao embarque = new Aviao();

		embarque.nome = "Felipe";
		embarque.numeroDaPassagem = 17171;
		embarque.numeroDoVoo = 53105;
		embarque.rota = "S�o Paulo - Nova Iorque";
		embarque.assento = 51;

		System.out.println("***PORT�O DE EMBARQUE/BOARDING GATE***");
		System.out.println("O nome do passageiro: " + embarque.nome);
		System.out.println("N�mero de passagem: " + embarque.numeroDaPassagem);
		System.out.println("Destino/Rota: " + embarque.rota);
		System.out.println("Assento: " + embarque.assento);
		embarque.viajar();
		System.out.println();
		System.out.println("***TELA DE EMBARQUE***");
		embarque.informar();

	}
}
