package modernjavainaction;

import modernjavainaction.quiz1.predicates.apple.IPrintApplePredicate;
import modernjavainaction.quiz1.predicates.apple.PrintAppleHeavyLightPredicate;
import modernjavainaction.quiz1.predicates.apple.PrintAppleWeightPredicate;

import java.util.ArrayList;
import java.util.List;

public class ApplePrinter {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple(5, Color.GREEN));
        apples.add(new Apple(10, Color.GREEN));
        apples.add(new Apple(5, Color.RED));
        apples.add(new Apple(10, Color.RED));

        prettyPrintApple(apples, new PrintAppleHeavyLightPredicate());
    }

    public static void prettyPrintApple(List<Apple> inventory, IPrintApplePredicate predicate) {
        for(Apple apple : inventory) {
            String output = predicate.print(apple);
            System.out.println(output);
        }
    }

}
