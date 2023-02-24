package templatePizza;

public abstract class PizzaTemplate {

    //template method
    public final void makePizza() {
        prepareDough();
        putTomateSauce();
        putTopping();
        addCheese();
        bakePizza();
    }

    public void prepareDough(){

        System.out.println("j'etale la pate");
    }

    public void putTomateSauce(){

        System.out.println("j'etale la sauce tomate");
    }

    public abstract  void putTopping();

    public abstract  void addCheese();

    public void bakePizza(){
        System.out.println("temps de cuison estimer à 15mn");
    }



}
