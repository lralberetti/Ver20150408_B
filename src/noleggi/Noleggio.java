package noleggi;

public class Noleggio {
	private String ID;
	private int veicoli;
	
	public String getID() {
		return ID;
	}
	//nome della stringa.lenght =0
	public void setID(String iD) {
		if(iD.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UNA IDENTIFICAZIONE: INSERISCI L'IDENTIFICAZIONE! ");
		else
			this.ID = iD;
	}
	
	public int getVeicoli() {
		return veicoli;
	}
	
	public void setVeicoli(int veicoli) {
		if(veicoli<=0)
			throw new IllegalArgumentException("IL NUMERO DELLE PORTE DEVE ESSERE UN VALORE MAGGIORE DI 0");
		else
			this.veicoli = veicoli;
	}
	
	public Cliente getCliente(){
		return Cliente;
	}
	
	public Noleggio(String iD, int veicoli) {
		super();
		ID = iD;
		this.veicoli = veicoli;
	}
	
}
