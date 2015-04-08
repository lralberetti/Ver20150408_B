package noleggi;

public class Cliente {
	private String nome=new String();
	private String cognome=new String();
	private String email=new String();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UN NOME: INSERISCI IL NOME DELL'UTENTE! ");
		else
			this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		if(cognome.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UN COGNOME: INSERISCI IL COGNOME DELL'UTENTE! ");
		else
			this.cognome = cognome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.length()==0)
				throw new IllegalArgumentException("DEVE AVERE UN EMAIL: INSERISCI L'EMAIL DELL'UTENTE! ");
		else
			this.email = email;
	}

	public Cliente(String nome, String cognome, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + "]";
	}

}
