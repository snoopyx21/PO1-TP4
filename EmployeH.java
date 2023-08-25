public class EmployeH implements Employe
{
    String nom;
    double salaire_base;
    double bonus;
    double heures;
    double heures_sup;
    double tarif_horaire;
    public  EmployeH(String nom, double heures, double heures_sup, double tarif_horaires)
    {
         if(heures_sup != 30 && heures_sup != 50)
         {
              throw new IllegalArgumentException(heures_sup + " n'existe pas dans cette entreprise !"); 
         }
         this.nom=nom;
         this.heures=heures;
         this.heures_sup=heures_sup;
         this.tarif_horaire=tarif_horaire;
    }
    public String getNom()
    {
         return this.nom;
    }
    public double  getSalaire()
    {
         if (heures > 39.) return (tarif_horaire*heures)+heures_sup*(tarif_horaire*(heures-39.));
         else return (tarif_horaire*heures);
    }
    public void setInfosSalaire(double salaire_base, double bonus)
    {
         if(heures >39.){
              bonus=heures_sup*(tarif_horaire*(heures-39.));
         }
         else bonus=0;
         salaire_base=tarif_horaire*heures;
    }
}
