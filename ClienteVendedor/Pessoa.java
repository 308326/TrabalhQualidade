package ClienteVendedor;

public class Pessoa {
	
	protected int id;
	protected String nome;
	protected char sexo;
	private String logradouro;
	private int cep;
	private String cidade;
	private String uf;
	
	public Pessoa (int id, String nome, char sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	/*public void exibirDados() {
	 * String tratamento;
	if (sexo == 'F') 
	tratamento = "Sra. ";
	else
	tratamento = "Sr. ";
	system.out.println(tratamento + nome);

	*/
	
}
