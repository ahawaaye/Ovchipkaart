package ovchipkaart;

public class oplaadAutomaat
{
 public void LaadSaldo(ovchipkaart kaart, double saldo) {
     
     if(saldo > 0) {
	 kaart.saldo += saldo;
	 System.out.println("Saldo succesvol opgeladen met: " + saldo);
	 System.out.println("Nieuw saldo: €" + kaart.saldo);
     }else {
	 System.out.println("ongeldig saldo");
     }
     
 }
}
