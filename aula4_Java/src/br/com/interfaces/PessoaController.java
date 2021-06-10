package br.com.interfaces;

import projeto1505.Pessoa;
import projeto1505.PessoaFisica;

public class PessoaController {

	public static void main(String[] args) {
		
		Pessoa person1 = new Pessoa();
		
		person1.setId(1);
		person1.setNome("Alberto Roberto");
		person1.setTelefone("31 9999-9999");
		
		System.out.println(person1);
		System.out.println(person1.calcularSalario());
		
		Pessoa person2 = new PessoaFisica();
		person2.setId(2);
		person2.setNome("Joana Luana");
		person2.setTelefone("31 9999-9999");

		
		System.out.println(person2);
		System.out.println(person2.calcularSalario());

		// utilizando da interface. Decalra interface como o tipo do objeto
		//mas ela é construída com uma classe que implementa a interface
		IPessoa person3 = new PessoaFisica();
		System.out.println(person3.calcularSalario());
		
	}
}
