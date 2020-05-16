package modernjavainaction.chapter2.quiz1.predicates.apple;


import modernjavainaction.chapter2.quiz1.Apple;
import modernjavainaction.chapter2.quiz1.predicates.IPrintPredicate;

public interface IPrintApplePredicate extends IPrintPredicate<Apple> {

    String print(Apple apple);

}
