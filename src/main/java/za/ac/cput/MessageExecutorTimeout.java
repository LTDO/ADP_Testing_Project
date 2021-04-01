/**
 * MessageExecutorTimeout.java
 * This is a concrete class for MessageExecutorTimeout object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 * Timeout Test
 */

package za.ac.cput;

public class MessageExecutorTimeout {

    private String message;
    public MessageExecutorTimeout(String message) {
        this.message = message;
    }
    public void printMessage() {
        System.out.println(message);
    }

    public String salutationMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
