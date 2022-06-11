package servicos;

import java.text.ParseException;

public interface ServicoPic{

	int getPeriodos_3();
	double getMensalidade();
default double calcularConta() {
		
		return 	getPeriodos_3() * getMensalidade();
	}

    String format() throws ParseException;
    
    
    
	
	
	
	
}
