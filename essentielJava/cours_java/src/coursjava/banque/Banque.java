package coursjava.banque;

import java.time.LocalDateTime;
import java.util.Date;

public class Banque {

    String nom;
String adresse;
LocalDateTime dateCreation;

int nbClient;
int nbCompteClient;

Compte[] comptes;
Client[] clients ;




    public Banque(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = LocalDateTime.now();
        comptes = new Compte[1000];
        clients = new Client[1000];
        this.nbClient = 0;
        this.nbCompteClient = 0;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = LocalDateTime.now();
    }

    public Compte[] getCompte() {
        return comptes;
    }

    public void setCompte(Compte[] compte) {
        this.comptes = compte;
    }
    public Client  addClient( String nom, String prenom ) {
        //instancier un nouveau client
        Client client = new Client(nom,prenom);
        clients[nbClient] =client;

        nbClient++;
        return client;
    }



    @Override
    public String toString() {
        return "Banque{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateCreation=" + dateCreation +
                ", nbClient=" + nbClient +
                ", nbCompteClient=" + nbCompteClient +
                '}';
    }

    public void affichageClient() {
        for (int i = 0; i < 1000; i++) {
            if (clients[i] != null) {
                System.out.println(i+"-"+clients[i]);
            }
        }

    }

    public void affichageCompte() {
        for (int i = 0; i < 1000; i++) {
            if (comptes[i] != null) {
                System.out.println(comptes[i].resume());
            }
        }
    }

    public CompteCourant addCompte(  float montant,String intitule,Client client){

        CompteCourant nouveauCompte = new CompteCourant(client, montant, intitule);

        for (int i=0; i<1000 ; i++) {

            if (this.comptes[i] == null){

                this.comptes[i] = nouveauCompte;

                return nouveauCompte;

            }

        }

        System.out.println("Ajout impossible ! Il n'y a plus de place");

        return null;

    }
    public Client[] getClient(Client[] clients) {

        return clients;
    }


    public void setClient(Client[] client) {
        this.clients = client;
    }

    public Boolean isClient(Client client){
    for (int i = 0; i<10 ; i++){
       if(clients[i] == client){

       }
    }

        return true;
    }

    public Boolean isCompte(Compte compte){
        for (int i = 0; i<10 ; i++){
            if(comptes[i] == compte){

            }
        }

        return true;
    }


}

