package br.com.gerenation.atvpoo;

public class TestaCliente {

	// 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	// esta classe, em seguida crie um objeto cliente, defina as instancias deste
	// objeto e apresente as informações deste objeto no console.
	public static void main(String[] args) {
		
		Cliente cadastro = new Cliente();

		cadastro.nome = "Felipe";
		cadastro.endereco = "Rua do Consagrado, n1";
		cadastro.telefone = 1199991111;
		cadastro.produto = 123;// código do produto.
		
		System.out.println("***VENDA***");
		System.out.println("O nome do cliente: " + cadastro.nome);
		System.out.println("O endereço do cliente: " + cadastro.endereco);
		System.out.println("Telefone de contato: " + cadastro.telefone);
		System.out.println("Produto selecionado para compra: " + cadastro.produto);
		cadastro.comprar();
		System.out.println();
		System.out.println("***TROCAS***");
		System.out.println("O nome do cliente: " + cadastro.nome);
		System.out.println("O endereço do cliente: " + cadastro.endereco);
		System.out.println("Telefone de contato: " + cadastro.telefone);
		System.out.println("Produto selecionado para troca: " + cadastro.produto);
		cadastro.trocar();
	}
}