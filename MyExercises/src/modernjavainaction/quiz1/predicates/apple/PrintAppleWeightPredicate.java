package modernjavainaction.quiz1.predicates.apple;


import modernjavainaction.Apple;

public class PrintAppleWeightPredicate implements IPrintApplePredicate{

    @Override
    public String print(Apple apple) {
        return "The weight of this apple is: " + apple.getWeight();
    }

}
