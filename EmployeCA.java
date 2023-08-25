public class EmployeCA implements Employe
{
    double forfait;
    double chiffre_affaire;
    String nom;
    public EmployeCA(String nom, double forfait, double chiffre_affaire)
    {
         this.nom=nom;
         this.forfait=forfait;
         this.chiffre_affaire=chiffre_affaire;
    }
    public String getNom()
    {
         return this.nom;
    }
    public double getSalaire()
    {
         return forfait+(1/100)*chiffre_affaire;
    }
    public void setInfosSalaire(double salaire_base, double bonus)
    {
         salaire_base=forfait;
         bonus=(1/100)*chiffre_affaire;
    }
}

