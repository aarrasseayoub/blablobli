public class Auteur extends Personne{
    private int codeAuteur;

    public Auteur(int codeAuteur, String nom, String prenom){
        super(nom,prenom);
        this.codeAuteur=codeAuteur;

    }
   
    public int getCodeAuteur(){
        return codeAuteur;
    }
    
    public void setCodeAuteur(int codeAuteur){
        this.codeAuteur=codeAuteur;
    }
    
    
    public String toString(){
        return this.getCodeAuteur()+" "+super.toString();
    }
}