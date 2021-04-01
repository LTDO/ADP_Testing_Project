/**
 * BookObjectIdentityTest.java
 * This is a test class for BookIdentity object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 * ObjectIdentity
 */

package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookObjectIdentityTest {

    @Test
    public void testBookIdentity(){
        BookObjectIdentity book = new BookObjectIdentity("The Art of Hustling", "Dj SBU");
        BookObjectIdentity book2 = new BookObjectIdentity("The Art of Trading", "Dr Ref Wayne");
        BookObjectIdentity book3 = new BookObjectIdentity("Crime and Punishment", "Dr Nietche Djoviesky");
        BookObjectIdentity book4 = book3;

        assertEquals(book.equals(book2), false);
        assertEquals(book2.equals(book3), false);
        assertEquals(book3.equals(book4), true);
    }


    @Test
    public void testBookIdentityUsingHashcode(){
        BookObjectIdentity book = new BookObjectIdentity("The Art of Hustling", "Dj SBU");
        BookObjectIdentity book2 = new BookObjectIdentity("The Art of Trading", "Dr Ref Wayne");
        BookObjectIdentity book3 = new BookObjectIdentity("Crime and Punishment", "Dr Nietche Djoviesky");
        BookObjectIdentity book4 = book3;

        assertEquals(book.hashCode(), -1117918411);
        assertEquals(book2.hashCode(), -178128203);

        //book4 and book3 point to the same object therefore their hashcode is identical
        assertEquals(book3.hashCode(), -668276722);
        assertEquals(book4.hashCode(), -668276722);
    }
}