package tpTest;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    int id;
    String nom;
    String prenom;
    List<DemandeFormation> demandeFormations = new ArrayList<DemandeFormation>();

    public Employee(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<DemandeFormation> getDemandeFormations() {
        return demandeFormations;
    }

    public void setDemandeFormations(List<DemandeFormation> demandeFormations) {
        this.demandeFormations = demandeFormations;
    }

    public void demanderformation(DemandeFormation conges){

    }

    public List<DemandeFormation> consulterFormation(){

        return null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", demandeFormations=" + demandeFormations +
                '}';
    }
}
