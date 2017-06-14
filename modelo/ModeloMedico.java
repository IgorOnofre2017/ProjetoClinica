package modelo;

public class ModeloMedico extends ModeloFuncionario{
	
	private int crm;
	private String especializacao;
	
	//Getters
	public int getCrm() {
		return crm;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	
	//Setters
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
}
