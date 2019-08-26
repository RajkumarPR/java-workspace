package xyz.iamraj.lambda;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Even though this interface contains 3 methods it can be implemented by a lambda expression,
 * because only one of the methods is unimplemented. Here is how the implementation looks
 * @author rraigonde
 */
@FunctionalInterface
public interface MyInterface {
    void printIt(String text);

    default public void printUtf8To(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }

    static void printItToSystemOut(String text){
        System.out.println(text);
    }
}
