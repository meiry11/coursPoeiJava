package tpTest;

import java.util.Date;

public class DemandeFormation {
    public static final String REFUS = "REFUS";
    public static final String ACCORDE = "ACCORDE";
    public static final String ATTENTE = "ATTENTE";

    String DateDebut;
    String DateFin;
    String atValidation;

    public DemandeFormation(String dateDebut, String dateFin, String atValidation) {
        DateDebut = dateDebut;
        DateFin = dateFin;
        this.atValidation = atValidation;
    }

    public DemandeFormation(String dateDebut, String dateFin) {
        DateDebut = dateDebut;
        DateFin = dateFin;
    }

    public String getDateDebut() {
        return DateDebut;
    }

    public String getDateFin() {
        return DateFin;
    }

    public String getAtValidation() {
        return atValidation;
    }

    @Override
    public String toString() {
        return "DemandeFormation{" +
                "DateDebut='" + DateDebut + '\'' +
                ", DateFin='" + DateFin + '\'' +
                ", atValidation='" + atValidation + '\'' +
                '}';
    }
}
