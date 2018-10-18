package br.ucsal.bes.poo.avalicao.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contrato {

	private Integer numContrato;
	private String nomeCliente;
	private String enderecoCliente;
	private Integer vlrTotalContrato;
	private List<Veiculo> veiculos;

	public Contrato() {
		this.vlrTotalContrato = 0;
		this.veiculos = new ArrayList<Veiculo>();
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public Integer getVlrTotalContrato() {
		return vlrTotalContrato;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public Boolean adicionarVeiculo(Veiculo veiculo) {

		// Percorrer a lista, e perguntar pra cada item da minha lista se o
		// veiculo que passei, tem a mesma placa que o item
		Boolean isValid = false;

		if (veiculos.isEmpty()) {
			veiculos.add(veiculo);
		} else {

			for (Iterator<Veiculo> item = veiculos.iterator(); item.hasNext(); ) {

				Veiculo i = item.next();
				
				if (!i.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
					veiculos.add(veiculo);
					this.vlrTotalContrato = this.vlrTotalContrato + veiculo.getTipo().getValor();
					isValid = true;
				}

			}
		}

		return isValid;

	}

	public Boolean removerVeiculo(String placa) {

		Boolean isValid = false;

		if (!veiculos.isEmpty()) {

			for (Veiculo item : veiculos) {
				
				if (item.getPlaca().equalsIgnoreCase(placa)) {

					this.vlrTotalContrato = this.vlrTotalContrato - item.getTipo().getValor();
					veiculos.remove(item);
					isValid = true;
				}

			}

		}

		return isValid;

	}

	public List<Veiculo> consultarVeiculos() {

		return this.veiculos;

	}

	public ArrayList<Veiculo> consultarVeiculos(String tipo) {

		ArrayList<Veiculo> result = new ArrayList<>();

		for (Veiculo veiculo : this.veiculos) {

			if (veiculo.getTipo().getNomeTipo().equalsIgnoreCase(tipo)) {

				result.add(veiculo);

			}

		}

		return result;

	}

	public Veiculo consultarVeiculo(String placa) {

		Veiculo veiculo = null;

		for (Veiculo v : veiculos) {

			if (v.getPlaca().equalsIgnoreCase(placa)) {
				veiculo = v;
			}

		}

		return veiculo;

	}

}
