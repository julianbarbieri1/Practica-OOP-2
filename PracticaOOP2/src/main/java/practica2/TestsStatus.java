package practica2;

import java.util.HashMap;
import java.util.Map;

public class TestsStatus {


    public static void getTestResultsStatus(HashMap<String, Boolean> testResults ){

        // For each for a hashmap

        for (Map.Entry<String, Boolean> dato : testResults.entrySet()) {
            if(dato.getValue() == false){
                System.out.println("Test fail!, name :"+ dato.getKey());
            }
            else{
                System.out.println("Test OK, no problem :"+ dato.getKey());
            }

        }
    }
}

