public class Livre{
    private int codeLivre;
    private String titreLivre;
    private Auteur auteur;
    private int nbreExemplaires;
    private int nbreExemplairesDispo;
    
    public Livre(int codeL, String titreL, Auteur auteur, int nbreExemplaires, int nbreExemplairesDispo){
        this.codeLivre=codeL;
        this.titreLivre=titreL;
        this.auteur=auteur;
        this.nbreExemplaires= nbreExemplaires;
        this.nbreExemplairesDispo=nbreExemplairesDispo;
    }
    public int getCodeLivre(){
        return codeLivre;
    }
    public String getTitreLivre(){
        return titreLivre;
    }
    public int getNbreExemplaires(){
        return nbreExemplaires;
    }
    public void setNbreExemplaire(int nbreExemplaires){
        this.nbreExemplaires=nbreExemplaires;
    }

    public int getNbreExemplairesDispo(){
        return nbreExemplairesDispo;
    }
    public void setNbreExemplairesDispo(int nbreExemplairesDispo){
        this.nbreExemplairesDispo= nbreExemplairesDispo;
    }
    public boolean LivreDisponible(){
        return this.nbreExemplairesDispo>0;
    }
    public void retourLivre(){
        if(this.nbreExemplairesDispo<this.nbreExemplaires) this.nbreExemplairesDispo++;
    }
    public String toString(){
        return this.getCodeLivre()+" "+this.getTitreLivre()+" "+this.getNbreExemplairesDispo();
    }

}