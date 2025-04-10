package ovchipkaart;

public class PaalPort
{
    int instaptarief;
    Bestemming bestemming;
    double tarief;
    
    


    public PaalPort(int instaptarief, Bestemming bestemming, double tarief)
    {
	this.instaptarief = instaptarief;
	this.bestemming = bestemming;
	this.tarief = tarief;
	
    }

    public void inchecken(ovchipkaart ov)
    {

	if (ov.saldo > instaptarief)
	{
	    ov.inchecken(instaptarief, bestemming);
	}
	else if(ov.ingechecked==true) {
	     System.out.println("je bent al ingechecked");
	}

	else
	{
	    System.out.println("niet genoeg saldo");

	}
	

    }
    
    public String reis(ovchipkaart kaart) {
   	double afstand = this.bestemming.BerekenAfstand(bestemming);
   	double ritprijs = tarief*afstand;
         
   	
   	
   	return null;
   	
       }
    

}
