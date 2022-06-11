package entidades;

public class Banco extends AbstractServiceBanco {
	private double amount = 24256.11;
	private String name = "PIC";

	public Banco() {

	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

}
