package LambdaExpression;

@FunctionalInterface
public interface MyInterface {
    // functional interface - which mean contains only one abstract method
    // can be used with lambda expression

    public void message(String name, char symbol);
}
