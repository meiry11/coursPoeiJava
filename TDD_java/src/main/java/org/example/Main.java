package org.example;

import tpTest.DemandeFormation;
import tpTest.Employee;
import tpTest.Manager;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Cisse","mariam");
        Manager manager = new Manager (1, "Platini","Albert");
        DemandeFormation demandeFormation1 = new DemandeFormation("27-02-2023","28-02-2023");
        DemandeFormation demandeFormation2 = new DemandeFormation("27-03-2023","28-03-2023");

        employee.demanderformation(demandeFormation1);
        employee.demanderformation(demandeFormation2);

        DemandeFormation demandeFormation3 = new DemandeFormation("nksvqu","aajjyy");
        manager.demanderFormation(demandeFormation3);

        List<DemandeFormation> formationCollections = manager.getDemandeFormations();
        for(DemandeFormation demandeFormation:formationCollections){
            System.out.println(demandeFormation);
        }

    }
}