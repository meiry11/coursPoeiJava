package streamPlayground.launch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();


        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        //Ajouter les elements dans la liste


        //
        Stream<Integer> sqrtRootStrm = myList.stream().map(a -> a * a);

        //Afficher les elements de la liste
        sqrtRootStrm.forEach(System.out::println);

        //creation de la nouvelle liste

        List<NamePhoneEmail> mylist = new ArrayList<>();
        mylist.add(new NamePhoneEmail("Larry", "5555555",
                "Larry@gmail.com"));

        mylist.add(new NamePhoneEmail("Kady", "125-369",
                "Kady@gmail.com"));

        mylist.add(new NamePhoneEmail("Meiry", "333-1254",
                "Meiry@gmail.com"));
        //Afficher les elements  de la liste via un stream
        mylist.stream().forEach((a) -> {
            System.out.println(a.getName() + "" + a.getPhonenum() + "" + a.getEmail());
        });


        //Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.getName(), a.getPhonenum));
        //System.out.println("List of names and phone numbers");
        //nameAndPhone.forEach(System.out::println);

    }
    //Creer une liste d'employés

    Employee jhon = new Employee("john Doe", 30);
    Employee jane = new Employee("Jane Deer", 25);
    Employee jack = new Employee("jack hill", 40);
    Employee snow = new Employee("snow White", 22);

    //Ajouter les employé aux departement comme suit

    Department hr = new Department("Human Ressources");
    hr.addEmployee(jane);
    hr.addEmployee(jack);
    hr.addEmployee(snow);
    Department accounting = new Department("Accounting");
    accounting.addEmployee(john);

    //liste des departements
    List<Department> departments =new ArrayList<>();
    departement.add(hr);
    departement.add(accounting);

    //stream sur la liste
    List<Employee> subList = departments.stream()
            .flatMap((department -> department.getEmployees().stream())).collect(Collectors.toList());
    System.o


}

