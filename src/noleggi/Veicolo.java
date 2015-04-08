package noleggi;
import java.util.*;
public class Veicolo {
	private String ID;
	private String descrizione;
	private int veicoliTotali;
	
	public Veicolo(String ID, String descrizione, int veicoliTotali){
		if(ID.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UNA IDENTIFICAZIONE: INSERISCI L'IDENTIFICAZIONE! ");
		else
		this.ID=ID;
		if(descrizione.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UNA DESCRIZIONE: INSERISCI LA DESCRIZIONE! ");
		else
		this.descrizione=descrizione;
		if(veicoliTotali<=0)
			throw new IllegalArgumentException("IL NUMERO DEI VEICOLI TOTALI DEVE ESSERE UN VALORE MAGGIORE DI 0 ");
		else
		this.veicoliTotali=veicoliTotali;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		if(iD.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UNA IDENTIFICAZIONE: INSERISCI L'IDENTIFICAZIONE! ");
		else
			this.ID = iD;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		if(descrizione.length()==0)
			throw new IllegalArgumentException("DEVE AVERE UNA DESCRIZIONE: INSERISCI LA DESCRIZIONE! ");
		else
			this.descrizione = descrizione;
	}
	
	public int getVeicoliTotali() {
		return veicoliTotali;
	}
	
	public void setVeicoliTotali(int veicoliTotali) {
		if(veicoliTotali<=0)
			throw new IllegalArgumentException("IL NUMERO DEI VEICOLI TOTALI DEVE ESSERE UN VALORE MAGGIORE DI 0 ");
		else
		    this.veicoliTotali = veicoliTotali;
	}
	
	public int getVeicoliDisponibili(){
		
	}
	
	public void addNoleggio(Noleggio n){
		
	}
	
	public  Vector getNoleggi(){
		Vector n= new Vector(1,1);
		
		return n;
	}
}
