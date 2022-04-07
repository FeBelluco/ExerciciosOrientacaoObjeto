package br.com.gerenation.atvpoo;

public class TestaAviao {
	//2) Crie uma classe avião e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto avião, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	public static void main(String[] args) {

		Aviao embarque = new Aviao();

		embarque.nome = "Felipe";
		embarque.numeroDaPassagem = 17171;
		embarque.numeroDoVoo = 53105;
		embarque.rota = "São Paulo - Nova Iorque";
		embarque.assento = 51;

		System.out.println("***PORTÃO DE EMBARQUE/BOARDING GATE***");
		System.out.println("O nome do passageiro: " + embarque.nome);
		System.out.println("Número de passagem: " + embarque.numeroDaPassagem);
		System.out.println("Destino/Rota: " + embarque.rota);
		System.out.println("Assento: " + embarque.assento);
		embarque.viajar();
		System.out.println();
		System.out.println("***TELA DE EMBARQUE***");
		embarque.informar();

	}
}
