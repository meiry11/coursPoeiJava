import org.junit.jupiter.api.Test;
import tpTest.DemandeFormation;
import tpTest.Manager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormationTest {
    @Test
    public void managerFormationAccorde(){
        Manager manager = new Manager (1, "Platini","Albert");
        DemandeFormation demandeFormation1 = new DemandeFormation("27-02-2023","28-02-2023");
        manager.demanderFormation(demandeFormation1);

        List<DemandeFormation> formation = manager.getDemandeFormations();
        for(DemandeFormation d:formation){
            assertTrue(DemandeFormation.ACCORDE.equals((d.getAtValidation())));
        }

    }
}
