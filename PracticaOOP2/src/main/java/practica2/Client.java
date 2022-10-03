package practica2;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        HashMap<String, Boolean> testResults = new HashMap<String, Boolean>();
        // Format (NombreTest, EstadoTest)
        testResults.put("TC1", true);
        testResults.put("TC2", true);
        testResults.put("TC3", true);
        testResults.put("TC4", false);
        testResults.put("TC5", true);
        testResults.put("TC6", true);
        testResults.put("TC7", false);
        testResults.put("TC8", true);
        testResults.put("TC9", false);
        testResults.put("TC10", true);
        testResults.put("TC11", false);
        testResults.put("TC12", true);


        /*
        6- Instanciar un objeto de la clase TestCaseJira() que llame al 5 elemento del hasmap con el metodo pushTest()

        7- Instanciar un objeto de la clase TestCaseGetStatus() que llame al 3 elemento del hasmap con el metodo getTestStatus(*/


        TestsStatus status = new TestsStatus();
        status.getTestResultsStatus(testResults);

        TestCaseJira jira = new TestCaseJira();

        jira.pushTest(testResults, "TC5");

        TestCaseGetStatus testCase = new TestCaseGetStatus();

        testCase.getTestStatus(testResults, "TC3");
    }

}
