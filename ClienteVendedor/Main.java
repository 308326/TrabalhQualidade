package ClienteVendedor;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente cli;
		Vendedor ven;
		
		cli = new Cliente (1, "Victor", 'M', 1200);
		ven = new Vendedor (2, "Reis", 'F', 800, 270);
		
		
		/*	ven.exibirDados();
			cli.exibirDados();
		*/
		
		/* Pessoa p = new Cliente (200, "Eva Green", 'F', 12000);
		 * p.exibirDados();
		 */
		
		cli.calcularLimiteCredito();
		
		ven.calcularSalario(200);
		
		ven.reajustarSalarioBase(270);
		
		System.out.printf("Cliente: %s || Sexo: %s || Renda por M�s: %.2f || Seu limite de cr�dito �: %.2f || \n",cli.getNome(), cli.getSexo(), cli.getRendaMensal(), cli.calcularLimiteCredito());
		System.out.printf("Vendedor: %s || Sexo: %s || Sal�rio do Vendedor �: %.2f || Sal�rio Reajustado do Vendedor �: %.2f",ven.getNome(), ven.getSexo(), ven.calcularSalario(2), ven.reajustarSalarioBase(270));
		
		//Encapsulamento: getters e setters (privates)
		//Polimorfismo: � o exibirDados();, � um m�todo criado em Pessoa (Superclasse) executado em seus filhos (Cliente e Vendedor) de formas diferentes
	}

}
