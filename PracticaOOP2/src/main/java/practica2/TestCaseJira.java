package practica2;

import java.util.HashMap;

public class TestCaseJira extends TestCase{
    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String NombreTest) {
        System.out.println("This test will be pushed to jira: "+ NombreTest +" with status : " + testResults.get(NombreTest));
    }

}
