import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class Personne{
    private String nom;
    private String prenom;

    public Personne(){

    }
    public Personne(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;

    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    
    public String toString(){
        return this.getNom()+" "+this.getPrenom();
    }
    public static boolean equals(Personne a, Personne b){
        return a.nom==b.nom & a.prenom==b.prenom;
    } 
}
