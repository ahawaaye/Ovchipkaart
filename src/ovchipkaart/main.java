package ovchipkaart;

public class main
{
    public static void main(String[] args) {
	
	ovchipkaart ov = new ovchipkaart(20);
	Bestemming N = new Bestemming("Nijmegen", 2,3);
	Bestemming A = new Bestemming("Arnhem", 5,9);
	
	

	A.BerekenAfstand(N);
	
	
	
	PaalPort port = new PaalPort(10, N, 0);
	port.inchecken(ov);
	System.out.println("Huidig saldo: " + ov.saldo);
	
	System.out.println("Ingechecked: " + ov.ingechecked);
	
	
    }

}
