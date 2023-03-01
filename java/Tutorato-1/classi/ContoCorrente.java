package classi;

public class ContoCorrente {
	private double saldo;
	private String password;

	/* costruttore: permette di creare un conto corrente bancario con saldo uguale a zero e registrare una password */
	public ContoCorrente(String p){
		this.saldo = 0.0;
		this.password = p;
	}

	/* effettua un versamento */
	public void deposita(double d, String p) {
		if (this.controlloPassword(p))
			saldo += d;
	}

	/* effettua un prelievo */
	public void preleva(double d, String p) {
		if (this.controlloPassword(p))
			saldo -= d;
	}

	/* restituisce il saldo */
	public double leggiSaldo() {
		return saldo;
	}

	/* aggiunge l'interesse al conto */
	public void aggiungiInteresse(double interesse) {
		if (saldo>0)
			saldo += (saldo*interesse)/100;
 	}

	public boolean controlloPassword(String p){
		if (p.equals(password))
			return true;
		else return false;
	}
}