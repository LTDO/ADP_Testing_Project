/**
 * FailingTest.java
 * This is a concrete class for a FailingJunit object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 * Failing Test
 */
package za.ac.cput;

public class FailingJunit {

        void method(int x) throws IllegalArgumentException {
            if (x < 0) {
                throw new IllegalArgumentException();
            }
        }
}
