package model;

public class Proprietario {

	private String nome;
	private int CPF;			//Coloquei como String por motivos de o CPF ter ponto e traço
	private int telefone;	//Mesmo motivo do telefone, porem caso voce ache melhor deixar como Int, so alterar.
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
