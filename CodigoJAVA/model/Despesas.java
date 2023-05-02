package model;

public class Despesas
{

	private float valor;
	private String tipo;
	private String descricao;
	private String dataPag;
	private String dataVenc;

	public Despesas()
	{
		super();
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataPag() {
		return dataPag;
	}

	public void setDataPag(String dataPag) {
		this.dataPag = dataPag;
	}

	public String getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(String dataVenc) {
		this.dataVenc = dataVenc;
	}

}
