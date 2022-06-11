package servicos;

import java.text.ParseException;

public interface ServicoInvestimento { 
 double calcularConta();
 double getValorAGanhar();
 double getTotal();
 double getMesesRestantes();
String format() throws ParseException;
	    
	    
}
