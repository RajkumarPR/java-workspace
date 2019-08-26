package xyz.iamraj.lambda;

public class VariableCapture {

    private static String staticVar = "Static Variable";
    private String instanceVar = "instance variable";
    public static void main(String[] args) {

        //1. local variable capture
        String myString = "Test";

        MyFactory myFactory = (chars) -> {
            return new String(chars)+" : "+myString;
        };
       String s= myFactory.create("aaa".toCharArray());

        System.out.println(s);

        //2. Instance variable capture

        MyFactory myFactory1 = (chars) -> {
            return new String(chars)+ " : "+staticVar;
        };

        String ss = myFactory1.create("Hello".toCharArray());
        System.out.println(ss);




    }

}
