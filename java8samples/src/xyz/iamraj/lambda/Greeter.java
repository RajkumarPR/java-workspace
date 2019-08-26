package xyz.iamraj.lambda;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting greeting = new HelloWorldGreetingImpl();
        greeter.greet(greeting);
    }
}
