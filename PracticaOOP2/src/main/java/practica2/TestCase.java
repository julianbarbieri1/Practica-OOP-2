package practica2;

import java.util.HashMap;

public abstract class TestCase {

    /*
    * pushTest(testResults, NombreTest) (abstract method)
                        -> se pasa por parametro el hasmap y un valor de para identificar
      getTestStatus(testResults, NombreTest) (regular method)
                        -> Obtiene el status de un valor del hasmap y devuelve el true o el false.
                           * */

    public abstract void pushTest(HashMap<String, Boolean> testResults, String NombreTest);

    //testResults, NombreTest
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String NombreTest){
        return testResults.get(NombreTest);
    };
}
