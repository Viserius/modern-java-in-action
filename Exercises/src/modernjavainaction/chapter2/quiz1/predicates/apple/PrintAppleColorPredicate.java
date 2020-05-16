package modernjavainaction.chapter2.quiz1.predicates.apple;


import modernjavainaction.chapter2.quiz1.Apple;

public class PrintAppleColorPredicate implements IPrintApplePredicate {

    @Override
    public String print(Apple apple) {
        return "The color of this apple is: " + apple.getColor();
    }

}
