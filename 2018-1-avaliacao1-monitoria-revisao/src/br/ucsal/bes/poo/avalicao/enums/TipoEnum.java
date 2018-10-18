package br.ucsal.bes.poo.avalicao.enums;

public enum TipoEnum {

	BASICO(100, "basico"), INTERMEDIARIO(130, "intermediario"), LUXO(156, "luxo");

	private Integer valor;
	private String nomeTipo;

	private TipoEnum(Integer valor, String tipo) {
		this.valor = valor;
		this.nomeTipo = tipo;
	}

	public Integer getValor() {
		return valor;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

}
