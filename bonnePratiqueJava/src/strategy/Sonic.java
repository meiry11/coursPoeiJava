package strategy;

public class Sonic {

    private MoveStrategy strategy;

    public void chargeStrategy(MoveStrategy strategy){
        this.strategy = strategy;
    }

    public void move(){
        strategy.execute();
    }
}
