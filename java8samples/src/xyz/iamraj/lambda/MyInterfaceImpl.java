package xyz.iamraj.lambda;

public class MyInterfaceImpl {

    public static void main(String[] args) {

        // simple lambda expression in the we are specifying the variable type in the parameter list
        MyInterface lambda = (String text)->{
            System.out.println("Text is "+text);
        };
        lambda.printIt("hello world");

        // we can still make really crisp lambda function
        MyInterface myInterfaceLambda = text -> System.out.println("Text is "+text);
        myInterfaceLambda.printIt("Crisp lambda function");



    }
}
