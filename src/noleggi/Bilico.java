package noleggi;

public class Bilico extends Veicolo{
	private double portata;

	public double getPortata() {
		return portata;
	}

	public void setPortata(double portata) {
		if(portata<=0){
			throw new IllegalArgumentException("INSERISCI UN VALORE POSITIVO");
		}
		else
			this.portata = portata;
	}

	public Bilico(String ID, String descrizione, int veicoliTotali,
			double portata) {
		super(ID, descrizione, veicoliTotali);
		if(portata<=0){
			throw new IllegalArgumentException("INSERISCI UN VALORE POSITIVO");
		}
		else
		this.portata = portata;
	}
	
	
	
}
