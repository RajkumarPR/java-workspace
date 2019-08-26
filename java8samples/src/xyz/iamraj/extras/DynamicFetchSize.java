package xyz.iamraj.extras;

public class DynamicFetchSize {

    private static int fetchSizeArray[] = {2000, 3000, 4000, 5000};
                             // diff days //<10  >=10  >=30  >31
    public static void main(String[] args) {

        long day = 19L;


        //System.out.println((day/10)%4  );
        // pass index to get value
        int dynamicFetchSize = fetchSizeArray[Math.min(((int)day)/10, 3)];

        System.out.println(dynamicFetchSize);

    }
}
