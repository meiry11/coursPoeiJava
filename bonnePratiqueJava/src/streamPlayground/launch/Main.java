package streamPlayground.launch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer>myList = new ArrayList<>();

        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Stream<Integer> sqrtRootStrm = myList.stream().map(a -> a*a);

        sqrtRootStrm.forEach(System.out::println);*/

        List<NamePhoneEmail> mylist = new ArrayList<>();
         mylist.add(new NamePhoneEmail("Larry", "5555555",
                 "Larry@gmail.com"));

        mylist.add(new NamePhoneEmail("Kady", "125-369",
                "Kady@gmail.com"));

        mylist.add(new NamePhoneEmail("Meiry", "333-1254",
                "Meiry@gmail.com"));

        mylist.stream().forEach((a) -> {
            System.out.println(a.getName() + "" + a.getPhonenum() + ""+a.getEmail());
        });

        mylist.stream().map((a) -> {
            return new  NamePhone(a.getName() + "" + a.getPhonenum() );
        });
    }
}

