package ovchipkaart;

public class ovchipkaart
{
    double saldo;
    boolean ingechecked;
    boolean uitgechecked;
    

    public void inchecken(double instaptarief)
    {
	this.saldo = saldo - instaptarief;
	this.ingechecked = true;

    }
    
    public ovchipkaart(double saldo)
    {
	this.saldo = saldo;
	this.uitgechecked =false;
	this.ingechecked = false;
	
    }
    

}
