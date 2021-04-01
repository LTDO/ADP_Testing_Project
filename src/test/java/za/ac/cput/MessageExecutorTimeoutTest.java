/**
 * MessageExecutorTimeoutTest.java
 * This is a test class for MessageExecutorTimeout object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 * Timeout Test
 */

package za.ac.cput;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class MessageExecutorTimeoutTest {

    @Rule
    public Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);
    String message = "Lunga";
    MessageExecutorTimeout messageUtil = new MessageExecutorTimeout(message);

    @Test
    public void testPrintMessage() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(5000);
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Lunga";
        assertEquals(message,messageUtil.salutationMessage());
    }
}