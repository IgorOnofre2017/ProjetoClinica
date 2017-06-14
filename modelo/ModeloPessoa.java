package modelo;

public class ModeloPessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	private int identidade;
	private int cpf;
	private int telefone;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String pesquisa;
	
	
	//Constructor
	public ModeloPessoa(){
		
	}
	
	
	//Getters
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getSexo() {
		return sexo;
	}
	public int getIdentidade() {
		return identidade;
	}
	public int getCpf() {
		return cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public String getRua() {
		return rua;
	}
	public String getPesquisa() {
		return pesquisa;
	}
	
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	
}
