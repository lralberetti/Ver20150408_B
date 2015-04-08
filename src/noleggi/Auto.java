package noleggi;

public class Auto extends Veicolo{
	private int porte;
	
	public void setPorte(int porte){
		if(porte<=0)
			throw new IllegalArgumentException("IL NUMERO DELLE PORTE DEVE ESSERE UN VALORE MAGGIORE DI 0");
		else
			this.porte=porte;
	}
	
	public int getPorte() {
		return porte;
	}

	public Auto(String ID, String descrizione, int veicoliTotali, int porte) {
		super(ID, descrizione, veicoliTotali);
		if(porte<=0)
			throw new IllegalArgumentException("IL NUMERO DELLE PORTE DEVE ESSERE UN VALORE MAGGIORE DI 0");
		else
		this.porte = porte;
	}

	
}
