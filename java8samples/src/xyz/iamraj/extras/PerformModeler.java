package xyz.iamraj.extras;

import java.util.Arrays;
import java.util.List;

public class PerformModeler {
    public static void main(String[] args) {

       // List<Integer> days = Arrays.asList(10, 15, 20, 25, 30);

        //java 8
        /*days.forEach(day ->{
            System.out.println(Math.floorMod(12316767678678L,day));
        });*/
        System.out.println((isError() ? "Error" : "Warning"));
      //  System.out.println("Java 7");
       /* for (Integer day : days)
            System.out.println(12316767678678L % day);*/
    }
    private static boolean isError (){
        return false;
    }
}
