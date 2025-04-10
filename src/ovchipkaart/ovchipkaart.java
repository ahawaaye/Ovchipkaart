package ovchipkaart;

public class ovchipkaart
{
    double saldo;
    boolean ingechecked;
    boolean uitgechecked;
    

    public void inchecken(double instaptarief, Bestemming bestemming)
    {
	this.saldo = this.saldo - instaptarief;
	this.ingechecked = true;

    }
    
    public ovchipkaart(double saldo)
    {
	this.saldo = saldo;
	this.uitgechecked =false;
	this.ingechecked = false;
	
    }
    public void uitchecken(double instaptarief, double ritprijs) {
	this.uitgechecked = false;
	this.saldo = this.saldo + instaptarief;
	this.saldo = this.saldo - ritprijs;
	
    }
    
    

}
