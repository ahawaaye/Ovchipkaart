package ovchipkaart;

public class Bestemming
{
    String bestemming;
    double xas;
    double yas;
    
  
    public Bestemming( String bestemming, double xas, double yas) {
         this.xas = xas;
         this.yas = yas;
         this.bestemming = bestemming;
         
         
    }
    
    public double BerekenAfstand(Bestemming bestemming) {
	double a = this.xas - bestemming.xas;
	double b = this.yas - bestemming.yas;
	
	double c = a*a+b*b;
	
	System.out.println(Math.sqrt(c));
	
	
	
	
	
	
	
	
	return Math.sqrt(c);
	
    }
    
    

}
