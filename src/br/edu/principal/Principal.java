package br.edu.principal;

import br.edu.pacoteUm.Diretor;
import br.edu.pacoteUm.Funcionario;
import br.edu.pacoteUm.Operario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Não se instancia objetos com classe abstrata
		 * Deve-se usar as classes filhas Diretor e Operario
		 */
		Funcionario operario = new Operario();
		System.out.println("Um operário ganha: "+operario.calculasalario());
		
		Funcionario diretor = new Diretor();
		System.out.println("Um diretor ganha: "+diretor.calculasalario());
		
		
		
	}

}
