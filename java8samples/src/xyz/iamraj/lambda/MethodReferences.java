package xyz.iamraj.lambda;

public class MethodReferences {


    public static void main(String[] args) {
        // Static method reference
        Finder finder = MyClass::doFind;
        System.out.println(finder.find("ssss","ssss"));

        // Method reference as a lambda
        MyPrinter printer = (s)-> System.out.println(s);
        printer.print("Method reference");
        printMethod(s -> System.out.println(s));

        printMethod(System.out::println);


        //Parameter Method Reference
        Finder finder1 = String::indexOf; // equivalent to Finder finder = (s1, s2) -> s1.indexOf(s2);

        System.out.println(finder.find("aaa","aaa"));


    }

    public static void printMethod(MyPrinter printer){
        printer.print("inside");
    }
}
