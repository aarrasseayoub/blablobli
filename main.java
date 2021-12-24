import java.text.SimpleDateFormat;
import java.util.Date;
public class Main{
public static void main(String[] args){
        Personne p = new Personne("Ayoub","Aarrasse");
        p.getNom();
        System.out.println(p);
        Adherent ad=new Adherent("saad","twil",new Date());
        System.out.println(ad);
        Auteur a=new Auteur(123,"ayoub","aarrasse");
        System.out.println(a.getNom());
        a.setCodeAuteur(234);
        System.out.println(a);
        Livre l=new Livre(159,"romio",a,10,10);
        System.out.println(l.getNbreExemplairesDispo());
        l.retourLivre();
        System.out.println(l.getNbreExemplairesDispo());
        l.setNbreExemplairesDispo(9);
        System.out.println(l.getNbreExemplairesDispo());
        l.retourLivre();
        System.out.println(l.getNbreExemplairesDispo());
        Emprunt e = new Emprunt(l,ad,new Date(),new Date());
        System.out.println(e);
        e.retourEmprunt();
        System.out.println(e);
        Bibliotheque b= new Bibliotheque();
        b.ajouterLivre(123, "flamingo", a, 10);
        System.out.println(b.rechercherLivre(123));
        b.ajouterAdherent("xx", "bb");
        System.out.println(b.rechercherAdherent(2));
    }
}