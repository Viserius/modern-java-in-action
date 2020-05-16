package modernjavainaction.chapter2.quiz1.predicates.apple;


import modernjavainaction.chapter2.quiz1.Apple;

public class PrintAppleHeavyLightPredicate implements IPrintApplePredicate {

    @Override
    public String print(Apple apple) {
        return "This apple is considered to be: " + ((apple.getWeight() <= 5) ? "Lightweight" : "Heavyweight");
    }

}
