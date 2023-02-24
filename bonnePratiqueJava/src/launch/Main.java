package launch;

import exception.Circle;
import exception.CircleCustomEx;
import exception.InvalidRadiusException;

public class Main {
    public static void main(String[] args) throws InvalidRadiusException {

        CircleCustomEx circleCustomEx = new CircleCustomEx(-3);
        System.out.println(circleCustomEx);
        /*long duree;
        long debut,fin;
        String lievre = "";
        String tortue = "";


        debut = System.nanoTime();

        for(int i = 0; i<10000;i++){
            lievre = lievre + ""+i;
        }

        fin = System.nanoTime();

        duree = debut-fin;

        System.out.println("duree pour le lievre est"+duree+"ns");


        debut = System.nanoTime();

        StringBuilder s = new StringBuilder();

        for(int i = 0; i<10000;i++){
            s.append("_");
            s.append(i);
        }
        tortue = s.toString();
        fin = System.nanoTime();
        long duree2= debut-fin;

        System.out.println("la durée de la tortue est"+duree2+"ns");

        if(lievre.equals(tortue)){
            System.out.println("les deux chaines sont identiques");
        }

        System.out.println(duree/duree2);




        Sonic sonic = new Sonic();

        Rectangle rectangle = new Rectangle(5.6, 3.15);
        Circle circle = new Circle(8.6);
        Square square = new Square(4.3);
        Surface[] surfaces = new Surface[]{rectangle, circle, square};
        List list = AreaCalculator.orderSurfaces(surfaces);

        System.out.println(list);


        Rectangle rectangle = new Rectangle(2.3, 5.6);
        Circle circle = new Circle(2.0);
        Square square = new Square(2.6);
        Surface[] surfaces = new Surface[]{circle, square, rectangle};

        double result = AreaCalculator.SumArea(surfaces);
        System.out.println(result);


        Felin felin = new Felin();
        Chat chat = new Chat();
        Poule poule = new Poule();
        Animal[] animals = new Animal[]{felin, chat, poule};

        for (Animal a : animals) {
            System.out.println(a.crier());

        }

        Maguerita maguerita = new Maguerita();
        Pizza4Fromage pizza4Fromage = new Pizza4Fromage();

        PizzaTemplate[] pizzaTemplates = new PizzaTemplate[]{maguerita, pizza4Fromage};

        for (PizzaTemplate p : pizzaTemplates) {
            System.out.println(p.);

        }*/

    }
}