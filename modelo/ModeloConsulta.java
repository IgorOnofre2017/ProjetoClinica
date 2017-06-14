package modelo;

public class ModeloConsulta {
	
	private String nomeMedico;
	private String nomePaciente;
	private String data;
	private String turno;
	private String pesquisa;
	
	//Getters
	public String getNomeMedico() {
		return nomeMedico;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public String getData() {
		return data;
	}
	public String getTurno() {
		return turno;
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
	public void setData(String data) {
		this.data = data;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
}
