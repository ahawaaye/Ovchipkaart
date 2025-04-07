package ovchipkaart;

public class PaalPort
{
    int instaptarief;
    Bestemming bestemming;
    


    public PaalPort(int instaptarief, Bestemming bestemming)
    {
	this.instaptarief = instaptarief;
	this.bestemming = bestemming;
	
	
    }

    public void inchecken(ovchipkaart ov)
    {

	if (ov.saldo > instaptarief)
	{
	    ov.inchecken(instaptarief);
	}
	else if(ov.ingechecked==true) {
	     System.out.println("je bent al ingechecked");
	}

	else
	{
	    System.out.println("niet genoeg saldo");

	}

    }
    

}
