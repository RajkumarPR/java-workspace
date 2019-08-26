package xyz.iamraj.lambda;

public class ZeroParamLambda {

    public static void main(String[] args) {

        Greeting greeting= ()->{
            System.out.println("Hello World!");
        };

        greeting.perform();
    }
}
