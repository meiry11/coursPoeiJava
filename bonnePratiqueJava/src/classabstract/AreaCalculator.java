package classabstract;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AreaCalculator {

    public static List<Surface> orderSurfaces(Surface... surfaces){
        List<Surface>list = Arrays.asList(surfaces);
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
