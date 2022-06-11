package servicos;

public interface ServicoBanco {
	String getName();
	Double getAmount();
	default public String format() {
		
		return getName() + ", Saldo : " + String.format("%.2f", getAmount()) + "\n";
	}



}
	
	
	

