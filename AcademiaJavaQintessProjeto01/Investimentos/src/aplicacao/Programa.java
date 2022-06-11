package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Banco;
import entidades.Investimento;
import entidades.Contrato;
import entidades.Pic;
import personalizada.Erro;
import servicos.ServicoBanco;
import servicos.ServicoInvestimento;
import servicos.ServicoPic;

public class Programa {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		System.out.println("Digite quantos meses você tem de Contrato : ");

		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\rl1galaspr\\Documents\\AcademiaJavaQintessProjeto01\\Contrato.txt"))) {
			int month = sc.nextInt();

			ServicoInvestimento investimento = new Investimento(month);
			ServicoBanco banco = new Banco();
			ServicoPic aplicacao = new Pic();
			Contrato contrato = new Contrato(investimento, banco, aplicacao);

			System.out.println(contrato.formated());

			bw.write(contrato.formated());
			bw.newLine();
			bw.close();
		}

		catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} catch (InputMismatchException f) {
			System.out.println("Error : Digite apenas números");
		} catch (Erro g) {
			System.out.println("Error : " + g.getMessage());
		} finally {
			sc.close();
			System.out.println("Programa Finalizado");
		}

	}

}
