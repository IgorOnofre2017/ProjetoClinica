package modelo;

public class ModeloExame {
	
	private String nomeMedico;
	private String nomePaciente;
	private String nomeExame;
	private String pesquisa;
	
	//Getters
	public String getNomeMedico() {
		return nomeMedico;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public String getPesquisa() {
		return pesquisa;
	}
	
	//Setters
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
}
