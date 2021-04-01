/**
 * FailingJunitTest.java
 * This is a test class for a FailingJunit object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 * Failing Test
 */

package za.ac.cput;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FailingJunitTest {

        FailingJunit fail;

        @Before
        public void setUp() {
            fail = new FailingJunit();
        }

        @Test
        public void failExampleTest() {
            if(fail == null){
                Assertions.fail("fail is null");
            }
            try {
                fail.method(-1);
                Assertions.fail("Should of thrown an IllegalArgumentException");
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
}