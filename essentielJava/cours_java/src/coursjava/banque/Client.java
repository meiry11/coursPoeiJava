package coursjava.banque;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;

public class Client implements Comparable<Client> {
    String nom;
    String prenom;
    LocalDateTime dateNaissance;
    LocalDateTime ouvertureCompte;


    public Client(){

    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = LocalDateTime.now();
        this.ouvertureCompte = LocalDateTime.now();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public LocalDateTime getOuvertureCompte() {
        return ouvertureCompte;
    }

    public void setOuvertureCompte(LocalDateTime ouvertureCompte) {
        this.ouvertureCompte = ouvertureCompte;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", ouvertureCompte=" + ouvertureCompte +
                '}';
    }

    @Override
    public int compareTo(Client client) {
        //if()
        return 0;
    }
}
