/**
 * JUnitMessage.java
 * This is a concrete class for a JUnitMessage
 * @author Lunga Tshila
 * Date: Wednesday, 31 March 2021
 * Disabling Test
 */

package za.ac.cput;
public class JUnitMessage {

    private String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {

    }
    public String printMessage(){

        System.out.println(message);

        return message;
    }

    public String printHiMessage(){

        message="Hi!"+ message;

        System.out.println(message);

        return message;
    }

}