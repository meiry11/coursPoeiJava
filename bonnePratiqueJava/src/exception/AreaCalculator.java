package exception;

import classabstract.Surface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AreaCalculator {

    public static List<classabstract.Surface> orderSurfaces(classabstract.Surface... surfaces){
        List<Surface>list = Arrays.asList(surfaces);
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
