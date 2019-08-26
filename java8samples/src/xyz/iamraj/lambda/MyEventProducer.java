package xyz.iamraj.lambda;

@FunctionalInterface
public interface MyEventProducer {

    void listen(String e);
}

