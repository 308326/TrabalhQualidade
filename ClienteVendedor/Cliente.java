package ClienteVendedor;

public class Cliente extends Pessoa {
	
	private double RendaMensal;
	
	public Cliente (int id, String nome, char sexo, double RendaMensal) {
		super (id, nome, sexo);
		this.RendaMensal = RendaMensal;
	}
	
	
	public double getRendaMensal() {
		return RendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		RendaMensal = rendaMensal; //this.RendaMendal = RendaMensal;
	}

	public double calcularLimiteCredito() {
		return RendaMensal* 0.3;
	}

	//Reescrita ou redefini��o de m�todo
	
	/* public void exibirDados() {
	 * super.exibirDados();
	 * system.out.printf ("Limite Cr�dito: %.2f\n", calcularLimiteCredito());
	 * }

	*/
	
}
