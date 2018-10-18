package br.ucsal.bes.poo.avalicao.TUI;

import java.util.List;

import br.ucsal.bes.poo.avalicao.enums.TipoEnum;
import br.ucsal.bes.poo.avalicao.model.Contrato;
import br.ucsal.bes.poo.avalicao.model.Veiculo;

public class ContratoTUI {

	public static void main(String[] args) {

		start();

	}

	private static void start() {

		Contrato contrato1 = new Contrato();

		Veiculo veiculo = new Veiculo("123123", 0211, TipoEnum.BASICO);
		Veiculo veiculo2 = new Veiculo("123124", 0211, TipoEnum.LUXO);
		Veiculo veiculo3 = new Veiculo("123125", 0211, TipoEnum.INTERMEDIARIO);
		Veiculo veiculo4 = new Veiculo("123126", 0211, TipoEnum.BASICO);

		contrato1.adicionarVeiculo(veiculo);
		contrato1.adicionarVeiculo(veiculo2);

		List<Veiculo> listaVeiculos = contrato1.consultarVeiculos();

		for (Veiculo item : listaVeiculos) {

			System.out.println("Placa: " + item.getPlaca());
			System.out.println("Tipo: " + item.getTipo().getNomeTipo());

		}

		contrato1.removerVeiculo("123123");

	}

}
