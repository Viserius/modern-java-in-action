package modernjavainaction.quiz1.predicates.apple;

import modernjavainaction.Apple;

public class PrintAppleColorPredicate implements IPrintApplePredicate {

    @Override
    public String print(Apple apple) {
        return "The color of this apple is: " + apple.getColor();
    }

}
