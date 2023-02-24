package coursjava.banque;


import java.util.ArrayList;
import java.util.List;

public abstract class Compte {

    //############ Attributs statiques #################

    private static int nbCompteOuvert = 0;

    //######### Liste sratiques #########################

    public static List<Compte> comptes = new ArrayList<>();


    //############ Attributs d'instance #################

    private int numero;
    private float montant = 0;
    private String intitule = "Compte courant";

    private final Client proprietaire;

    //############ Constructeur #################

    public Compte(Client client, float montant) {

        this.proprietaire = client;

        this.intitule = "Compte en banque";
        this.montant = montant;

        this.numero = getNbCompteOuvert();

        addAnAccount();

    }

    public Compte(Client client) {

        this.proprietaire = client;

        this.intitule = "Compte en banque";
        this.montant = 0;

        this.numero = getNbCompteOuvert();

        addAnAccount();

    }

    public Compte(Client client, float montant, String intitule) {

        this.proprietaire = client;

        this.intitule = intitule;
        this.montant = montant;

        this.numero = getNbCompteOuvert();

        addAnAccount();

    }

    //############ Méthodes d'instances #################

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void affichage(){

        System.out.println("Compte standard");

    }

    public abstract String resume();

    //System.out.println(compte) => J'appelle toString()
    // String
    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", montant=" + montant +
                ", intitule='" + intitule + '\'' +
                '}';
    }

    //################## Méthodes statiques #######################
    static void addAnAccount() {

        nbCompteOuvert ++;

    }


    static int getNbCompteOuvert() {

        return nbCompteOuvert;

    }

    public static void debiter(float montant){

    }
    public static void crediter(){

    }
    //methode renvoyant une liste
    public static List<Compte> getComptes(){

        //comptes.add();
        return null;
    }


    public void transfert(Compte compteA,Compte compteB,float montant){
        if(!(compteA instanceof CompteCourant && compteB instanceof CompteCourant) || !(compteA instanceof CompteEpargne && compteB instanceof CompteEpargne)){

        }

    }

}