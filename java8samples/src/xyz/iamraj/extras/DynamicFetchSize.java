package xyz.iamraj.extras;

import java.util.HashMap;
import java.util.Map;

public class DynamicFetchSize {

    private static int fetchSizeArray[] = {1000, 2000, 3000, 5000};
                             // diff days //<10  >=10  >=30  >31
    public static void main(String[] args) {

        int day = 30;


        //System.out.println((day/10)%4  );
        // pass index to get value

        System.out.println(fetchSizeArray[Math.min((day/10), 3)]);

    }
}
