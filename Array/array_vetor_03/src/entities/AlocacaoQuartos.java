package entities;

public class AlocacaoQuartos {
	
	private String nome;
	private String email;
	
	public AlocacaoQuartos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return nome 
			+	", "
			+	email;
	}
	
}
