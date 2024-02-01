package structural.decorator;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTea;
import structural.decorator.deco.*;

public class Main {
    public static void main(String[] args) {
        /* Get the cost()
         * It should be 14$
         */
        IMilkTea firstMilkTea = new EggPudding(
                new FruitPudding(
                        new BlackSugar(
                                new Bubble(
                                        new MilkTea()))));
        System.out.println("EggPuddingAndFruitPuddingBlackSugarBubbleMilkTea: "
                + firstMilkTea.cost());
        // Get the cost()
        // It should be 11.5$

        IMilkTea secondMilkTea = new EggPudding(
                new BlackSugar(
                        new WhiteBubble(
                                new MilkTea())));
        System.out.println("EggPuddingBlackSugarWhiteBubbleMilkTea:"
                + secondMilkTea.cost());
    }
}
