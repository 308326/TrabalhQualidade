package ClienteVendedor;

public class Vendedor extends Pessoa {
	
	private double salarioBase;
	private float comissao;
	
	public Vendedor (int id, String nome, char sexo, double salarioBase, float comissao) {
		super (id, nome, sexo);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario (double totalVendas) {
		return salarioBase + totalVendas * comissao / 100;
	}
	
	public void reajustarSalarioBase (float percentual) {
		setSalarioBase (getSalarioBase() + getSalarioBase() * percentual/100);
	}
	
	//Reescrita ou redefinição de método
	
	/*
		public void exibirDados() {
		super.exibirDados();
		system.out.printf ("Salário Base: %.2f\n", salarioBase);
		}
		
	*/
	
}
