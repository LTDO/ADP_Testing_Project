/**
 * JUnitMessageTest.java
 * This class is used to test Disabling Test.
 * @author Lunga Tshila
 * Date: Wednesday, 31 March 2021
 * Disabling Test
 */

package za.ac.cput;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitMessageTest {
    public String message = "lunga";
    JUnitMessage junitMessage = new JUnitMessage(message);

    //Disabling test using @Ignore annotation
    @Ignore
    @Test
    public void testJUnitMessage() {
        System.out.println("Hi my name is Lunga");
        assertEquals(message, junitMessage.printMessage());
    }

    @Test
    public void testJUnitHiMessage() {
        message="Hi!" +message;
        System.out.println("Hi my name is Lunga");
        assertEquals(message, junitMessage.printHiMessage());
    }
}