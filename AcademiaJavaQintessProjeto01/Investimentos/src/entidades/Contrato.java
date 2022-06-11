package entidades;

import java.text.ParseException;

import servicos.ServicoBanco;
import servicos.ServicoInvestimento;
import servicos.ServicoPic;

public class Contrato {

	private ServicoInvestimento conta1;
	private ServicoBanco conta2;
	private ServicoPic conta3;

	public Contrato(ServicoInvestimento conta1, ServicoBanco conta2, ServicoPic conta3) {
		this.conta1 = conta1;
		this.conta2 = conta2;
		this.conta3 = conta3;
	}

	private double totalFacul_bit() {
		return conta1.getValorAGanhar() - conta3.calcularConta();
	}

	private double totalFinal() {
		return totalFacul_bit() + conta2.getAmount();
	}

	public String formated() throws ParseException {
		StringBuilder bd = new StringBuilder();
		bd.append("---INFORMAÇÕES----\n");
		bd.append("---INFORMAÇÕES DE INVESTIMENTO---\n");
		bd.append(conta2.format() + "\n");
		bd.append("----------------\n");
		bd.append("---INFORMAÇÕES BANCO ITAÚ---\n");
		bd.append(conta1.format() + "\n");
		bd.append("----------------\n");
		bd.append("---INFORMAÇÕES APLICAÇÃO AUTOMATICA---\n");
		bd.append(conta3.format() + "\n");
		bd.append(" TOTAL - PIC : " + String.format("%.2f", totalFacul_bit()) + " (18 x 500)- Investimento \n");
		bd.append("----------------\n");
		bd.append("---TOTAL GERAL---\n");
		bd.append("Total ganho em 08/02/2024 :" + totalFinal() + "\n");
		bd.append("---INFORMAÇÕES----\n");
		return bd.toString();
	}

	public ServicoInvestimento getConta1() {
		return conta1;
	}

	public void setConta1(ServicoInvestimento conta1) {
		this.conta1 = conta1;
	}

	public ServicoBanco getConta2() {
		return conta2;
	}

	public void setConta2(ServicoBanco conta2) {
		this.conta2 = conta2;
	}

	public ServicoPic getConta3() {
		return conta3;
	}

	public void setConta3(ServicoPic conta3) {
		this.conta3 = conta3;
	}

}
