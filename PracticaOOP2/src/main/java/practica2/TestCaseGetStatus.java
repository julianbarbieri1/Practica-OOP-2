package practica2;

import java.util.HashMap;

public class TestCaseGetStatus extends TestCase {
    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String NombreTest) {

    }
    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String NombreTest){

        if(testResults.get(NombreTest) == true){
            System.out.println("This test status is: OK");
            return true;
        }
        else{
            System.out.println("This test status is: NOT OK");
            return false;
        }

    }
}
