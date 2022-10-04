public class Main {
    public static void main(String[] args) {
       WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
    womanGameCalculator.calculate();
    womanGameCalculator.gameOver();

    /* ABSTRACT SINIFLAR ASLA NEW'LENEMEZ.
    GameCalculator gameCalculator = new GameCalculator();

     */

        GameCalculator gameCalculators = new ChildGameCalculator();
    }


}