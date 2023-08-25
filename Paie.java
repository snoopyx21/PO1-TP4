public class Paie
{
 
    public static void main(String[] args)
    {
         Employe[] tab=new Employe[4];
         tab[0] = new EmployeH("Dupond",42,30,10000);
         tab[1] = new EmployeCA("Gerard",40,40000);
         tab[2] = new EmployeCA("Marcel",1000,10000);
         tab[3] = new EmployeH("Nenette",38,30,500000);
         for(int i=0 ; i<tab.length ; i++)
         {
	      System.out.println(tab[i].getNom() + " gagne " + tab[i].getSalaire() + " euros");;
         }
    }
}
                   
