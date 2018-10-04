
public class Incremental {
	private static int count = 0;
	public static Incremental inc;
	private int numero;
	
	private Incremental() {
		numero = ++count;
	}

	public static Incremental getInstancia() {
		if(inc == null) {
			inc = new Incremental();
		}
		return inc;
	}
	
	public String toString() {
		return "Incremental ->"+ numero;
	}
	
}
