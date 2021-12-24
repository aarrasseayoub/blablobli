import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Bibliotheque{
    List<E> livres =  new ArrayList() ;
    ListIterator lolLivre = liste.listIterator() ;
    List adherent =  new ArrayList() ;
    ListIterator lolAdherent = liste.listIterator() ;
    List emprunts =  new ArrayList() ;
    ListIterator lolEmprunt = liste.listIterator() ;


    public Bibliotheque(){

    }
    public Adherent rechercherAdherent(int CodeAd) throws auteurInexistantException{
        while(lolAdherent.hasNext()){
            Adherent a = lolAdherent.next();
            a = (Adherent) a;
            if(this.a.getCodeAdherent()==CodeAd){
                return this.a;
            }
        }
        throw new auteurInexistantException();
    }
    public Livre rechercherLivre(int codeL){
        while(lolLivre.hasNext()){
            Adherent a = lolLivre.next();
            if(this.a.getCodeLivre()==CodeAd){
                return this.a;
            }
        }
        return null;
    }
    public void ajouterLivre(int codeL, String titreL, Auteur auteurL, int nbreExemplaires){
        Livre l=this.rechercherLivre(codeL);
        if(l!=null){
            l.setNbreExemplaire(l.getNbreExemplaires()+nbreExemplaires);
            l.setNbreExemplairesDispo(l.getNbreExemplairesDispo()+nbreExemplaires);

        }
        else{
            l = new Livre(codeL, titreL, auteurL, nbreExemplaires, nbreExemplaires);
            this.livres[this.nbreLivres]=l;
            this.nbreLivres++;
        }
    }
    public void ajouterAdherent(String nom, String prenom){
        Adherent adherent= new Adherent(nom, prenom);
        this.adherent[this.nbreAdherents++]=adherent;
    }
    public void ajouterEmprunt(Adherent codeA,Livre codeL){
        Emprunt emprunt= new Emprunt(codeL, codeA, new Date(), new Date());
        this.emprunts[this.nbreEmprunts++]=emprunt;
    }
    public void retourLivre(Emprunt codeEmprunt){
        codeEmprunt.retourEmprunt();
    }
    public HashSet emprunteurs(){
        Set emprunteurs =  new HashSet() ;
        while(lolEmprunt.hasNext()){
            Emprunt a = lolEmprunt.next();
            a = (Emprunt) a;
            emprunteurs.add(a.getEmprunteur());
        }    
    }
    public ArrayList livresTriesParExemplairesDispo(){
        List a = new ArrayList();
        for (int i=0; i<livres.size();i++){
            if(livres.get(i).getNbreExemplaires()>0){
                a.add(livres.get(i));
            }
        }
        a.sort();
        return a;
    }
    public Livre topEmprunt(){
        Map b = new HashMap();
        for(int i=0; i<livres.size(); i++){
            Livre c = livres.get(i);
            b.add(c, c.getNbreExemplaires()-c.getNbreExemplairesDispo());
        }
        
    }
}