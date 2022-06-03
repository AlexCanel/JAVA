package entities;

public class Conta {
	
	private int numeroConta;
	private String titularConta;
	private double valorConta;
	
	public Conta() {	
	}
	
	public Conta(int numeroConta, String titularConta, double valorConta) {
		super();
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		deposito(valorConta);
	}

	public Conta(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getValorConta() {
		return valorConta;
	}
	
	public void deposito(double deposito) {
		this.valorConta += deposito;
	}
	
	public void saque(double saque) {
		this.valorConta = valorConta - saque - 5.00 ;
	}
	
	public String toString() {
		return "Acount "
			+	numeroConta
			+	", Holder: "
			+	titularConta
			+	", Balance: $ "
			+	String.format("%.2f%n", valorConta);
				
	}
	
}
