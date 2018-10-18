package br.ucsal.bes.poo.avalicao.model;

import br.ucsal.bes.poo.avalicao.enums.TipoEnum;

public class Veiculo {

	private String placa;
	private Integer anoFrabricacao;
	private TipoEnum tipo;

	public Veiculo(String placa, Integer anoFrabricacao, TipoEnum tipo) {
		super();
		this.placa = placa;
		this.anoFrabricacao = anoFrabricacao;
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public Integer getAnoFrabricacao() {
		return anoFrabricacao;
	}

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

}
