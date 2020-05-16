package modernjavainaction.quiz1.predicates.apple;


import modernjavainaction.Apple;
import modernjavainaction.quiz1.predicates.IPrintPredicate;

public interface IPrintApplePredicate extends IPrintPredicate<Apple> {

    String print(Apple apple);

}
