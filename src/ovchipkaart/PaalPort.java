package ovchipkaart;

public class PaalPort
{
    int instaptarief;

    public PaalPort(int instaptarief)
    {
	this.instaptarief = instaptarief;

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
